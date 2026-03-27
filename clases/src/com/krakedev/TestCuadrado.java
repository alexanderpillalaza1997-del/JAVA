package com.krakedev;

public class TestCuadrado {
	
	public static void main(String[] args) {
		
	Cuadrado r1= new Cuadrado();
	Cuadrado r2= new Cuadrado();
	Cuadrado r3= new Cuadrado();

	
	double areaR1;
	double areaR2;
	double areaR3;
	double perimetroR1;
	double perimetroR2;
	double perimetroR3;
	
	
	r1.setLado(10);
	r2.setLado(8);
	r3.setLado(5);

	
	areaR1=r1.calcularArea();
	areaR2=r2.calcularArea();
	areaR3=r3.calcularArea();
	
	perimetroR1=r1.calcularPerimetro();
	perimetroR2=r2.calcularPerimetro();
	perimetroR3=r3.calcularPerimetro();
	
	System.out.println("Area de r1: " +areaR1);
	System.out.println("Area de r2: " +areaR2);
	System.out.println("Area de r3: " +areaR3);
	
	System.out.println("Perimetro de r1: " +perimetroR1);
	System.out.println("Perimetro de r2: " +perimetroR2);
	System.out.println("Perimetro de r3: " +perimetroR3);
	

}


}
