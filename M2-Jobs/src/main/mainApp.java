/**
 * 
 */
package main;

import models.*;

/**
 * @author Christian Rivas Pottier
 *
 *
 * @date 1 mar. 2021
 *
 *
 */
public class mainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Trabajadores[] trabajadores = new Trabajadores[12];
		
		
		trabajadores[0]=new Boss("Boss bien", 9500);
		trabajadores[1]=new Boss("Boss mal", 3000);
		trabajadores[2]=new Manager("Manager bien", 4500);
		trabajadores[3]=new Manager("Manager mal", 6000);
		trabajadores[4]=new Senior("Senior bien", 3500);
		trabajadores[5]=new Senior("Senior mal", 1500);
		trabajadores[6]=new Mid("Mid bien", 2400);
		trabajadores[7]=new Mid("Mid mal", 3000);
		trabajadores[8]=new Junior("Junior bien", 1300);
		trabajadores[9]=new Junior("Junior mal", 40);
		trabajadores[10]=new Volonteer("Volonteer bien", 250);
		trabajadores[11]=new Volonteer("Volonteer mal", 250, 0);
		
		Volonteer voluntario1 = (Volonteer) trabajadores[10];
		Volonteer voluntario2 = (Volonteer) trabajadores[11];
		
		for (int i = 0; i < 10; i++) {
			System.out.println(trabajadores[i].toString());
		}
		System.out.println(voluntario1.toString()+"\n"+voluntario2.toString());
	}

}
