package Main_y_clases;


import javax.swing.JOptionPane;

/**
 * Clase para crear profesores
 * @author Joel
 *
 */

public class Profesor extends Persona implements Disponible {
	// Atributos
	private final String MATERIA_DEF = "";
	private final String MATERIA1 = "Matem�ticas";
	private final String MATERIA2 = "Filosof�a";
	private final String MATERIA3 = "F�sica";
	private String materia;
	
	// Constructores
	public Profesor() {
		super();
		this.materia = MATERIA_DEF;
	}

	public Profesor(String nombre, int edad, char sexo, String materia) {
		super(nombre, edad, sexo);
		// Si la materia es correcta, se asigna, sino, se pone el valor por defecto
		if(materiaCorrecta(materia)) {
			this.materia = materia;
		} else {
			this.materia = MATERIA_DEF;
		}
		
	}
	
	
	// M�todos
	
	// M�todo para comprobar que la materia es igual a una de las 3 constantes
	private boolean materiaCorrecta(String materia) {
		if(materia.equalsIgnoreCase(MATERIA1) || 
			materia.equalsIgnoreCase(MATERIA2) || 
			materia.equalsIgnoreCase(MATERIA3) ) {
			return true;
		} else {
			return false;
		}
	}
	
	// M�todo que comprueba si el profesor est� disponible o no
	public void profeDisponible() {
		if(disponible()) {
			JOptionPane.showMessageDialog(null, "El profesor est� disponible");
		} else {
			JOptionPane.showMessageDialog(null, "El profesor no est� disponible");
		}
	}
	
	// M�todo implementado de la interfaz Disponible, que depende de la probabilidad
	// retorna true o false
	@Override
	public boolean disponible() {
		double random = Math.random();
		
		if(random < 0.9) {
			return true;
		} else {
			return false;
		}	
	}
	
	
	
	@Override
	public String toString() {
		return "Nombre: " + nombre +
				"Materia: " + materia;
	}

	// Getters y setters
	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}
	
	public String getNombre() {
		return nombre;
	}
}
