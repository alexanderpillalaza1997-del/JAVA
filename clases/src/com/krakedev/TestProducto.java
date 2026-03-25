package com.krakedev;

public class TestProducto {
	 public static void main(String[] args) {

	      
	        Producto productoA = new Producto();
	        Producto productoB = new Producto();
	        Producto productoC = new Producto();

	      
	        productoA.nombre = "Paracetamol";
	        productoA.descripcion = "Alivia dolor y fiebre";
	        productoA.precio = 2.50f;
	        productoA.stockActual = 100;

	        productoB.nombre = "Ibuprofeno";
	        productoB.descripcion = "Antiinflamatorio";
	        productoB.precio = 3.75f;
	        productoB.stockActual = 80;

	        productoC.nombre = "Jarabe para la tos";
	        productoC.descripcion = "Alivia la tos seca";
	        productoC.precio = 5.20f;
	        productoC.stockActual = 50;

	       
	        System.out.println("PRODUCTO A");
	        System.out.println(productoA.nombre + " - " + productoA.descripcion + 
	                           " - $" + productoA.precio + " - Stock: " + productoA.stockActual);

	        System.out.println("\nPRODUCTO B");
	        System.out.println(productoB.nombre + " - " + productoB.descripcion + 
	                           " - $" + productoB.precio + " - Stock: " + productoB.stockActual);

	        System.out.println("\nPRODUCTO C");
	        System.out.println(productoC.nombre + " - " + productoC.descripcion + 
	                           " - $" + productoC.precio + " - Stock: " + productoC.stockActual);
	    }

}
