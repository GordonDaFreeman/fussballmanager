package fuﬂballmanager.nameGen;
public class Person {
	
	String name;
	String vorname;
	int gebJahr;
	
	public Person(){
	}
	
	public Person(String fp_name, String fp_vorname, int fp_gebJahr){
		name	=	fp_name;
		vorname	=	fp_vorname;
		gebJahr	=	fp_gebJahr;
	}

	public void gibNamenEin(String fp_name){
		name	=	fp_name;
	}
	
	public String gibNamenAus(){
		return name;
	}
}
