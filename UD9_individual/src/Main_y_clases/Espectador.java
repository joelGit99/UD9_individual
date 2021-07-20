package Main_y_clases;

/**
 * Clase para crear espectadores
 * @author Joel
 *
 */

public class Espectador {
	// Atributos
	private String nombre;
	private int edad;
	private double dinero;
	// Constructores
	public Espectador(String nombre, int edad, double dinero) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.dinero = dinero;
	}
	
	
	// Métodos
	
	// Getters y setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public double getDinero() {
		return dinero;
	}
	public void setDinero(double dinero) {
		this.dinero = dinero;
	}
	
}
