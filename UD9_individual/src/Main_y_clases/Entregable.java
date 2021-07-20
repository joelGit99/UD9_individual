package Main_y_clases;

/**
 * Interfaz para entregar, devolver, comprobar el estado
 * y comparar con otro objeto
 * @author Joel
 *
 */

public interface Entregable {
	public void entregar();
	public void devolver();
	public boolean isEntregado();
	public boolean compareTo(Object a);
}
