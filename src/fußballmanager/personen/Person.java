package fußballmanager.personen;

import fußballmanager.Team;

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
}
