package fuﬂballmanager;

import java.math.RoundingMode;
import java.text.DecimalFormat;

import java.text.NumberFormat;

import fuﬂballmanager.personen.*;

public class Spiel {
	int spielzeit;
	int verl‰ngerung;
	Team heimteam;
	Team ausw‰rtsteam;
	Schiedsrichter schiri;
	//true = heim | false = ausw‰rts
	boolean ballBesitz;

	public Spiel(Team heim, Team aus, Schiedsrichter s) {
		this.heimteam = heim;
		this.ausw‰rtsteam = aus;
		this.schiri = s;
		ballBesitz = ((int) Math.random()) == 0 ? true : false;
		spielzeit = 0;
	}

	public void tick() {
		spielzeit++;
		movePhase();
		attackPhase();

	}
	
	private void movePhase(){
		Team ballteam;
		Team nichtballteam;
		if(ballBesitz){
			ballteam = heimteam;
		}else{
			ballteam = ausw‰rtsteam;
		}
	}
	
	private void attackPhase(){
		
	}
	
	

	public String getSpielzeit() {
		String r = "";
		NumberFormat numberFormat = new DecimalFormat("0");
		numberFormat.setRoundingMode(RoundingMode.DOWN);
		r += "Spielzeit: " + numberFormat.format(this.spielzeit / 60) + ":";
		if (spielzeit % 60 < 10){
			r += "0";
		}
		r += spielzeit % 60;
		return r;
	}
	
	
}
