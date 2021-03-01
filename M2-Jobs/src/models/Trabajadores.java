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
public abstract class Trabajadores implements comprovarSueldo{
	protected String nombre;
	protected double sueldoNetoMensual;
	protected double sueldoBrutoMensual;
	protected double sueldoNetoAnual;
	protected double sueldoBrutoAnual;
	
//CONTRUCTORES
	
	public Trabajadores(String nombre, double sueldoBrutoMensual) {
		this.nombre = nombre;
		this.sueldoBrutoMensual = sueldoBrutoMensual;
	}
	
	public Trabajadores(String nombre) {
		this.nombre = nombre;
	}

	
//GETTERS SETTERS

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSueldoNetoMensual() {
		return sueldoNetoMensual;
	}

	public void setSueldoNetoMensual(double sueldoNetoMensual) {
		this.sueldoNetoMensual = sueldoNetoMensual;
	}

	public double getSueldoBrutoMensual() {
		return sueldoBrutoMensual;
	}

	public void setSueldoBrutoMensual(double sueldoBrutoMensual) {
		this.sueldoBrutoMensual = sueldoBrutoMensual;
	}

	public double getSueldoNetoAnual() {
		return sueldoNetoAnual;
	}

	public void setSueldoNetoAnual(double sueldoNetoAnual) {
		this.sueldoNetoAnual = sueldoNetoAnual;
	}

	public double getSueldoBrutoAnual() {
		return sueldoBrutoAnual;
	}

	public void setSueldoBrutoAnual(double sueldoBrutoAnual) {
		this.sueldoBrutoAnual = sueldoBrutoAnual;
	}

	@Override
	public String toString() {
		return "Trabajadores [nombre=" + nombre + ", sueldoNetoMensual=" + sueldoNetoMensual + ", sueldoBrutoMensual="
				+ sueldoBrutoMensual + ", sueldoNetoAnual=" + sueldoNetoAnual + ", sueldoBrutoAnual=" + sueldoBrutoAnual
				+ "]";
	}
	
	
}
