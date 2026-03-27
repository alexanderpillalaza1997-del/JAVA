package com.krakedev;

public class TestAuto {
	
	   public static void main(String[] args) {

	      
	        Auto auto1 = new Auto();
	        Auto auto2 = new Auto();

	     
	        auto1.setMarca ("Toyota");
	        auto1.setAnio (2020);
	        auto1.setPrecio (20000.50f);

	        auto2.setMarca ("Chevrolet");
	        auto2.setAnio (2018);
	        auto2.setPrecio (15000.75f);

	    
	        System.out.println("AUTO 1");
	        System.out.println("Marca: " + auto1.getMarca());
	        System.out.println("Año: " + auto1.getAnio());
	        System.out.println("Precio: " + auto1.getPrecio());

	        System.out.println("\nAUTO 2");
	        System.out.println("Marca: " + auto2.getMarca());
	        System.out.println("Año: " + auto2.getAnio());
	        System.out.println("Precio: " + auto2.getPrecio());
	    }

}
