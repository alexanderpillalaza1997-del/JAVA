package universidad.principal;

public class Laboratorio {
	private String nombreLab;
    private int capacidad;
    private boolean equiposEncendidos;
    

    public Laboratorio(String nombreLab, int capacidad) {
        this.nombreLab = nombreLab;
        this.capacidad = capacidad;
        this.equiposEncendidos = false;
    }
    
    public void abrirLaboratorio() {
        this.equiposEncendidos = true;
        System.out.println("El laboratorio " + this.nombreLab + " ha sido abierto. ¿Equipos encendidos? " + this.equiposEncendidos);
    }
    
    public void mostrarInformacion() {
        System.out.println("--- Info Lab: " + this.nombreLab + " | Capacidad: " + this.capacidad + " personas ---");
    }

}
