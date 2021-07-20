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
	private String COMPA�IA;
	// Constructores
	public Videojuego() {
		TITULO = "";
		HORASESTIMADAS = 10;
		ENTREGADO = false;
		GENERO = "";
		COMPA�IA = "";
	}
	public Videojuego(String titulo, int horasEstimadas) {
		this.TITULO = titulo;
		this.HORASESTIMADAS = horasEstimadas;
		this.ENTREGADO = false;
		this.GENERO = "";
		this.COMPA�IA = "";
	}
	public Videojuego(String titulo, int horasEstimadas, String genero, String compa�ia) {
		this.TITULO = titulo;
		this.HORASESTIMADAS = horasEstimadas;
		this.ENTREGADO = false;
		this.GENERO = genero;
		this.COMPA�IA = compa�ia;
	}

	// M�todos
	@Override
	public String toString() {
		return "T�tulo: " + TITULO + "\n" +
				"Horas estimadas: " + HORASESTIMADAS + "\n" +
				"Entregado: " + ENTREGADO + "\n" +
				"G�nero: " + GENERO + "\n" +
				"Compa��a: " + COMPA�IA;
	}
	
	/**
	 *  M�todo para entregar el juego
	 */
	@Override
	public void entregar() {
		this.ENTREGADO = true;

	}
	
	/**
	 *  M�todo para devolver el juego
	 */
	@Override
	public void devolver() {
		this.ENTREGADO = false;

	}
	
	/**
	 * M�todo que devuelve si el juego est� entregado o no
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
	 * M�todo que compara el n�mero de horas con otro juego
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
	public String getCOMPA�IA() {
		return COMPA�IA;
	}
	public void setCOMPA�IA(String compa�ia) {
		COMPA�IA = compa�ia;
	}



}
