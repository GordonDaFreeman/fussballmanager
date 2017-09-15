package fuﬂballmanager.personen;

public class Trainer extends Person{
	int inspiration;
	int erfahrung = 0;
	
	public Trainer(String name, String vorname, int inspiration, int erfahrung){
		this.name = name;
		this.vorname = vorname;
		this.inspiration = inspiration;
		this.erfahrung = erfahrung;
	}
	
	public Trainer(){
		this.name ="Mustertrainer";
		this.vorname = "Max";
		this.inspiration = (int) (Math.random()*100);
	}
	
	public Trainer(String vorname, String name, int inspiration){
		this.name = name;
		this.vorname = vorname;
		this.inspiration = inspiration;
	}
	
	
	
	
}
