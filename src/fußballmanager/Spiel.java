package fußballmanager;

import java.math.RoundingMode;
import java.text.DecimalFormat;

import java.text.NumberFormat;

import fußballmanager.personen.*;

public class Spiel {
	int spielzeit;
	int verlängerung;
	Team heimteam;
	Team auswärtsteam;
	Schiedsrichter schiri;
	Ball b;
	//true = heim | false = auswärts
	boolean ballBesitz;

	public Spiel(Team heim, Team aus, Schiedsrichter s) {
		this.heimteam = heim;
		this.auswärtsteam = aus;
		this.schiri = s;
		ballBesitz = ((int) Math.random()) == 0 ? true : false;
		spielzeit = 0;
		heimteam.setPositions(true);
		auswärtsteam.setPositions(false);
		b = new Ball();
		if(ballBesitz){
			b.s = heimteam.spieler[9];
		}else{
			b.s = auswärtsteam.spieler[9];
		}	
	}

	public void tick() {
		spielzeit++;
		movePhase();
		attackPhase();

	}
	
	private void movePhase(){
		Team ballteam;
		Team nichtballteam;
		if(ballBesitz){
			ballteam = heimteam;
			nichtballteam = auswärtsteam;
		}else{
			ballteam = auswärtsteam;
			nichtballteam = heimteam;
		}
		for(Spieler s:ballteam.spieler){
			double d = s.geschwindigkeit;
			if(s.hasBall()) d-=1;
			s.p.moveTo(nichtballteam.torwart.p, d);
		}
		for(Spieler s:nichtballteam.spieler){
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
									g.takeBall(s);
									s.motivation -= 20;
								}
								if (rng < 90) {

								}
								if (rng < 101) {
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

					if (t != null&&ss) {
						Flugbahn fb = new Flugbahn(s.p, t.p);
						boolean succes = false;
						for (Spieler temp : nichtballteam.spieler) {
							if (fb.isInRange(temp.p)) {
								// Pass wurde unterbrochen
								temp.takeBall(s);
								succes = true;
								break;
							}
						}
						if (!succes) {
							// Ball wurde weg gepasst
							t.takeBall(s);
						}
					}
				}
				break;
			}
		}
	}
	
	

	public String getSpielzeit() {
		String r = "";
		NumberFormat numberFormat = new DecimalFormat("0");
		numberFormat.setRoundingMode(RoundingMode.DOWN);
		r += "Spielzeit: " + numberFormat.format(this.spielzeit / 60) + ":";
		if (spielzeit % 60 < 10){
			r += "0";
		}
		r += spielzeit % 60;
		return r;
	}
	
	
}
