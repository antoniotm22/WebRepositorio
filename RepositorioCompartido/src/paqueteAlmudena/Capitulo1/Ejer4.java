package paqueteAlmudena.Capitulo1;

import javax.swing.JOptionPane;

public class Ejer4 {

	public static void main(String[] args) {
		// Realiza un programa que muestre la media de tres números introducidos.

		//Declaramos las variables
		String srt;
		
		double var1;
		double suma = 0;
		double media;
		
		//Lo hacemos con bucle con repeticion 3 
		
		for (int i = 0; i < 3; i++) {
			srt = JOptionPane.showInputDialog("Inserta un numero");
			var1 = Double.parseDouble(srt);
			suma = suma + var1;
		}
		
		//hacemos la media 3
		media= suma/3;
		
		System.out.println("La media es : " + media);


	}

}
