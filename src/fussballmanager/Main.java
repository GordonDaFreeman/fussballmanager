package fussballmanager;

import fussballmanager.gui.SpielFrame;
import fussballmanager.gui.TickerFrame;
import fussballmanager.personen.Schiedsrichter;

public class Main {
	static Team t1;
	static Team t2;
	static Schiedsrichter schiri;
	static Spiel spiel;
	public static TickerFrame tf;
	
	public static void main(String[] args) {
		t1 = new Team();
		t2 = new Team();
		schiri = new Schiedsrichter();
		spiel = new Spiel(t1,t2,schiri);
		SpielFrame sf = new SpielFrame(spiel);
		tf = new TickerFrame(spiel);
		sf.setVisible(true);
		tf.setVisible(true);
		for(int i = 0; i < 5400; i++){
			spiel.tick();
			System.out.println(spiel.getSpielzeit());
			sf.refresh();
			tf.refresh();
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println(spiel.heimteam.tore+":"+spiel.auswärtsteam.tore);
	}
	
}
