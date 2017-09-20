package fuﬂballmanager.namegen;
public class DatenKlasse {
	final int anz = 10;
	int counter;
	Person[] personenFeld;

	public DatenKlasse() {
		counter = 0;
		personenFeld = new Person[anz];
	}

	public void personEinfuegen(Person fp_person) {
		if (counter < anz) {
			personenFeld[counter] = fp_person;
			counter++;
		} else {
			System.out.println("Feld ist Voll!");
		}
	}

	public int vergleicheFE(int i, int j) {
		if (personenFeld[i].name.compareToIgnoreCase(personenFeld[j].name) < 0) {
			return -1;
		} else {
			if (personenFeld[i].name.compareToIgnoreCase(personenFeld[j].name) > 0) {
				return 1;
			} else {
				if (personenFeld[i].vorname
						.compareToIgnoreCase(personenFeld[j].vorname) < 0) {
					return -1;
				} else {
					if (personenFeld[i].gebJahr < personenFeld[j].gebJahr) {
						return -1;
					} else {
						return 1;
					}
				}
			}
		}
	}

	public void tauscheFE(int i, int j) {
		Person speicher = personenFeld[i];
		personenFeld[i] = personenFeld[j];
		personenFeld[j] = speicher;
	}

	public void sortFeldUp() {
		boolean swapped = true;
		int ergebnis, j;
		int i = counter - 1;

		while (swapped && i > 0) {
			swapped = false;
			for (j = 0; j < i; j++) {
				ergebnis = vergleicheFE(j, j + 1);
				if (ergebnis > 0) {
					tauscheFE(j, j + 1);
					swapped = true;
				}
			}
			i--;
		}
	}

	public void sortFeldDown() {
		boolean swapped = true;
		int ergebnis, j;
		int i = counter - 1;

		while (swapped && i > 0) {
			swapped = false;
			for (j = 0; j < i; j++) {
				ergebnis = vergleicheFE(j, j + 1);
				if (ergebnis < 0) {
					tauscheFE(j, j + 1);
					swapped = true;
				}
			}
			i--;
		}
	}

	public void ausgabeFeld() {
		if (counter > 0) {
			for (int i = 0; i < counter; i++) {
				System.out.println("Name: " + personenFeld[i].name
						+ "   Vorname: " + personenFeld[i].vorname
						+ "   Geburtsjahr:" + personenFeld[i].gebJahr);
			}
		} else {
			System.out.println("Feld ist leer!");
		}
	}

}
