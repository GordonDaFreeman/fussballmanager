package fussballmanager.personen;

import fussballmanager.namegen.Datenbank;

public class Schiedsrichter extends Person{
	public Schiedsrichter(){
		name = Datenbank.genName();
		vorname = Datenbank.genVorname();
	}
}
