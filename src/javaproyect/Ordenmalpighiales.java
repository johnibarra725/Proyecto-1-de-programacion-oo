package javaproyect;

public class Ordenmalpighiales extends Dominio {
	
	private String familias;
	private String caracteristicas;

	public Ordenmalpighiales(String familias, String caracteristicas) {
		super("Malpighiales");
		this.familias = familias;
		this.caracteristicas = caracteristicas;
	}

	public String getFamilias() {
		return familias;
	}
	
	
    public String getCaracteristicas() {
		return caracteristicas;
	}

	public void setCaracteristicas(String caracteristicas) {
		this.caracteristicas = caracteristicas;
	}

	@Override
	public String toString() {
		return super.toString()+"\nfamilia: " + familias + "\ncaracteristicas: "+caracteristicas;
	}


	
	

}
