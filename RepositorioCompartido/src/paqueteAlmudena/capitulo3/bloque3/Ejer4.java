package paqueteAlmudena.capitulo3.bloque3;

import javax.swing.JOptionPane;

public class Ejer4 {

	public static void main(String[] args) {
		// Realiza un ejercicio igual al anterior, con la particularidad de que debe imprimir en pantalla el menor, no el mayor.
		
		int num;
		String srt;
		int menor = 0;
		
		srt = JOptionPane.showInputDialog("Introduzca un numero teniendo en cuenta que el 0 es para salir del programa");
		num = Integer.parseInt(srt);
		
		while (num != 0) {

		
			if (num < menor) {
				menor = num;
			}
			//introducimos el siguiente numero
			srt = JOptionPane.showInputDialog("Introduzca un numero teniendo en cuenta que el 0 es para salir del programa");
			num = Integer.parseInt(srt);
			
			
		}

		System.out.println("El menor es " + menor);
	}

}
