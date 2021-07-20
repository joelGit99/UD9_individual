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

	// M�todos

	/**
	 *  M�todo para entregar la serie
	 */
	@Override
	public void entregar() {
		this.entregado = true;

	}

	/**
	 * M�todo para devolver la serie
	 */
	@Override
	public void devolver() {
		this.entregado = false;

	}

	/**
	 * M�todo que devuelve si la serie est� entregada o no
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
	 * M�todo que compara el n�mero de temporadas con otra serie
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
			return "T�tulo: " + titulo + "\n" +
					"N�mero de temporadas: " + numTemps + "\n" +
					"G�nero: " + genero + "\n" +
					"Entregado: " + "Si" + "\n" +
					"Creador: " + creador + "\n";
		} else {
			return "T�tulo: " + titulo + "\n" +
					"N�mero de temporadas: " + numTemps + "\n" +
					"G�nero: " + genero + "\n" +
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
