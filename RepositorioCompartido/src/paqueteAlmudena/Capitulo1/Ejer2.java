package paqueteAlmudena.Capitulo1;

import javax.swing.JOptionPane;

public class Ejer2 {

	public static void main(String[] args) {
		// Realiza un programa igual al anterior, con la particularidad de que ahora se debe mostrar 
		//cada número justo a continuación del momento en que ha sido introducido
		
		//Declaramos las variables
		String srt;
		int numEnt;
		float numF;
		double numD;
		
		//Guardamos numero entero
		srt = JOptionPane.showInputDialog("Inserta un numero entero ");
		numEnt = Integer.parseInt(srt);
		System.out.println("Numero entero: "+numEnt);
		
		//Guardamos el numero float
		srt= JOptionPane.showInputDialog("Inserta un numero flotante ");
		numF = Float.parseFloat(srt);
		System.out.println("Numero flotante: "+numF);
		
		//Guardamos el numero decimal con double
		srt= JOptionPane.showInputDialog("Inserta un numero decimal ");
		numD = Double.parseDouble(srt);
		System.out.println("Numero decimal: "+numD);
				

	}

}
