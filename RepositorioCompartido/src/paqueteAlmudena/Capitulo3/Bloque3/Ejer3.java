package paqueteAlmudena.Capitulo3.Bloque3;

import javax.swing.JOptionPane;

public class Ejer3 {

	public static void main(String[] args) {
		// Realiza un ejercicio que pida números al usuario hasta que este introduzca el 0 (cero). Al finalizar el 
		// ejercicio se debe imprimir en pantalla el valor mayor introducido. El valor 0 (cero) no debe tenerse en cuenta.
		int num;
		String srt;
		int mayor = 0;
		srt = JOptionPane.showInputDialog("Introduzca un numero teniendo en cuenta que el 0 es para salir del programa");
		num = Integer.parseInt(srt);
		
		while (num != 0) {

			if (num > mayor) {
				mayor = num;
			}
			//introducimos el siguiente numero
			srt = JOptionPane.showInputDialog("Introduzca un numero teniendo en cuenta que el 0 es para salir del programa");
			num = Integer.parseInt(srt);
			
			
		}

		System.out.println("El mayor es " + mayor);
		
	}

}
