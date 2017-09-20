package fußballmanager.personen;

import fußballmanager.Team;
import fußballmanager.namegen.Datenbank;

public abstract class Person {
	int alter;
	Team team;
	String name,vorname;
	
	public void setTeam(Team team){
		this.team = team;
	}
	
	public String genName(){
		String r = "";
		Datenbank data = new Datenbank();
		data.nameFeldFüllen();
		data.nameFeld[(int) (Math.random() * data.counterVorname)];


	}
	
	public String genVorname(Datenbank d){
		String r = "";
		Datenbank data = new Datenbank();
		data.nameFeldFüllen();
		data.vornameFeld[(int) (Math.random() * data.counterVorname)];
	}
	
	public Team getTeam(){
		return team;
	}
	
	public boolean isInTeam(Person p){
		return team.isInTeam(p);
	}
}
