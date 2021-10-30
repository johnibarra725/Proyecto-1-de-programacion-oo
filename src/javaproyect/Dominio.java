package javaproyect;

public abstract class Dominio {

	
//Atributos

	 String tipoplanta;

public Dominio(String tipoplanta) {
	super();
	this.tipoplanta = tipoplanta;
}

@Override
public String toString() {
	return "Tipo de planta: " + tipoplanta;
}




	
       
	
	
	
}
