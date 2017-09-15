package fuﬂballmanager.personen;

import java.util.Random;

public class Spieler extends Person {
	int st‰rke;
	int verteidigung;
	int tore;
	int motivation;

	public Spieler(int st‰rke, int verteidigung, int alter, String vorname,
			String name) {
		this.st‰rke = st‰rke;
		this.verteidigung = verteidigung;
		this.alter = alter;
		this.vorname = vorname;
		this.name = name;
	}

	public Spieler() {
		this.st‰rke = new Random().nextInt(100);
		this.verteidigung = new Random().nextInt(100);
		this.alter = new Random().nextInt(100);
		this.vorname = "Hans";
		this.name = "Wurst";
	}
}