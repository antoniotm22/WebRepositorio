package paqueteAlmudena.Capitulo3.Bloque3;

import javax.swing.JOptionPane;

public class Ejer2 {

	public static void main(String[] args) {
		// Realiza un ejercicio igual al anterior, con la particularidad de imprimir la media al final del ejercicio, no la suma.
		
		int num;
		String srt;
		int suma = 0; 
		int media;
		int i = 0;
		
		srt = JOptionPane.showInputDialog("Introduzca un numero teniendo en cuenta que el 0 es para salir del programa");
		num = Integer.parseInt(srt);
		
		while (num != 0) {
			
			suma = suma + num;//sumamos el numero que hemos introducido antes
			
			//introducimos el siguiente numero
			srt = JOptionPane.showInputDialog("Introduzca un numero teniendo en cuenta que el 0 es para salir del programa");
			num = Integer.parseInt(srt);
			i++;// contador 
			
		}
		
		//salido porque hemos introducido 0
		
		media = suma / i;//hacemos la media
		System.out.println(media);
		
	}

}
