package javaproyect;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Principal {
	static ArrayList<Dominio> planta1 = new ArrayList<Dominio>();
	static ArrayList<Dominio> planta2 = new ArrayList<Dominio>();
	static ArrayList<Dominio> planta3 = new ArrayList<Dominio>();
	static ArrayList<Dominio> planta4 = new ArrayList<Dominio>();
	static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
		Documento documento = new Documento();
		documento.instrucciones();
		bienvenido();
		resultado();
		resultado2();
		resultado3();
		resultado4();
		}
	
	
	public static void bienvenido() {
		int op;
		String opcion;
		System.out.println("\nBienvenido a su aplicacion para clasificar plantas");
		do {
		do {
		System.out.println("\nQue clasificacion de plantas desea registrar");
		System.out.println("1. Reino"
				        +"\n2. Clase"
				        +"\n3. Familia"
				        +"\n4. Orden");
		op =Integer.parseInt(JOptionPane.showInputDialog("Escoja su opcion: ")) ;
		
		}while(op<1 || op>4);
		
		switch(op) {
		case 1: registrarreino();
		break;
		case 2: registrarclase();
		break;
		case 3: registrarfamilia(); 
		break;
		case 4: registrarorden(); 
		break;
		}
		opcion =JOptionPane.showInputDialog("Desea registrar otra clasificacion de plantas, si o no: ");
		}while(opcion.equals("si") || opcion.equals("Si"));
	}
	
	public static void registrarreino() {
		String grupos;
	    String division;
	    String clase;
	    String especies;
	    String caracteristicas;
	    
	    System.out.print("\nIngrese el grupo: ");
	    grupos = entrada.nextLine();
	    
	    System.out.print("Ingrese la division: ");
	    division = entrada.nextLine();
	    
	    System.out.print("Ingrese la clase: ");
	    clase = entrada.nextLine();
	    
	    System.out.print("Ingrese la especie: ");
	    especies = entrada.nextLine();
	    
	    System.out.print("Ingrese las caracteristicas: ");
	    caracteristicas = entrada.nextLine();
	    
	    Reinoplantae plantae = new Reinoplantae(grupos, division, clase, especies, caracteristicas);
	    planta1.add(plantae);
	    
	}
	
	public static void registrarclase() {
		String ordenes;
		String familias;
		String especies;
		String caracteristicas;
		
		System.out.print("\nIngrese la orden: ");
	    ordenes = entrada.nextLine();
	    
	    System.out.print("Ingrese la familia: ");
	    familias = entrada.nextLine();
	    
	    System.out.print("Ingrese la especie: ");
	    especies = entrada.nextLine();
	    
	    System.out.print("Ingrese las caracteristicas: ");
	    caracteristicas = entrada.nextLine();
	    
	    Clasemagnoliopsida clase = new Clasemagnoliopsida(ordenes, familias, especies, caracteristicas);
	    
	    planta2.add(clase);
		
		
	}
	
	public static void registrarfamilia() {
		
		String genero;
		String especie;
		String caracteristicas;
		
		System.out.print("\nIngrese el genero: ");
	    genero = entrada.nextLine();
	    
	    System.out.print("Ingrese la especie: ");
	    especie = entrada.nextLine();
	    
	    System.out.print("Ingrese las caracteristicas: ");
	    caracteristicas = entrada.nextLine();
		
	    Familiaeuphorbiaceae familia = new Familiaeuphorbiaceae(genero, especie, caracteristicas);
	    
	    planta3.add(familia);
		
	}
	
	public static void registrarorden() {
		
		String familias;
		String caracteristicas;
		
		System.out.print("\nIngrese la familia: ");
		familias = entrada.next();
		
		System.out.print("Ingrese las caracteristicas: ");
		caracteristicas = entrada.nextLine();
		
		Ordenmalpighiales orden = new Ordenmalpighiales(familias, caracteristicas);
		
		planta4.add(orden);
	}
		
		
		
	
	public static void resultado() {
		System.out.println("\nRegistro de plantas del reino: ");
		System.out.println("");
		for(Dominio ser: planta1) {
			
			System.out.println(ser.toString());
			System.out.println("");
		}
	}
	
	public static void resultado2() {
		System.out.println("\nRegistro de plantas de la clase: ");
		System.out.println("");
		for(Dominio ser1: planta2) {
			
			System.out.println(ser1.toString());
			System.out.println("");
		}
		
		
	}
	
    public static void resultado3() {
    	System.out.println("\nRegistro de plantas de la familia: ");
		System.out.println("");
		for(Dominio ser3: planta3) {
			
			System.out.println(ser3.toString());
			System.out.println("");
		}
    	
		
	}

    public static void resultado4() {
    	System.out.println("\nRegistro de plantas del orden: ");
		System.out.println("");
		for(Dominio ser4: planta4) {
			
			System.out.println(ser4.toString());
			System.out.println("");
		}
    	
	
}
	
	
	
	

}
