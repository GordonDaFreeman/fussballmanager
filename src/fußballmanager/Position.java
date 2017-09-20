package fuﬂballmanager;

public class Position {
	
	double x,y;
	
	public Position(double x,double y){
		this.x = x;
		this.y = y;
	}
	
	//Berechnung der Distanz zwischen zwei Punkten/Positionen mittels Satz des Pytagoras
	public double getDistance(Position p){
		double a,b;
		a = Math.abs(x-p.x);
		b = Math.abs(y-p.y);
		return Math.sqrt(a*a+b*b);
	}
	
	public void moveTo(Position t,double d){
		double cosT = (x - t.x)/getDistance(t);
		double cosA = (y - t.y)/getDistance(t);
		double ax = cosT*d;
		double ay = cosA*d;
		x += ax;
		y += ay;
	}
}
