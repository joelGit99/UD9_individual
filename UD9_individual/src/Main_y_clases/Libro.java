package Main_y_clases;

/**
 * Clase para crear libros
 * @author Joel
 *
 */

public class Libro {
	// Atributos
	private String ISBN;
	private String titulo;
	private String autor;
	private int numPags;

	
	
	// Constructores
	public Libro() {
		
	}
	public Libro(String ISBN, String titulo, String autor, int numPags) {
		this.ISBN = ISBN;
		this.titulo = titulo;
		this.autor = autor;
		this.numPags = numPags;
	}

	// Métodos
	
	
	// Getters y setters
	public String getISBN() {
		return ISBN;
	}
	
	public void setISBN(String ISBN) {
		this.ISBN = ISBN;
	}
	@Override
	public String toString() {
		return titulo + " con " + ISBN + " creado por " + autor + " tiene " + numPags + " páginas";
	}


	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getNumPags() {
		return numPags;
	}
	public void setNumPags(int numPags) {
		this.numPags = numPags;
	}

}
