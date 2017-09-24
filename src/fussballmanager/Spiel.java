package fussballmanager;

import java.math.RoundingMode;
import java.text.DecimalFormat;

import java.text.NumberFormat;
import java.util.Random;

import fussballmanager.personen.*;

public class Spiel {
	int spielzeit;
	int verlängerung;
	public Team heimteam;
	public Team auswärtsteam;
	Schiedsrichter schiri;
	public Ball b;
	// true = heim | false = auswärts
	boolean ballBesitz;

	public Spiel(Team heim, Team aus, Schiedsrichter s) {
		this.heimteam = heim;
		this.auswärtsteam = aus;
		this.schiri = s;
		ballBesitz = Math.random() < 0.5 ? true : false;
		spielzeit = 0;
		heimteam.setPositions(true);
		auswärtsteam.setPositions(false);
		b = new Ball();
		if (ballBesitz) {
			b.s = heimteam.spieler[9];
			heimteam.spieler[9].setBall(b);
		} else {
			b.s = auswärtsteam.spieler[9];
			auswärtsteam.spieler[9].setBall(b);
		}
	}

	public void tick() {
		spielzeit++;
		movePhase();
		attackPhase();
		torPhase();
	}

	private void movePhase() {
		Team ballteam;
		Team nichtballteam;
		if (ballBesitz) {
			ballteam = heimteam;
			nichtballteam = auswärtsteam;
		} else {
			ballteam = auswärtsteam;
			nichtballteam = heimteam;
		}
		for (Spieler s : ballteam.spieler) {
			double d = s.geschwindigkeit;
			if (s.hasBall())
				d -= 1;
			s.p.moveTo(nichtballteam.torwart.p, d);
		}
		for (Spieler s : nichtballteam.spieler) {
			String a = s.p.toString();
			s.p.moveTo(b.s.p, s.geschwindigkeit);
		}
	}

	private void attackPhase() {
		Team ballteam;
		Team nichtballteam;
		if (ballBesitz) {
			ballteam = heimteam;
			nichtballteam = auswärtsteam;
		} else {
			ballteam = auswärtsteam;
			nichtballteam = heimteam;
		}
		for (Spieler s : ballteam.spieler) {
			if (s.hasBall()) {
				boolean weiter = true;
				for (Spieler g : nichtballteam.spieler) {
					if (weiter)
						if (s.p.getDistance(g.p) < 0.5) {
							if (g.getAttack() > s.getDef()) {
								int rng = new Random().nextInt(100);
								if (rng < 89) {
									// Ball wurde abgenommen
									Main.tf.addText(s.getname() + " gab Ball an " + g.getname());
									g.takeBall(s);
									s.motivation -= 20;
									ballWechsel();
								} else if (rng < 90) {

								} else if (rng < 101) {
									Spieler t = null;
									double d = 200;
									for (Spieler temp : ballteam.spieler) {
										if (s.p.getDistance(temp.p) < d && !temp.equals(s)) {
											d = s.p.getDistance(temp.p);
											t = temp;
										}
									}
									Flugbahn fb = new Flugbahn(s.p, t.p);
									boolean succes = false;
									for (Spieler temp : nichtballteam.spieler) {
										if (fb.isInRange(temp.p)) {
											// Pass wurde unterbrochen
											temp.takeBall(s);
											succes = true;
											ballWechsel();
											break;
										}
									}
									if (!succes) {
										// Ball wurde weg gepasst
										t.takeBall(s);
									}
								}
							} else {
								Spieler t = null;
								double d = 200;
								for (Spieler temp : ballteam.spieler) {
									if (s.p.getDistance(temp.p) < d && !temp.equals(s)) {
										d = s.p.getDistance(temp.p);
										t = temp;
									}
								}
								Flugbahn fb = new Flugbahn(s.p, t.p);
								boolean succes = false;
								for (Spieler temp : nichtballteam.spieler) {
									if (fb.isInRange(temp.p)) {
										// Pass wurde unterbrochen
										temp.takeBall(s);
										succes = true;
										ballWechsel();
										break;
									}
								}
								if (!succes) {
									// Ball wurde weg gepasst
									t.takeBall(s);
								}
							}
							//
							weiter = false;
						}
				}
				if (weiter) {
					double tordis = s.p.getDistance(nichtballteam.torwart.p);
					Spieler t = null;
					boolean ss = false;
					for (Spieler m : ballteam.spieler) {

						if (!m.equals(s)) {
							if (m.p.getDistance(nichtballteam.torwart.p) < tordis) {
								t = m;
								ss = true;
							}
						}
					}

					if (t != null && ss) {
						Flugbahn fb = new Flugbahn(s.p, t.p);
						boolean succes = false;
						for (Spieler temp : nichtballteam.spieler) {
							if (fb.isInRange(temp.p)) {
								// Pass wurde unterbrochen
								temp.takeBall(s);
								succes = true;
								ballWechsel();
								break;
							}
						}
						if (!succes) {
							Main.tf.addText(s.getname() + " passt Ball an " + t.getname());
							// Ball wurde weg gepasst
							t.takeBall(s);
						}
					}

				}
				break;
			}
		}
	}

	public void torPhase() {
		if (ballBesitz) {
			if (b.s.p.getDistance(auswärtsteam.torwart.p) < 5) {
				tor();
			}
		} else {
			if (b.s.p.getDistance(heimteam.torwart.p) < 5) {
				tor();
			}
		}
	}

	public void tor() {
		if (ballBesitz) {
			heimteam.tore++;
			Main.tf.addText("Heimteam punktet!");
			ballWechsel();
			auswärtsteam.spieler[9].takeBall(b.s);
			heimteam.setPositions(true);
			auswärtsteam.setPositions(false);
		} else {
			auswärtsteam.tore++;
			Main.tf.addText("Auswärtsteam punktet!");
			ballWechsel();
			heimteam.spieler[9].takeBall(b.s);
			heimteam.setPositions(true);
			auswärtsteam.setPositions(false);
		}

	}

	public void ballWechsel() {
		ballBesitz = !ballBesitz;
	}

	public String getSpielzeit() {
		String r = "";
		NumberFormat numberFormat = new DecimalFormat("0");
		numberFormat.setRoundingMode(RoundingMode.DOWN);
		r += "Spielzeit: " + numberFormat.format(this.spielzeit / 60) + ":";
		if (spielzeit % 60 < 10) {
			r += "0";
		}
		r += spielzeit % 60;
		return r;
	}

}
