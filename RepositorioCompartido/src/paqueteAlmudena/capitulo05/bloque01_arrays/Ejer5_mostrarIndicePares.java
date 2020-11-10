package paqueteAlmudena.capitulo05.bloque01_arrays;

import paqueteAlmudena.capitulo05.bloque04_arrayMatrices.Utils;

public class Ejer5_mostrarIndicePares {
	public static void main(String[] args) {
		// Realiza un ejercicio que inicialice un array de 150 elementos enteros al azar entre 0 y 100. 
		// Debes mostrar al usuario la suma de los elementos cuyo índice sea par.
		
		int array[] = new int [150];
		int suma = 0;
		
		for (int i = 0; i < array.length; i++) {
			array[i] = Utils.obtenerNumeroAzar100();
		}
		for (int i = 0; i < array.length; i++) {
			if (i % 2 == 0) {
				suma += array[i];
			}
		}
		
		System.out.println("La suma de los numeros en indices pares es : " + suma);
	}
}
