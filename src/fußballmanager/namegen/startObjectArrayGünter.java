package fußballmanager.namegen;
public class startObjectArrayGünter {
	static boolean randomNames = true;

	public static void main(String[] args) {

		DatenKlasse util = new DatenKlasse();
		Datenbank datenbank = new Datenbank();
		datenbank.nameFeldFüllen();
		datenbank.vornameFeldFüllen();
		datenbank.beinameFeldFüllen();

		if (randomNames == true) {
			int anz_ran = (int) (Math.random() * util.anz) + 1;
			for (int i = 0; i < anz_ran; i++) {
				util.personenFeld[i] = new Person(
						datenbank.nameFeld[(int) (Math.random() * datenbank.counterName)],
						datenbank.vornameFeld[(int) (Math.random() * datenbank.counterVorname)]
								+ datenbank.beinameFeld[(int) (Math.random() * datenbank.counterBeiname)],
						(int) (Math.random() * 100) + 1917);
				util.counter++;
			}
		} else {
			Person person0 = new Person("Guenter", "Ralph", 1960);
			util.personEinfuegen(person0);
			Person person1 = new Person("Guenter", "Dextrose", 1960);
			util.personEinfuegen(person1);
			Person person2 = new Person("Guenter", "Ralph", 1962);
			util.personEinfuegen(person2);
			Person person3 = new Person("GottImperator", "Gordon", 2000);
			util.personEinfuegen(person3);
			Person person4 = new Person("MrInkompetenz", "Simon", 2001);
			util.personEinfuegen(person4);
			Person person5 = new Person("Ellering", "Moritz", 2001);
			util.personEinfuegen(person5);
		}

		System.out.println("Normales Feld: ");
		util.ausgabeFeld();
		System.out.println();

		System.out.println("SortUp Feld: ");
		util.sortFeldUp();
		util.ausgabeFeld();
		System.out.println();

		System.out.println("SortDown Feld: ");
		System.out.println();
		util.sortFeldDown();
		util.ausgabeFeld();
		System.out.println();
	}
}
