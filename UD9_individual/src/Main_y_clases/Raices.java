package Main_y_clases;

import javax.swing.JOptionPane;

/**
 * Clase para resolver ecuaciones de segundo grado
 * @author Joel
 *
 */

public class Raices {
	// Atributos
	public double a;
	public double b;
	public double c;
	
	// Constructores
	public Raices(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	// Métodos
	/**
	 * Método para mostrar las diferentes soluciones de la ecuación
	 */
	public void obtenerRaices() {
		if(tieneRaices()) {
			double solucion1 = (-b + Math.sqrt((b*b)-(4*a*c)))/(2*a);
			double solucion2 = (-b - Math.sqrt((b*b)-(4*a*c)))/(2*a);
			JOptionPane.showMessageDialog(null, "La primera solución es " + "(-b+√((b^2)-(4*a*c)))/(2*a) = " + solucion1);
			JOptionPane.showMessageDialog(null, "La segunda solución es " + "(-b-√((b^2)-(4*a*c)))/(2*a) = " + solucion2);
		} else if(tieneRaiz()) {
			obtenerRaiz();
		}
	}
	
	/**
	 * Método que muestra la única solución de la ecuación
	 */
	public void obtenerRaiz() {
			double solucion1 = (-b + Math.sqrt((b*b)-(4*a*c)))/(2*a);
			JOptionPane.showMessageDialog(null, "La única solución es " + "(-b+√((b^2)-(4*a*c)))/(2*a) = " + solucion1);
	}
	
	/**
	 * Método que devuelve el discriminante
	 * @return
	 */
	public double getDiscriminante() {
		double discriminante = (b*b)-4*a*c;
		return discriminante;
	}
	
	/**
	 * Método que devuelve si la ecuación tiene raíces
	 * @return
	 */
	public boolean tieneRaices() {
		if(getDiscriminante() >= 0) {
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * Método que devuelve si tiene raíz
	 * @return
	 */
	public boolean tieneRaiz() {
		if(getDiscriminante() == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * Método que calcula las diferentes soluciones
	 */
	public void calcular() {
		obtenerRaices();
	}
	// Getters y setters
}
