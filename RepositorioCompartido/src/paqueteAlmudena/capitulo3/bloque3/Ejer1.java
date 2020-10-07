package paqueteAlmudena.capitulo3.bloque3;

import javax.swing.JOptionPane;

public class Ejer1 {

	public static void main(String[] args) {
		// Realiza un ejercicio que pida números al usuario. El programa debe detenerse cuando el usuario introduzca el número 0 (cero), 
		// que no debe tenerse en cuenta para ninguna operación aritmética, simplemente para salir de la aplicación. Cuando el programa 
		// haya terminado, se debe sacar en pantalla el valor de la suma de todos los números.
		
		int num;
		String srt;
		int suma = 0; 
		
		srt = JOptionPane.showInputDialog("Introduzca un numero teniendo en cuenta que el 0 es para salir del programa");
		num = Integer.parseInt(srt);
		
		while (num != 0) {

			suma = suma + num;//sumamos el numero que hemos introducido antes
			
			//introducimos el siguiente numero
			srt = JOptionPane.showInputDialog("Introduzca un numero teniendo en cuenta que el 0 es para salir del programa");
			num = Integer.parseInt(srt);
			
			
		}
		//salido porque hemos introducido 0
		System.out.println(suma);
		
	}

}
