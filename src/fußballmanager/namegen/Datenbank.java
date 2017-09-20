package fu�ballmanager.namegen;

import java.util.ArrayList;

public class Datenbank {
	int n = 100;
	static int counterName = 0;
	static int counterVorname = 0;
	static int counterBeiname = 0;
	static String[] nameFeld;
	static ArrayList<String> namen = new ArrayList<String>();//
	static ArrayList<String> vornamen = new ArrayList<String>();
	static ArrayList<String> beinamen = new ArrayList<String>();
	
	public static String genName(){
		String r = "";
		namenListeF�llen();
		r += namen.get((int) (Math.random() * namen.size()));
		return r;
	}
	
	public static String genVorname(){
		String r = "";
		vornameFeldF�llen();
		r += vornamen.get((int) (Math.random() * vornamen.size()));
		return r;
	}

	static void namenListeF�llen(){
		namen.add("G�nter");//
		namen.add("Diabetes");
		namen.add("Dextrose");
		namen.add("Hackschnetzler");
		namen.add("Rasur");
		namen.add("Algrim");
		namen.add("Schmitz");
		namen.add("W�hl");
		namen.add("Hommers");
		namen.add("Dagoba");		
	}

	static void vornameFeldF�llen(){
		vornamen.add("G�nter");//
		vornamen.add("Gorden");
		vornamen.add("Dr.");
		vornamen.add("Profi");
		vornamen.add("Hommers");
		vornamen.add("Metti");
		vornamen.add("Moriz");
		vornamen.add("L�on");
		vornamen.add("Hommers");
		vornamen.add("Willi");
	}
}
