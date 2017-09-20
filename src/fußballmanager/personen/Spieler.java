package fuﬂballmanager.personen;

import java.util.Random;

import fuﬂballmanager.Position;
import fuﬂballmanager.namegen.Datenbank;

public class Spieler extends Person {
	int st‰rke;
	int verteidigung;
	int tore;
	int motivation;
	double geschwindigkeit;
	Position p;
	Ball b;
	
	public void setBall(Ball b){
		this.b = b;
	}
	
	public void takeBall(Spieler s){
		b = s.b;
		s.b = null;
	}

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
		this.vorname = Datenbank.genVorname();
		this.name = Datenbank.genName();
	}
}