package fu�ballmanager.personen;

import java.util.Random;

import fu�ballmanager.namegen.Datenbank;

public class Torwart extends Spieler{
	
	public Torwart() {
		int random = new Random().nextInt(100);
		this.verteidigung = random;
		this.st�rke = 100-random;
		this.geschwindigkeit = 4+Math.random()*2;
		this.vorname = Datenbank.genVorname();
		this.name = Datenbank.genName();
	}

}
