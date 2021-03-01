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
public class Volonteer extends Trabajadores {
	private double ayuda;
	
	public Volonteer(String nombre, double sueldoBrutoMensual, double ayuda) {
		super(nombre, sueldoBrutoMensual);
		this.sueldoBrutoMensual =arreglarSueldo(sueldoBrutoMensual);
		this.sueldoNetoMensual = this.sueldoBrutoMensual;
		this.sueldoBrutoAnual = this.sueldoBrutoMensual*12;
		this.sueldoNetoAnual = this.sueldoNetoMensual*12;
		this.ayuda = arreglarAyuda(ayuda);
		}
	
	public Volonteer(String nombre, double ayuda) {
		super(nombre);
		this.nombre=nombre;
		this.sueldoBrutoMensual=0;
		this.sueldoNetoMensual = this.sueldoBrutoMensual;
		this.sueldoBrutoAnual = this.sueldoBrutoMensual*12;
		this.sueldoNetoAnual = this.sueldoNetoMensual*12;
		this.ayuda = arreglarAyuda(ayuda);
	}

	@Override
	public boolean comprovarSueldo(double sueldo) {
		return (sueldo == 0) ? true : false;
	}

	@Override
	public double arreglarSueldo(double sueldo) {
		return (sueldo == 0) ? sueldo : 0;
	}	
	
	public boolean comprovarAyuda(double ayuda) {
		return (ayuda <= 300 && ayuda >= 0) ? true : false;
	}
	
	public double arreglarAyuda(double ayuda) {
		return (ayuda <= 300 && ayuda >= 0) ? ayuda : 0;
	}
	
	@Override
	public double bonus(double porcentaje) {
		return (sueldoBrutoAnual*(porcentaje/100));
	}

	public double getAyuda() {
		return ayuda;
	}

	public void setAyuda(double ayuda) {
		this.ayuda = ayuda;
	}

	@Override
	public String toString() {
		return "Volonteer [ayuda=" + ayuda + ", nombre=" + nombre + ", sueldoNetoMensual=" + sueldoNetoMensual
				+ ", sueldoBrutoMensual=" + sueldoBrutoMensual + ", sueldoNetoAnual=" + sueldoNetoAnual
				+ ", sueldoBrutoAnual=" + sueldoBrutoAnual + "]";
	}
	
	

}
