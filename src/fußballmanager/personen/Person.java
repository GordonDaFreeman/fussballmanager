package fu�ballmanager.personen;

import fu�ballmanager.Team;
import fu�ballmanager.namegen.Datenbank;

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
