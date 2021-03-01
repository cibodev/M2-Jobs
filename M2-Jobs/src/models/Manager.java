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
public class Manager extends Trabajadores{

	public Manager(String nombre, double sueldoBrutoMensual) {
		super(nombre, sueldoBrutoMensual);
		this.sueldoBrutoMensual =arreglarSueldo(sueldoBrutoMensual*1.1);
		this.sueldoNetoMensual = this.sueldoBrutoMensual*0.74;
		this.sueldoBrutoAnual = this.sueldoBrutoMensual*12;
		this.sueldoNetoAnual = this.sueldoNetoMensual*12;
	}
	
	@Override
	public boolean comprovarSueldo(double sueldo) {
		return (sueldo <= 5000 && sueldo >= 3000) ? true : false;
	}

	@Override
	public double arreglarSueldo(double sueldo) {
		return (sueldo <= 5000 && sueldo >= 3000) ? sueldo : 3000;
	}
	
	@Override
	public double bonus(double porcentaje) {
		return (sueldoBrutoAnual*(porcentaje/100));
	}

}
