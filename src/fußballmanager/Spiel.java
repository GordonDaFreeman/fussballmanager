package fu�ballmanager;

import java.util.Random;

import fu�ballmanager.personen.Schiedsrichter;

public class Spiel {
	//Spielzeit wird in Sekunden
	int spielzeit;
	int verl�ngerung;
	Team heimteam;
	Team ausw�rtsteam;
	Schiedsrichter schiri;
	
	public void tick(){
		spielzeit++;
		int zufall = new Random().nextInt(100);
	}
}
