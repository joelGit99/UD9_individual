package Main_y_clases;

import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JOptionPane;

/**
 * Clase para crear aulas
 * @author Joel
 *
 */

public class Aula {
	// Atributos
	private int id;
	private int maxEstudiantes;
	private String materia;
	private Profesor profesor;
	private int numEstudiantes = 0;
	private ArrayList<Estudiante> listaAlumnos = new ArrayList<>();
	// Constructores
	public Aula(int id, int maxEstudiantes, String materia, Profesor profesor) {
		this.id = id;
		this.maxEstudiantes = maxEstudiantes;
		this.materia = materia;
		// Si el profesor es correcto, se asigna, sino, se asigna null
		if(profeCorrecto(profesor)) {
			this.profesor = profesor;
		} else {
			this.profesor = null;
		}
		
	}
	
	// Métodos
	
	// Método para añadir estudiantes
	public void añadirEstudiante(Estudiante estudiante) {
		if(numEstudiantes < maxEstudiantes) {
			listaAlumnos.add(estudiante);
			numEstudiantes++;
		} else {
			System.out.println("Aula llena");
		}
		
	}
	
	// Método que comprueba si se puede dar clase o no dependiendo de las condiciones
	public void darClase() {
		int contadorAlumnos = 0;
		Iterator<Estudiante> it = listaAlumnos.iterator();
		Estudiante alumno;
		while(it.hasNext()) {
			alumno = it.next();
			if(alumno.disponible()) {
				contadorAlumnos++;
			}
		}
		if(profesor.disponible() && contadorAlumnos > (maxEstudiantes * 0.5)) {
			JOptionPane.showMessageDialog(null, "Se puede dar clase");
		} else {
			JOptionPane.showMessageDialog(null, " No se puede dar clase");
		}
	}
	
	// Método que comprueba que la materia que da el profesor, coincida con el del aula
	private boolean profeCorrecto(Profesor profesor) {
		if(profesor.getMateria().equalsIgnoreCase(materia)) {
			return true;
		} else {
			return false;
		}
	}
	
	// Método que muestra los alumnos aprobados
	public void alumnosAprobados() {
		Iterator<Estudiante> it = listaAlumnos.iterator();
		Estudiante alumno;
		System.out.println("Alumnos: ");
		while(it.hasNext()) {
			alumno = it.next();
			if(alumno.getNota() >= 5 && alumno.getSexo() == 'H') {
				System.out.println(alumno);
			}
		}
		System.out.println();
		Iterator<Estudiante> it2 = listaAlumnos.iterator();
		Estudiante alumna;
		System.out.println("Alumnas: ");
		while(it2.hasNext()) {
			alumna = it2.next();
			if(alumna.getNota() >= 5 && alumna.getSexo() == 'M') {
				System.out.println(alumna);
			}
		}
	}
	
	@Override
	public String toString() {
		return "Aula [id=" + id + ", maxEstudiantes=" + maxEstudiantes + ", materia=" + materia + ", profesor="
				+ profesor.getNombre() + ", numEstudiantes=" + numEstudiantes + "]";
	}

	// Getters y setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMaxEstudiantes() {
		return maxEstudiantes;
	}

	public void setMaxEstudiantes(int maxEstudiantes) {
		this.maxEstudiantes = maxEstudiantes;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	public Profesor getProfesor() {
		return profesor;
	}

	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}

	public int getNumEstudiantes() {
		return numEstudiantes;
	}

	public void setNumEstudiantes(int numEstudiantes) {
		this.numEstudiantes = numEstudiantes;
	}
}
