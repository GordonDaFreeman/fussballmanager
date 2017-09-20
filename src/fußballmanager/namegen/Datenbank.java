package fußballmanager.namegen;

import java.util.ArrayList;

public class Datenbank {
	int n = 100;
	static int counterName = 0;
	static int counterVorname = 0;
	static int counterBeiname = 0;
	static String[] nameFeld;
	static ArrayList<String> namen = new ArrayList<String>();//
	static String[] vornameFeld;
	static String[] beinameFeld;
	
	public static String genName(){
		String r = "";
		nameFeldFüllen();
		r += nameFeld[(int) (Math.random() * counterVorname)];
		return r;
	}
	
	public static String genVorname(){
		String r = "";
		vornameFeldFüllen();
		r += vornameFeld[(int) (Math.random() * counterVorname)];
		return r;
	}

	static void nameFeldFüllen(){
		namen.add("Günter");//
		namen.get(0);//
		nameFeld[counterName] = "Guenther";
		counterName++;
		nameFeld[counterName] = "Schmidt";
		counterName++;
		nameFeld[counterName] = "Goldbach";
		counterName++;
		nameFeld[counterName] = "Schmitz";
		counterName++;
		nameFeld[counterName] = "Smith";
		counterName++;
		nameFeld[counterName] = "Wambach";
		counterName++;
		nameFeld[counterName] = "Kirfel";
		counterName++;
		nameFeld[counterName] = "Steinberg";
		counterName++;
		nameFeld[counterName] = "Siegfeld";
		counterName++;
		nameFeld[counterName] = "Monissen";
		counterName++;
		nameFeld[counterName] = "Ellering";
		counterName++;
		nameFeld[counterName] = "Hommers";
		counterName++;
		nameFeld[counterName] = "Wuehl";
		counterName++;
		nameFeld[counterName] = "Diabetis";
		counterName++;
		nameFeld[counterName] = "Flock";
		counterName++;
		nameFeld[counterName] = "Krause";
		counterName++;
		nameFeld[counterName] = "Kappa";
		counterName++;
		nameFeld[counterName] = "Eddingston";
		counterName++;
		nameFeld[counterName] = "Bayern";
		counterName++;
		nameFeld[counterName] = "Algrim";
		counterName++;
		nameFeld[counterName] = "D. Lümmeltüte";
		counterName++;
		nameFeld[counterName] = "Skywalker";
		counterName++;
		nameFeld[counterName] = "Wurst";
		counterName++;
		nameFeld[counterName] = "Rasur";
		counterName++;
		nameFeld[counterName] = "Sack";
		counterName++;
		nameFeld[counterName] = "Hinten";
		counterName++;
		nameFeld[counterName] = "Hackschnetzler";
		counterName++;
		nameFeld[counterName] = "Binzen";
		counterName++;
		nameFeld[counterName] = "Pfeifer";
		counterName++;
		nameFeld[counterName] = "Merkel";
		
	}

	static void beinameFeldFüllen(){
		beinameFeld[counterBeiname] = " Junior";
		counterBeiname++;
		beinameFeld[counterBeiname] = " Senior";
		counterBeiname++;
		beinameFeld[counterBeiname] = " Heinz";
		counterBeiname++;
		beinameFeld[counterBeiname] = " von";
		counterBeiname++;
		beinameFeld[counterBeiname] = " von und zu";
		counterBeiname++;
		int help = counterBeiname;
		for(int i = 0; i < help; i++){
			beinameFeld[counterBeiname] = "";
			counterBeiname++;
		}
	}
	
	static void vornameFeldFüllen(){
		vornameFeld[counterVorname] = "Anton";
		counterVorname++;
		vornameFeld[counterVorname] = "Ralph";
		counterVorname++;
		vornameFeld[counterVorname] = "Hardy";
		counterVorname++;
		vornameFeld[counterVorname] = "Peter";
		counterVorname++;
		vornameFeld[counterVorname] = "Ralf";
		counterVorname++;
		vornameFeld[counterVorname] = "Dr. Med.";
		counterVorname++;
		vornameFeld[counterVorname] = "Gordon";
		counterVorname++;
		vornameFeld[counterVorname] = "Gorden";
		counterVorname++;
		vornameFeld[counterVorname] = "Moritz";
		counterVorname++;
		vornameFeld[counterVorname] = "Dr.";
		counterVorname++;
		vornameFeld[counterVorname] = "Max";
		counterVorname++;
		vornameFeld[counterVorname] = "Dextrose";
		counterVorname++;
		vornameFeld[counterVorname] = "Willi";
		counterVorname++;
		vornameFeld[counterVorname] = "Frida";
		counterVorname++;
		vornameFeld[counterVorname] = "Zoey";
		counterVorname++;
		vornameFeld[counterVorname] = "Matthias";
		counterVorname++;
		vornameFeld[counterVorname] = "Leon";
		counterVorname++;
		vornameFeld[counterVorname] = "Hommers";
		counterVorname++;
		vornameFeld[counterVorname] = "Philipp";
		counterVorname++;
		vornameFeld[counterVorname] = "Chris";
		counterVorname++;
		vornameFeld[counterVorname] = "Eddy";
		counterVorname++;
		vornameFeld[counterVorname] = "Oliver";
		counterVorname++;
		vornameFeld[counterVorname] = "Sahra";
		counterVorname++;
		vornameFeld[counterVorname] = "Lisa";
		counterVorname++;
		vornameFeld[counterVorname] = "Simon";
		counterVorname++;
		vornameFeld[counterVorname] = "Ben";
		counterVorname++;
		vornameFeld[counterVorname] = "Kevin";
		counterVorname++;
		vornameFeld[counterVorname] = "Luschia";
		counterVorname++;
		vornameFeld[counterVorname] = "Hans";
		counterVorname++;
		vornameFeld[counterVorname] = "Klaus";
	}
}
