package com.krakedev;

public class TestProducto {
	 public static void main(String[] args) {

	      
	        Producto productoA = new Producto();
	        Producto productoB = new Producto();
	        Producto productoC = new Producto();

	      
	        productoA.setNombre ( "Paracetamol");
	        productoA.setDescripcion ( "Alivia dolor y fiebre");
	        productoA.setPrecio ( 2.50f);
	        productoA.setStockActual ( 100);

	        productoB.setNombre ("Ibuprofeno");
	        productoB.setDescripcion ( "Antiinflamatorio");
	        productoB.setPrecio (3.75f);
	        productoB.setStockActual (80);

	        productoC.setNombre ( "Jarabe para la tos");
	        productoC.setDescripcion ( "Alivia la tos seca");
	        productoC.setPrecio ( 5.20f);
	        productoC.setStockActual ( 50);

	       
	        System.out.println("PRODUCTO A");
	        System.out.println(productoA.getNombre() + " - " + productoA.getDescripcion() + 
	                           " - $" + productoA.getPrecio() + " - Stock: " + productoA.getStockActual());

	        System.out.println("\nPRODUCTO B");
	        System.out.println(productoB.getNombre() + " - " + productoB.getDescripcion() + 
	                           " - $" + productoB.getPrecio() + " - Stock: " + productoB.getStockActual());

	        System.out.println("\nPRODUCTO C");
	        System.out.println(productoC.getNombre() + " - " + productoC.getDescripcion() + 
	                           " - $" + productoC.getPrecio() + " - Stock: " + productoC.getStockActual());
	    }

}
