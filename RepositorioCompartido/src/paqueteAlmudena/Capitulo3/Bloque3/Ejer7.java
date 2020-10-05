package paqueteAlmudena.Capitulo3.Bloque3;

import javax.swing.JOptionPane;

public class Ejer7 {

	public static void main(String[] args) {
		// Realiza un ejercicio que pida números al usuario, hasta que uno de ellos sea 0 (cero). 
		// Al finalizar se debe imprimir en pantalla cuantos son positivos y cuantos negativos. 
		// No debes tener en cuenta el 0 (cero).
		
		int num;
		String srt;
		int positivos = 0;
		int negativos = 0;
		
		srt = JOptionPane.showInputDialog("Introduzca un numero");
		num = Integer.parseInt(srt);
		
		while (num != 0) {
			if (num < 0) {
				negativos++;
			}
			else {
				positivos++;
			}
			
			// volvemos a pedir numero
			srt = JOptionPane.showInputDialog("Introduzca un numero");
			num = Integer.parseInt(srt);
			
		}
		System.out.println("Positivos: " + positivos + "\n"
				+ "Negativos: " + negativos);
	}

}
