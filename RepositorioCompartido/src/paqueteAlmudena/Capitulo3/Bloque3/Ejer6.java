package paqueteAlmudena.Capitulo3.Bloque3;

import javax.swing.JOptionPane;

public class Ejer6 {

	public static void main(String[] args) {
		// Realiza un ejercicio que pida números al usuario, hasta que uno de ellos sea 0 (cero). 
		// Para cada número introducido se debe mostrar en pantalla su tabla de multiplicar, 
		// desde el 0 (cero) hasta el 10.
		
		int multiplo;
		int num;
		String srt;
		
		srt = JOptionPane.showInputDialog("Inserte un numero");
		num = Integer.parseInt(srt);
		
		while (num != 0) {
			for (int i = 1; i <= 10; i++) {
				multiplo = num * i;
				System.out.println(num + " * " + i + " = " + multiplo);
			}

			srt = JOptionPane.showInputDialog("Inserte un numero");
			num = Integer.parseInt(srt);
			
		}
	}

}
