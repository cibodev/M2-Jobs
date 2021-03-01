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
public class Mid extends Employee {

	public Mid(String nombre, double sueldoBrutoMensual) {
		super(nombre, sueldoBrutoMensual);
		this.sueldoBrutoMensual =arreglarSueldo(sueldoBrutoMensual* REDUCCION);
		this.sueldoNetoMensual = this.sueldoBrutoMensual*0.85;
		this.sueldoBrutoAnual = this.sueldoBrutoMensual*12;
		this.sueldoNetoAnual = this.sueldoNetoMensual*12;
	}
	
	@Override
	public boolean comprovarSueldo(double sueldo) {
		return (sueldo <= 2500 && sueldo >= 1600) ? true : false;
	}

	@Override
	public double arreglarSueldo(double sueldo) {
		return (sueldo <= 2500 && sueldo >= 1600) ? sueldo : 1600;
	}
	
	@Override
	public double bonus(double porcentaje) {
		return (sueldoBrutoAnual*(porcentaje/100));
	}
}
