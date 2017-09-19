package fußballmanager.personen;

import fußballmanager.Position;
import fußballmanager.Team;

public abstract class Person {
	int alter;
	Team team;
	String name,vorname;
	Position p;
	
	public void setTeam(Team team){
		this.team = team;
	}
	
	public Team getTeam(){
		return team;
	}
}
