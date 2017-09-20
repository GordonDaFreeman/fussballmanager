package fuﬂballmanager;

import fuﬂballmanager.personen.*;

public class Team {
	String name;
	Trainer trainer;
	Spieler[] spieler = new Spieler[10];
	Torwart torwart;
	int siege;
	
<<<<<<< HEAD
	public Team(){
		
=======
	public boolean isInTeam(Person p){
		for(Person pp:spieler){
			if(p.equals(pp)) return true;
		}
		if(torwart.equals(p)) return true;
		return false;
>>>>>>> d6acf05b72f53607f222d077c1491dd1bb71add5
	}
}
