package fussballmanager;

import java.math.RoundingMode;
import java.text.DecimalFormat;

import java.text.NumberFormat;

import fussballmanager.personen.*;

public class Spiel {
	int spielzeit;
	int verlängerung;
	Team heimteam;
	Team auswärtsteam;
	Schiedsrichter schiri;
	boolean werAnstoss;

	public Spiel(Team heim, Team aus, Schiedsrichter s) {
		this.heimteam = heim;
		this.auswärtsteam = aus;
		this.schiri = s;
		werAnstoss = ((int) Math.random()) == 0 ? true : false;
		spielzeit = 0;
	}

	public void tick() {
		spielzeit++;

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
