package fu�ballmanager.personen;

import fu�ballmanager.Team;

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
}
