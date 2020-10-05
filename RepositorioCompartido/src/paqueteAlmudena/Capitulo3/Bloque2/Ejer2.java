package paqueteAlmudena.Capitulo3.Bloque2;

import javax.swing.JOptionPane;

public class Ejer2 {

	public static void main(String[] args) {
		//Mayor y menor de una cantidad de números dada por el usuario. El 
		//usuario introducirá una cantidad de números, tras lo cual se le deben pedir tantos como este haya indicado.
		//Al final se debe imprimir el mayor y el menor de todos los introducidos.
		
		String srt;
		int cant;
		int num;
		int mayor = 0;
		int menor = 0;
		
		srt = JOptionPane.showInputDialog("Introduzca la cantidad de numeros");
		cant = Integer.parseInt(srt);
		
		for (int i = 0; i <cant; i++) {
			srt = JOptionPane.showInputDialog("Introduzca un numero");
			num = Integer.parseInt(srt);
			
			if (i == 0) {
				mayor = num;
				menor = num;
			}
			else {
				if (num > mayor) {
					mayor = num;
				}
				if (num < menor) {
					menor = num;
				}
			}
			
			int medio = num;
			
			if (medio < menor) {
					menor = medio;
				
			}
			
			
		}
		System.out.println("El mayor es : " + mayor +
				"\nEl menor es : " + menor);
	}

}
