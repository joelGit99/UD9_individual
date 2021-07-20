package Main_y_clases;

public class Persona {
	// Atributos por defecto
	protected final String NOMBRE_DEF = "";
	protected final int EDAD_DEF = 0;
	protected final char SEXO_DEF = 0;
	
	// Atributos
	protected String nombre;
	protected int edad;
	protected char sexo;
	
	// Constructores
	public Persona() {
		this.nombre = NOMBRE_DEF;
		this.edad = EDAD_DEF;
		this.sexo = SEXO_DEF;
	}

	public Persona(String nombre, int edad, char sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
	}
	
}
