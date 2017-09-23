package fussballmanager.personen;

import fussballmanager.namegen.Datenbank;

public class Trainer extends Person{
	int inspiration;
	int erfahrung = 0;
	
	public Trainer(){
		this.name = Datenbank.genName();
		this.vorname = Datenbank.genVorname();
		this.inspiration = (int) (Math.random()*100);
	}
	
	public Trainer(String vorname, String name, int inspiration){
		this.name = name;
		this.vorname = vorname;
		this.inspiration = inspiration;
	}
	
	
	
	
}
