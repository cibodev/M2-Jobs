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
public class Boss extends Trabajadores {

	public Boss(String nombre, double sueldoBrutoMensual) {
		super(nombre, sueldoBrutoMensual);
		this.sueldoBrutoMensual = arreglarSueldo(sueldoBrutoMensual * 1.5);
		this.sueldoNetoMensual = this.sueldoBrutoMensual*0.68;
		this.sueldoBrutoAnual = this.sueldoBrutoMensual*12;
		this.sueldoNetoAnual = this.sueldoNetoMensual*12;
	}

	@Override
	public boolean comprovarSueldo(double sueldo) {
		return (sueldo >= 8000) ? true : false;
	}

	@Override
	public double arreglarSueldo(double sueldo) {
		return (sueldo > 8000) ? sueldo : 8000;
	}

	@Override
	public double bonus(double porcentaje) {
		return (sueldoBrutoAnual*(porcentaje/100));
	}



}
