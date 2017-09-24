package fussballmanager.personen;

import java.util.Random;

import fussballmanager.Position;
import fussballmanager.namegen.Datenbank;

public class Spieler extends Person {
	int stärke;
	int verteidigung;
	int tore;
	public int motivation;
	public double geschwindigkeit;
	public Position p;
	Ball b;
	int karte = 0;
	
	public int getAttack() {
		return (int) (stärke+(0.2*motivation));
	}
	
	public int getDef() {
		return (int) (verteidigung+(0.2*motivation));
	}
	
	
	public void setBall(Ball b){
		this.b = b;
	}
	
	public void takeBall(Spieler s){
		b = s.b;
		b.s = s;
		s.b = null;
	}

	public Spieler(int stärke, int verteidigung, int alter, String vorname,
			String name) {
		this.stärke = stärke;
		this.verteidigung = verteidigung;
		this.alter = alter;
		this.vorname = vorname;
		this.name = name;
	}
	
	public Spieler() {
		int random = new Random().nextInt(100);
		this.verteidigung = random;
		this.stärke = 100-random;
		this.geschwindigkeit = 4+Math.random()*2;
		this.vorname = Datenbank.genVorname();
		this.name = Datenbank.genName();
		p = new Position(0,0);
	}

	public boolean hasBall() {
		if(b!=null) return true;
		return false;
	}
}
