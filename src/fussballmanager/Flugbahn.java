package fussballmanager;

public class Flugbahn {
	//Steigung m
	//Y-Achsen abschnitt b
	//Definitionsbereich x1 und x2 + y1 und y2
	
	double m,b;
	Position p1,p2;
	
	public Flugbahn(Position p1,Position p2) {
		this.p1 = p1;
		this.p2 = p2;
		m = (p1.y-p2.y)/(p1.x-p2.x);
		b = p1.y+m*p1.x;
	}
	
	public double f(double x){
		return m*x+b;
	}
	
	public boolean isInRange(Position p){
		if(p1.x<
				p.x
				&&p2.x>p.x
				||p1.x>p.x
				&&p2.x<p.x){
			//Punkt liegt im Definitionsbereich
			if(Math.abs(p.y-f(p.x))<0.5){
				return true;
			}
		}
		return false;
	}
}
