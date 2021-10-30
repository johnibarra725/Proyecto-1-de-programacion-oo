package javaproyect;

public class  Reinoplantae extends Dominio {

    private String grupos;
    private String division;
    private String clase;
    private String especies;
    private String caracteristicas;
    
	public Reinoplantae(String grupos, String division, String clase, String especies, String caracteristicas) {
		super("Plantae");
		this.grupos = grupos;
		this.division = division;
		this.clase = clase;
		this.especies = especies;
		this.caracteristicas =caracteristicas;
	}
	public String getGrupos() {
		return grupos;
	}

	public String getDivision() {
		return division;
	}
	
	public String getClase() {
		return clase;
	}

	public String getEspecies() {
		return especies;
	}
	
	
	public String getCaracteristicas() {
		return caracteristicas;
	}

	@Override
	public String toString() {
		return super.toString()+"\ngrupo: " + grupos + "\ndivision: " + division + "\nclase: " + clase + "\nespecie: "
				+ especies+"\ncaracteristicas: "+caracteristicas;
	}
	
    
    
    
    
    
    


	




	
	
	

	
	
	
	
}
