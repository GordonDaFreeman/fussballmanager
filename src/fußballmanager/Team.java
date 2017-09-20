package fu�ballmanager;

import fu�ballmanager.personen.*;

public class Team {
	String name;
	Trainer trainer;
	Spieler[] spieler = new Spieler[10];
	Torwart torwart;
	int siege = 0;
	
	public Team(String name){
		this.name = name;
		f�lleTeam();
		addTrainer();
	}
	
	public void f�lleTeam(){
		//F�lle Feldspieler
		for(int i =0; i<10;i++){
			spieler[i] = new Spieler();
		}
		//F�lle Torwart
		torwart = new Torwart();
	}
	
	public void addTrainer(){
		trainer = new Trainer();
	}
	
	public boolean isInTeam(Person p){
		for(Person pp:spieler){
			if(p.equals(pp)) return true;
		}
		if(torwart.equals(p)) return true;
		return false;
	}
}
