package fussballmanager;

import fussballmanager.namegen.Datenbank;
import fussballmanager.personen.*;

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
	
	public Team(){
		this.name = Datenbank.genName()+"'s Team";
		fülleTeam();
		addTrainer();
	}
	
	public void fülleTeam(){
		//FÃ¼lle Feldspieler
		for(int i =0; i<10;i++){
			spieler[i] = new Spieler();
		}
		//FÃ¼lle Torwart
		torwart = new Torwart();
	}
	
	public void addTrainer(){
		trainer = new Trainer();
	}
	
	public void setPositions(boolean heim){
		if (heim){
			torwart.p.x = 5;
			torwart.p.y = 22.5;
			for(int i = 0; i < 3; i++){
				spieler[i].p.x = 20;
				spieler[i].p.y = 7.5+15*i;
			}
			for(int i = 3; i < 7; i++){
				spieler[i].p.x = 38;
				spieler[i].p.y =5.625+11.25*i;
			}
			for(int i = 7; i < 9; i++){
				spieler[i].p.x = 52;
				spieler[i].p.y =11.25+22.5*i;
			}
			spieler[9].p.x=44;
			spieler[9].p.y=45;
		}else{
			torwart.p.x = 90-5;
			torwart.p.y = 22.5;
			for(int i = 0; i < 3; i++){
				spieler[i].p.x = 90-20;
				spieler[i].p.y = 7.5+15*i;
			}
			for(int i = 3; i < 7; i++){
				spieler[i].p.x = 90-38;
				spieler[i].p.y =5.625+11.25*i;
			}
			for(int i = 7; i < 9; i++){
				spieler[i].p.x = 90-52;
				spieler[i].p.y =11.25+22.5*i;
			}
			spieler[9].p.x=46;
			spieler[9].p.y=45;
		}
			
	}
	
	public boolean isInTeam(Person p){
		for(Person pp:spieler){
			if(p.equals(pp)) return true;
		}
		if(torwart.equals(p)) return true;
		return false;
	}
}

