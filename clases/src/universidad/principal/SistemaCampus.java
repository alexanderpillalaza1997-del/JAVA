package universidad.principal;

	import universidad.Estudiante;
	import universidad.Laboratorio;

	public class SistemaCampus {

	    public static void main(String[] args) {

	    
	        Estudiante estudiante1 = new Estudiante("Ana Gómez", "A012345", "Ingeniería en Sistemas", 5);
	        Estudiante estudiante2 = new Estudiante("Carlos Ruiz", "B067890", "Arquitectura", 2);

	        Laboratorio lab = new Laboratorio("Laboratorio de Redes Cisco", 30);

	     
	        lab.mostrarInformacion();
	        lab.abrirLaboratorio();

	        estudiante1.presentarse();
	        estudiante1.estudiar();

	        estudiante2.presentarse();
	    }
	}



