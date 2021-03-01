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
public class Senior extends Employee {

	public Senior(String nombre, double sueldoBrutoMensual) {
		super(nombre, sueldoBrutoMensual);
		this.sueldoBrutoMensual =arreglarSueldo(sueldoBrutoMensual* REDUCCION);
		this.sueldoNetoMensual = this.sueldoBrutoMensual*0.76;
		this.sueldoBrutoAnual = this.sueldoBrutoMensual*12;
		this.sueldoNetoAnual = this.sueldoNetoMensual*12;
	}
	
	@Override
	public boolean comprovarSueldo(double sueldo) {
		return (sueldo <= 4000 && sueldo >= 2700) ? true : false;
	}

	@Override
	public double arreglarSueldo(double sueldo) {
		return (sueldo <= 4000 && sueldo >= 2700) ? sueldo : 2700;
	}
	
	@Override
	public double bonus(double porcentaje) {
		return (sueldoBrutoAnual*(porcentaje/100));
	}
}
