package paqueteAlmudena.capitulo03.bloque01;

import javax.swing.JOptionPane;

public class Ejer2 {

	public static void main(String[] args) {
		//  Modifica el ejercicio anterior de manera que, en lugar de que el programa siempre pida cuatro números, 
		//sea el usuario el que decida cuantos números se van a pedir.
		
		String srt;
		int cuanNum;
		int num;
		int suma = 0;
		
		srt = JOptionPane.showInputDialog("Cuantos numeros quieres pedir");
		cuanNum = Integer.parseInt(srt);
		
		for (int i = 0; i < cuanNum; i++) {
			srt = JOptionPane.showInputDialog("Inserte un numero entero");
			num = Integer.parseInt(srt);
			
			if (num > 10) {
				suma =+ num;
			}
		}
		System.out.println("La suma de los valores mayores de 10 es : " + suma);
		
	}

}
