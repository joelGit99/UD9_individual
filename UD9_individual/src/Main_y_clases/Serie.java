package Main_y_clases;

/**
 * Clase para crear series
 * @author Joel
 *
 */

public class Serie implements Entregable {
	// Atributos
	private String titulo;
	private int numTemps;
	private boolean entregado;
	private String genero;
	private String creador;
	// Constructores
	public Serie() {
		this.titulo = "Dark";
		this.numTemps = 3;
		this.entregado = false;
		this.genero = "Suspense";
		this.creador = "Jantje Friese";
	}
	public Serie(String titulo, String creador) {
		this.titulo = titulo;
		this.creador = creador;
		this.numTemps = 3;
		this.entregado = false;
		this.genero = "Suspense";
	}
	public Serie(String titulo, int numTemps, String genero, String creador) {
		this.titulo = titulo;
		this.numTemps = numTemps;
		this.genero = genero;
		this.creador = creador;
	}

	// Métodos

	/**
	 *  Método para entregar la serie
	 */
	@Override
	public void entregar() {
		this.entregado = true;

	}

	/**
	 * Método para devolver la serie
	 */
	@Override
	public void devolver() {
		this.entregado = false;

	}

	/**
	 * Método que devuelve si la serie está entregada o no
	 */
	@Override
	public boolean isEntregado() {
		if(this.entregado == true) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Método que compara el número de temporadas con otra serie
	 */
	@Override
	public boolean compareTo(Object a) {
		Serie serie = new Serie();
		serie = (Serie) a;
		if(this.numTemps > serie.getNumTemps()) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		if(entregado) {
			return "Título: " + titulo + "\n" +
					"Número de temporadas: " + numTemps + "\n" +
					"Género: " + genero + "\n" +
					"Entregado: " + "Si" + "\n" +
					"Creador: " + creador + "\n";
		} else {
			return "Título: " + titulo + "\n" +
					"Número de temporadas: " + numTemps + "\n" +
					"Género: " + genero + "\n" +
					"Entregado: " + "No" + "\n" +
					"Creador: " + creador + "\n";
		}

	}

	// Getters y setters
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getNumTemps() {
		return numTemps;
	}
	public void setNumTemps(int numTemps) {
		this.numTemps = numTemps;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getCreador() {
		return creador;
	}
	public void setCreador(String creador) {
		this.creador = creador;
	}
}
