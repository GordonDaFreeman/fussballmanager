package fußballmanager;

import fußballmanager.personen.*;

public class Team {
	String name;
	Trainer trainer;
	Spieler[] spieler = new Spieler[10];
	Torwart torwart;
	int siege = 0;
	
	public Team(String name){
		this.name = name;
		fülleTeam();
		addTrainer();
	}
	
	public void fülleTeam(){
		//Fülle Feldspieler
		for(int i =0; i<10;i++){
			spieler[i] = new Spieler();
		}
		//Fülle Torwart
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
