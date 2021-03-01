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
public interface comprovarSueldo {
	public boolean comprovarSueldo(double sueldo);
	public double arreglarSueldo(double sueldo);
	public double bonus(double porcentaje);
}
