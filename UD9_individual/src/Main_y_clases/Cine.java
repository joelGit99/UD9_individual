package Main_y_clases;

import javax.swing.JOptionPane;

/**
 * Clase para crear cines
 * @author Joel
 *
 */

public class Cine {
	// Atributos
	private Pelicula peli;
	private double precio;
	private int[][] arrayNums = new int[8][9];
	private char[][] arrayLetras = new char[8][9];
	private char[][] arrayX = new char[8][9];
	private Espectador espectador;

	// Constructores
	public Cine(Pelicula peli, double precio) {
		this.peli = peli;
		this.precio = precio;
	}
	// Métodos
	
	/**
	 * Método para crear los asientos
	 */
	public void crearAsientos() {
		for (int i = 0; i < arrayNums[i].length; i++) {
			int num = 8;
			char letra = 'A';
			for (int j = 0; j < arrayNums[j].length; j++) {
				arrayLetras[i][j] = letra;
				arrayNums[i][j] = num;
				if(j == 2 || j == 6 || j == 8) {
					arrayX[i][j] = 'X';
				}
				arrayX[i][j] = '✓';
				letra++;
			}
			num--;
		}
	}
	
	/**
	 * Método para mostrar los asientos
	 */
	public void mostrarAsientos() {
		for (int i = 0; i < arrayNums.length; i--) {
			for (int j = 0; j < arrayLetras.length; j++) {
				System.out.print(arrayNums[i][j] + arrayLetras[i][j] + arrayX[i][j] + " ");
			}
			System.out.println();
		}
	}

	/**
	 * Método para pedir asiento
	 * @param asiento
	 * @param espectador
	 */
	public void pedirAsiento(String asiento, Espectador espectador) {
		int respuesta = JOptionPane.showConfirmDialog(null, "Introduce el asiento donde te quieres sentar");
		String respuestaString = Integer.toString(respuesta);
		String asientoArray = "";
		for (int i = 0; i < arrayNums.length; i++) {
			for (int j = 0; j < arrayLetras.length; j++) {
				String numString =  Integer.toString(arrayNums[i][j]);
				String letraString = Character.toString(arrayLetras[i][j]);
				String x = Character.toString(arrayX[i][j]);
				if(respuestaString.substring(1,1).equals(numString) && respuestaString.substring(2,2).equals(letraString)) {
					asientoArray = numString + letraString + x;
				}
			}
		}
		if(puedeVerPeli(espectador)) {
			if(asientoArray.substring(3).equals("X")) {
				JOptionPane.showMessageDialog(null, "Está ocupado! Ahora le asignamos un asiento libre");
				if(salaLibre()) {
					String asientoLibre = "";
					for (int i = 0; i < arrayNums.length; i++) {
						for (int j = 0; arrayX[i][j] != 'X' && j < arrayX.length; j++) {
							String numString =  Integer.toString(arrayNums[i][j]);
							String letraString = Character.toString(arrayLetras[i][j]);
							asientoLibre = numString + letraString;
							arrayX[i][j] = 'X';
						}
					}
					JOptionPane.showMessageDialog(null, "Su asiento es" + asientoLibre + ", disfrute de " + peli.getTitulo());

				} else {
					JOptionPane.showMessageDialog(null, "Lo sentimos, está todo ocupado");
				}
			} else {
				JOptionPane.showMessageDialog(null, "Está libre! Disfruta de " + peli.getTitulo());
			}
		} else {
			JOptionPane.showConfirmDialog(null, "No cumples los requisitos de edad o de dinero");
		}
	}
	
	// Método para comprobar si la sala está libre
	private boolean salaLibre() {
		boolean isSalaLibre = true;
		for (int i = 0; i < arrayX.length; i++) {
			for (int j = 0; j < arrayX.length; j++) {
				if(arrayX[i][j] == 'X') {
					isSalaLibre = false;
				} else {
					isSalaLibre = true;
				}
			}
		}
		return isSalaLibre;
	}
	
	// Método que comprueba si el espectador puede ver la peli
	private boolean puedeVerPeli(Espectador espectador) {
		if(espectador.getDinero() >= precio && espectador.getEdad() >= peli.getEdadMin()) {
			return true;
		} else {
			return false;
		}
	}
	// Getters y setters
	public Pelicula getPeli() {
		return peli;
	}
	public void setPeli(Pelicula peli) {
		this.peli = peli;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public Espectador getEspectador() {
		return espectador;
	}
	public void setEspectador(Espectador espectador) {
		this.espectador = espectador;
	}

}
