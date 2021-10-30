package javaproyect;

public class Clasemagnoliopsida extends Dominio{


	private String ordenes;
	private String familias;
	private String especies;
	private String caracteristicas;
	
	public Clasemagnoliopsida(String ordenes, String familias, String especies, String caracteristicas) {
		super("Magnoliopsida");
		this.ordenes = ordenes;
		this.familias = familias;
		this.especies = especies;
		this.caracteristicas = caracteristicas;
	}
	public String getOrdenes() {
		return ordenes;
	}
	
	public String getFamilias() {
		return familias;
	}

	public String getEspecies() {
		return especies;
	}
	
	
	public String getCaracteristicas() {
		return caracteristicas;
	}

	@Override
	public String toString() {
		return super.toString()+"\norden: " + ordenes + "\nfamilia: " + familias + "\nespecies: " + especies+"\ncaracteristicas: "
	+caracteristicas;
	}
	
	
	
	
	
	
	
}
