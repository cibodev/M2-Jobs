/**
 * 
 */
package models;

/**
 * @author Christian Rivas Pottier
 *
 *
 * @date 1 mar. 2021
 *
 *
 */
public abstract class Employee extends Trabajadores {
	
	protected final double REDUCCION = 0.85;
	
	public Employee(String nombre, double sueldo) {
		super(nombre, sueldo);
	}

	public Employee(String nombre) {
		super(nombre);
	}
	

}
