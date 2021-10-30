package javaproyect;

public class Familiaeuphorbiaceae extends Dominio {
	
	
	private String genero;
	private String especie;
	private String caracteristicas;
	
	public Familiaeuphorbiaceae(String genero, String especie, String caracteristicas) {
		super("Euphorbiaceae");
		this.genero = genero;
		this.especie = especie;
		this.caracteristicas = caracteristicas;
	}
	public String getGenero() {
		return genero;
	}

	public String getEspecie() {
		return especie;
	}
	
	
	public String getCaracteristicas() {
		return caracteristicas;
	}

	@Override
	public String toString() {
		return super.toString()+"\ngenero: " + genero + "\nespecie: " + especie + "\ncaracteristicas: "+caracteristicas;
	}
	
	
	

}
