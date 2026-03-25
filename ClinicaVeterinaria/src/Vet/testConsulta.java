package Vet;

public class testConsulta {
	
	public static void main(String[] args) {
	
		  System.out.println("=== PRUEBA CONSULTA ===");

	        Consulta consulta1 = new Consulta(
	                "15/03/2026",
	                "Dolor estomacal",
	                "Gastritis leve",
	                199,
	                true
	        );

	        System.out.println(consulta1.toString());

	        System.out.println("Categoría de costo: " + consulta1.calcularCategoriaCosto());
	        System.out.println("¿Es crítica?: " + consulta1.esCritica());

	 
	        Consulta consulta2 = new Consulta(
	                "",        
	                "",        
	                null,      
	                -50,       
	                true
	        );

	        System.out.println("\n=== PRUEBA CON DATOS INVÁLIDOS ===");
	        System.out.println(consulta2.toString());
	        System.out.println("Categoría de costo: " + consulta2.calcularCategoriaCosto());
	        System.out.println("¿Es crítica?: " + consulta2.esCritica());
	    }
	}
		
	

