package com.krakedev;

public class TestPersona {

	public static void main(String[] args) {
		// Esto es un comentario
		Persona p; // 1. Declaro una variable llamada p de tipo Persona
		p = new Persona(); // 2. Instancio un objeto Persona y referencia con p
		Persona p2 = new Persona();

		// 3. Accedo a los atributos
		System.out.println("nombre:" + p.nombre);
		System.out.println("edad:" + p.edad);
		System.out.println("estatura:" + p.estatura);

		// 4. Modificar los atributos
		p.nombre = "Mario";
		p.edad = 45;
		p.estatura = 1.56;

		System.out.println("-----------------------");
		// 5. Accedo a los atributos
		System.out.println("nombre:" + p.nombre);
		System.out.println("edad:" + p.edad);
		System.out.println("estatura:" + p.estatura);

		p2.nombre = "Angelina";

		System.out.println("_________");
		System.out.println("p.nombre:" + p.nombre);
		System.out.println("p2.nombre:" + p2.nombre);

	}

}
