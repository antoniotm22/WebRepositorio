package paqueteAlmudena.Capitulo2;

import javax.swing.JOptionPane;

public class Bloque1Ejer7 {

	public static void main(String[] args) {
		// Utiliza la operación AND y el operador "if", para tratar de averiguar si un número 
		//introducido por el usuario es par o impar. Sería recomendable que estudiases el código 
		//de la clase "OperadoresANivelDeBits" del capítulo 1 de este tutorial

		//declaramos las variables
		int var1;
		String srt;
		
		//pedimos el valor
		srt = JOptionPane.showInputDialog("Inserta el valor");
		var1 = Integer.parseInt(srt);
		
		//comparamos con bits
		if ((var1 & 1) == 1) {
			System.out.println("Es impar");
		}
		else {
			System.out.println("Es par");
		}

	}

}
