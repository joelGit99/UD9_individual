package Main_y_clases;

/**
 * Clase para crear videojuegos
 * @author Joel
 *
 */

public class Videojuego implements Entregable {
	// Atributos
	private String TITULO;
	private int HORASESTIMADAS;
	private boolean ENTREGADO;
	private String GENERO;
	private String COMPAÑIA;
	// Constructores
	public Videojuego() {
		TITULO = "";
		HORASESTIMADAS = 10;
		ENTREGADO = false;
		GENERO = "";
		COMPAÑIA = "";
	}
	public Videojuego(String titulo, int horasEstimadas) {
		this.TITULO = titulo;
		this.HORASESTIMADAS = horasEstimadas;
		this.ENTREGADO = false;
		this.GENERO = "";
		this.COMPAÑIA = "";
	}
	public Videojuego(String titulo, int horasEstimadas, String genero, String compañia) {
		this.TITULO = titulo;
		this.HORASESTIMADAS = horasEstimadas;
		this.ENTREGADO = false;
		this.GENERO = genero;
		this.COMPAÑIA = compañia;
	}

	// Métodos
	@Override
	public String toString() {
		return "Título: " + TITULO + "\n" +
				"Horas estimadas: " + HORASESTIMADAS + "\n" +
				"Entregado: " + ENTREGADO + "\n" +
				"Género: " + GENERO + "\n" +
				"Compañía: " + COMPAÑIA;
	}
	
	/**
	 *  Método para entregar el juego
	 */
	@Override
	public void entregar() {
		this.ENTREGADO = true;

	}
	
	/**
	 *  Método para devolver el juego
	 */
	@Override
	public void devolver() {
		this.ENTREGADO = false;

	}
	
	/**
	 * Método que devuelve si el juego está entregado o no
	 */
	@Override
	public boolean isEntregado() {
		if(this.ENTREGADO == true) {
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * Método que compara el número de horas con otro juego
	 */
	@Override
	public boolean compareTo(Object a) {
		Videojuego juego = (Videojuego) a;
		if(this.HORASESTIMADAS > juego.getHORASESTIMADAS()) {
			return true;
		} else {
			return false;
		}
	}

	// Getters y setters
	public String getTITULO() {
		return TITULO;
	}

	public void setTITULO(String titulo) {
		TITULO = titulo;
	}
	public int getHORASESTIMADAS() {
		return HORASESTIMADAS;
	}
	public void setHORASESTIMADAS(int horasEstimadas) {
		HORASESTIMADAS = horasEstimadas;
	}
	public String getGENERO() {
		return GENERO;
	}
	public void setGENERO(String genero) {
		GENERO = genero;
	}
	public String getCOMPAÑIA() {
		return COMPAÑIA;
	}
	public void setCOMPAÑIA(String compañia) {
		COMPAÑIA = compañia;
	}



}
