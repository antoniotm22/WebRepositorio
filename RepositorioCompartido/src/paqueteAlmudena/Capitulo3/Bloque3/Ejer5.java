package paqueteAlmudena.Capitulo3.Bloque3;

import javax.swing.JOptionPane;

public class Ejer5 {

	public static void main(String[] args) {
		// Realiza un ejercicio parecido a los dos anteriores, dónde se imprima el mayor valor y el menor de todos los introducidos.
		
		int num = -1;
		String srt;
		int mayor = 0;
		int menor = 0;
		boolean primeraVez = true;
		
		while (num != 0) {

			srt = JOptionPane.showInputDialog("Introduzca un numero teniendo en cuenta que el 0 es para salir del programa");
			num = Integer.parseInt(srt);
			
			if (primeraVez == true) {
				menor = num;
				primeraVez = false;
			}
			
			if (num > mayor) {
				mayor = num;
			}

			if (num < menor) {
				menor = num;
			}
			
		}
		
		System.out.println("El menor es " + menor +
				"\nEl mayor es " + mayor);
				

		
		
	}

}
