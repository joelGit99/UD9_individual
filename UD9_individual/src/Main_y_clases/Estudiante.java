package Main_y_clases;

import java.text.DecimalFormat;

/**
 * Clase para crear alumnos
 * @author Joel
 *
 */

public class Estudiante extends Persona implements Disponible {
	// Atributos por defecto
	private final double NOTA_DEF = 0.0;
	private DecimalFormat DF = new DecimalFormat("#.#");

	// Atributos
	private double nota;

	// Constructores
	public Estudiante() {
		super();
		this.nota = NOTA_DEF;
	}

	public Estudiante(String nombre, int edad, char sexo, double nota) {
		super(nombre, edad, sexo);
		// Si la nota es correcta, se asigna, sino, se pone el valor por defecto
		if(notaCorrecta(nota)) {
			this.nota = nota;
		} else {
			this.nota = NOTA_DEF;
		}

	}

	// Métodos
	
	// Método que comprueba si la nota es mayor o igual a 0 y menor o igual a 10
	private boolean notaCorrecta(double nota) {
		if(nota >= 0 && nota <= 10) {
			return true;
		} else {
			return false;
		}
	}
	
	// Método implementado de la interfaz Disponible, que depende de la probabilidad
	// retorna true o false
	@Override
	public boolean disponible() {
		double random = Math.random();

		if(random < 0.5) {
			return true;
		} else {
			return false;
		}
	}



	@Override
	public String toString() {
		if(sexo == 'H') {
			return "Nombre: " + nombre + "\n" +
					"Edad: " + edad + "\n" +
					"Sexo: " + "Masculino" + "\n" +
					"Nota: " + DF.format(nota) + "\n";	
		} else {
			return "Nombre: " + nombre + "\n" +
					"Edad: " + edad + "\n" +
					"Sexo: " + "Femenino" + "\n" +
					"Nota: " + DF.format(nota) + "\n";	
		}

	}

	// Getters y setters
	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}
	public char getSexo() {
		return sexo;
	}
}
