package paqueteAlmudena.Capitulo1;

import javax.swing.JOptionPane;

public class Ejer1 {

	public static void main(String[] args) {
		//Realiza un programa que pida al usuario tres números: uno de tipo entero, otro de tipo 
		//flotante y otro de tipo doble. A continuación se tienen que mostrar en pantalla los tres 
		//números en una sola fila de la consola de salida
		
		//declaramos las variables
		String srt;
		int numEnt;
		float numF;
		double numD;
		
		//Guardamos numero entero
		srt = JOptionPane.showInputDialog("Inserta un numero entero ");
		numEnt = Integer.parseInt(srt);
		
		//Guardamos el numero float
		srt = JOptionPane.showInputDialog("Inserta un numero flotante ");
		numF = Float.parseFloat(srt);
		
		//Guardamos el numero decimal con double
		srt = JOptionPane.showInputDialog("Inserta un numero decimal ");
		numD = Double.parseDouble(srt);
		
		
		//Mostramos los valores introducidos
		System.out.println("Numero entero : " + numEnt + " Numero flotante : " + numF + " Numero decimal : " + numD);
		
	}

}