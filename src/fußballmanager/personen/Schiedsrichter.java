package fußballmanager.personen;

import fußballmanager.namegen.Datenbank;

public class Schiedsrichter extends Person{
	public Schiedsrichter(){
		name = Datenbank.genName();
		vorname = Datenbank.genVorname();
	}
}
