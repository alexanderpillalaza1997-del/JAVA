package universidad.principal;

public class Estudiante {


	private String nombre;
	private String matricula;
	private String carrera;
	private int semestre;
	
	public Estudiante(String nombre, String matricula,  String carrera, int semestre) {
		this.nombre = nombre;
		this.matricula = matricula;
		this.carrera = carrera;
		this.semestre = semestre;
	}
	
	public void presentarse() {
		System.out.println("Hola, soy " + nombre +" ,estudiante de " + carrera +" en el Semestre "+ semestre);
		
	}
	
    public void estudiar() {
   	
    	 System.out.println("El estudiante  " + nombre +" de la matricula  " + matricula +" esta estudiando para sus exmanes");
		
   	
    }


}


