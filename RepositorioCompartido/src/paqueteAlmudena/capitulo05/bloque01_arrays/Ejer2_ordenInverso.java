package paqueteAlmudena.capitulo05.bloque01_arrays;

import javax.swing.JOptionPane;

import paqueteAlmudena.capitulo05.bloque04_arrayMatrices.Utils;

public class Ejer2_ordenInverso {

	public static void main(String[] args) {
		// Realiza un ejercicio que inicialice un array de 150 elementos enteros al azar entre 0 y 100. 
		// Después de su inicialización debéis imprimir el array en orden inverso.
		
		
		int array [] = new int [150]; 
		
		
		
		for (int i = 0; i < array.length; i++) {
			array[i] = Utils.obtenerNumeroAzar100();
			
		}
		for (int i = 0; i < array.length; i++) {
			System.out.println("ORDENADO " + array[i]);
		}
		for (int i = array.length-1; i >= 0; i--) {
			System.out.println("NO ORDENADO " + array[i]);
		}
		
		
	}

}
