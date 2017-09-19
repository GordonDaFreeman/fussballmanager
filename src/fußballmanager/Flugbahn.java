package fuﬂballmanager;

public class Flugbahn {
	//Steigung m
	//Y-Achsen abschnitt b
	//Definitionsbereich x1 und x2 + y1 und y2
	
	double m,b;
	//double x1,x2,y1,y2;
	
	public Flugbahn(Position p1,Position p2) {
		m = (p1.y-p2.y)/(p1.x-p2.x);
		b = p1.y+m*p1.x;
	}
	
	//Moritz mach das mal :D
	public double getDistancToPosition(Position p){
		return 0;
	}
}
