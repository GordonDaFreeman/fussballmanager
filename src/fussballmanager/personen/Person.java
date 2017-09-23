package fussballmanager.personen;

import fussballmanager.Team;

public abstract class Person {
	int alter;
	Team team;
	String name,vorname;
	
	public void setTeam(Team team){
		this.team = team;
	}
	
	public Team getTeam(){
		return team;
	}
	
	public boolean isInTeam(Person p){
		return team.isInTeam(p);
	}
	
	public String getname() {
		return vorname + " " + name;
	}
}
