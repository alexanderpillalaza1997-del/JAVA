package com.krakedev.demo.test;

import com.krakedev.demo.Producto;

public class TestProducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Producto prod1= new Producto(1,"Laptop");
		
		prod1.setDescripcion("Laptop Hp");
		prod1.setPeso(2.5);
		
		System.out.println("Codigo: "+ prod1.getCodigo());
		System.out.println("Nombre: "+ prod1.getNombre());
		System.out.println("Descripcion: "+ prod1.getDescripcion());
		System.out.println("Peso: "+ prod1.getPeso());
		

	}

}
