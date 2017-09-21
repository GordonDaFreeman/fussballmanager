package fußballmanager;

import fußballmanager.personen.Schiedsrichter;

public class Main {
	static Team t1;
	static Team t2;
	static Schiedsrichter schiri;
	static Spiel spiel;
	
	public static void main(String[] args) {
		t1 = new Team();
		t2 = new Team();
		schiri = new Schiedsrichter();
		spiel = new Spiel(t1,t2,schiri);
		for(int i = 0; i < 5400; i++){
			spiel.tick();
		//	try {
		//		Thread.sleep(200);
		//	} catch (InterruptedException e) {
				// TODO Auto-generated catch block
		//		e.printStackTrace();
		//	}
		}
		
	}
	
}
