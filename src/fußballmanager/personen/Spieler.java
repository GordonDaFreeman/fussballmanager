package fuﬂballmanager.personen;

import java.util.Random;

public class Spieler extends Person {
	int st‰rke;
	int verteidigung;
	int tore;
	int motivation;
	double geschwindigkeit;

	public Spieler(int st‰rke, int verteidigung, int alter, String vorname,
			String name) {
		this.st‰rke = st‰rke;
		this.verteidigung = verteidigung;
		this.alter = alter;
		this.vorname = vorname;
		this.name = name;
	}
	
	public Spieler() {
		int random = new Random().nextInt(100);
		this.verteidigung = random;
		this.st‰rke = 100-random;
		this.geschwindigkeit = 4+Math.random()*2;
		this.vorname = "Hans";
		this.name = "Wurst";
	}
}