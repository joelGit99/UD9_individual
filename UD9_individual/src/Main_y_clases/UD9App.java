package Main_y_clases;

import javax.swing.JOptionPane;

public class UD9App {

	public static void main(String[] args) {
		// Creo los dos arrays, los relleno, y los entrego
		Serie[] arraySeries = new Serie[5];
		rellenarSeries(arraySeries);
		arraySeries[1].entregar();
		arraySeries[2].entregar();
		Videojuego[] arrayJuegos = new Videojuego[5];
		rellenarJuegos(arrayJuegos);
		arrayJuegos[1].entregar();
		arrayJuegos[2].entregar();
		// Muestro las series y juegos entregados, y los cuento
		seriesEntregadas(arraySeries);
		juegosEntregados(arrayJuegos);
		// Muestro el videojuego con mas horas y la serie con mas temporadas
		JOptionPane.showMessageDialog(null, videojuegoMasHoras(arrayJuegos));
		JOptionPane.showMessageDialog(null, serieMasTempos(arraySeries));
		
		Libro libro1 = new Libro("ISBN 0-7645-2641-3", "La larga marcha", "Stephen King", 384);
		Libro libro2 = new Libro("ISBN 0-4895-2145-7", "Harry Potter y la Orden del Fénix", "J.K. Rowling", 901);
		JOptionPane.showMessageDialog(null, "Libro con más páginas: " + libroMasPaginas(libro1, libro2));
		
		Raices raices1 = new Raices(2, 5, 3);
		raices1.obtenerRaices();
		
		Profesor profesor = new Profesor("Jaime", 40, 'H', "Física");
		Estudiante a1 = new Estudiante("Hugo", 12, 'H', 10);
		Estudiante a2 = new Estudiante("Álvaro", 1, 'H', 10);
		Estudiante a3 = new Estudiante("Irina", 12, 'M', 2);
		
		Aula aula = new Aula(1, 5, "Física", profesor);
		aula.añadirEstudiante(a1);
		aula.añadirEstudiante(a2);
		aula.añadirEstudiante(a3);
		System.out.println(aula);
		aula.darClase();
		aula.alumnosAprobados();
		
		/**
		 * No conseguí que el ejercicio 6 me funcionara, me daba error de Index 8 out of bounds for length 8
		 * Pero no encontré el fallo
		Pelicula pelicula = new Pelicula("Harry Potter y la Cámara Secreta", 164, 7, "Chris Columbus");
		Espectador espec1 = new Espectador("Joel", 21, 10);
		Espectador espec2 = new Espectador("Hugo", 12, 8);
		Espectador espec3 = new Espectador("Álvaro", 7, 2);
		
		Cine cine = new Cine(pelicula, 8);
		cine.crearAsientos();
		cine.mostrarAsientos(); **/
	}
	
	// Método que devuelve el libro con más páginas
	private static Libro libroMasPaginas(Libro libro1, Libro libro2) {
		Libro libroMasPags = new Libro();
		if(libro1.getNumPags() > libro2.getNumPags()) {
			libroMasPags = libro1;
		} else if(libro1.getNumPags() < libro2.getNumPags()) {
			libroMasPags = libro2;
		}
		return libroMasPags;
	}

	// Método para rellenar el array de series
	private static void rellenarSeries(Serie[] arraySeries) {
		arraySeries[0] = new Serie("Breaking Bad", 6, "Drogas", "Vince Gilligan");
		arraySeries[1] = new Serie("Vikingos", 6, "Histórica", "Michael Hirst");
		arraySeries[2] = new Serie("Bojack Horseman", 6, "Drama", "Raphael Bob-Waksberg");
		arraySeries[3] = new Serie("Brooklyn 99", 7, "Comedia", "Dan Goor");
		arraySeries[4] = new Serie("The Office", 9, "Comedia", "Michael Herbert​ Schur");
	}

	// Método para rellenar el array de juegos
	private static void rellenarJuegos(Videojuego[] arrayJuegos) {
		arrayJuegos[0] = new Videojuego("Dark Souls 3", 32);
		arrayJuegos[1] = new Videojuego("Dark Souls", 95);
		arrayJuegos[2] = new Videojuego("NieR Automata", 55);
		arrayJuegos[3] = new Videojuego("Bloodborne", 40);
		arrayJuegos[4] = new Videojuego("Layers of fear", 3);
	}

	/**
	 * Método para mostrar las series entregadas
	 * y mostrar cuántas son
	 * @param arraySeries
	 */
	public static void seriesEntregadas(Serie[] arraySeries) {
		int numEntregados = 0;
		JOptionPane.showMessageDialog(null, "Series entregadas");
		for (int i = 0; i < arraySeries.length; i++) {
			if(arraySeries[i].isEntregado()) {
				JOptionPane.showMessageDialog(null, arraySeries[i].getTitulo());
				arraySeries[i].devolver();
				numEntregados++;
			}
		}
		JOptionPane.showMessageDialog(null, "Series entregadas: " + numEntregados);
	}

	/**
	 * Método para mostrar los juegos entregados
	 * y mostrar cuántos son
	 * @param arraySeries
	 */
	public static void juegosEntregados(Videojuego[] arrayJuegos) {
		int numEntregados = 0;
		JOptionPane.showMessageDialog(null, "Juegos entregados");
		for (int i = 0; i < arrayJuegos.length; i++) {
			if(arrayJuegos[i].isEntregado()) {
				JOptionPane.showMessageDialog(null, arrayJuegos[i].getTITULO());
				arrayJuegos[i].devolver();
				numEntregados++;
			}
		}
		JOptionPane.showMessageDialog(null, "Juegos entregados: " + numEntregados);
	}

	/**
	 * Método que devuelve el juego con más horas
	 * @param arrayJuegos
	 * @return juego con más horas
	 */
	public static Videojuego videojuegoMasHoras(Videojuego[] arrayJuegos) {
		Videojuego horasMasAltas = arrayJuegos[0];
		for (int i = 1; i < arrayJuegos.length; i++) {
			if(arrayJuegos[i].compareTo(horasMasAltas)) {
				horasMasAltas = arrayJuegos[i];
			}
		}
		return horasMasAltas;
	}

	/**
	 * Método que devuelve la serie con más temporadas
	 * @param arraySeries
	 * @return serie con más temporadas
	 */
	public static Serie serieMasTempos(Serie[] arraySeries) {
		Serie serieMasTemps = arraySeries[0];
		for (int i = 1; i < arraySeries.length; i++) {
			if(arraySeries[i].compareTo(serieMasTemps)) {
				serieMasTemps = arraySeries[i];
			}
		}
		return serieMasTemps;
	}

}
