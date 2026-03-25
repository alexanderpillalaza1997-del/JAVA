package com.krakedev;

public class TestAuto {
	
	   public static void main(String[] args) {

	      
	        Auto auto1 = new Auto();
	        Auto auto2 = new Auto();

	     
	        auto1.marca = "Toyota";
	        auto1.anio = 2020;
	        auto1.precio = 20000.50f;

	        auto2.marca = "Chevrolet";
	        auto2.anio = 2018;
	        auto2.precio = 15000.75f;

	    
	        System.out.println("AUTO 1");
	        System.out.println("Marca: " + auto1.marca);
	        System.out.println("Año: " + auto1.anio);
	        System.out.println("Precio: " + auto1.precio);

	        System.out.println("\nAUTO 2");
	        System.out.println("Marca: " + auto2.marca);
	        System.out.println("Año: " + auto2.anio);
	        System.out.println("Precio: " + auto2.precio);
	    }

}
