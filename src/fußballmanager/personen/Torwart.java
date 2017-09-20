package fußballmanager.personen;

import java.util.Random;

import fußballmanager.namegen.Datenbank;

public class Torwart extends Spieler{
	
	public Torwart() {
		int random = new Random().nextInt(100);
		this.verteidigung = random;
		this.stärke = 100-random;
		this.geschwindigkeit = 4+Math.random()*2;
		this.vorname = Datenbank.genVorname();
		this.name = Datenbank.genName();
	}

}
