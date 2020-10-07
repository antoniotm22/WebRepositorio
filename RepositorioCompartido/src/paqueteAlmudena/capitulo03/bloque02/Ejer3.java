package paqueteAlmudena.capitulo03.bloque02;

import javax.swing.JOptionPane;

public class Ejer3 {

	public static void main(String[] args) {
		// Ejercicio que obtenga todos los múltiplos de un número introducido por el usuario. 
		// Se imprimirán todos los múltiplos menores de 100, este será el límite.
		int num;
		String srt;
		
		srt = JOptionPane.showInputDialog("Introduzca el numero");
		num = Integer.parseInt(srt);
		
		for (int i = 0; i <= 100; i++) {
			if (i % num == 0) {
				System.out.println(i + " es multiplo de " + num);
			}
		}
	}

}
