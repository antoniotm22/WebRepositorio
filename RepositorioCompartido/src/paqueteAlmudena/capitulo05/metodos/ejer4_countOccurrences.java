package paqueteAlmudena.capitulo05.metodos;

import paqueteAlmudena.capitulo05.bloque04_arrayMatrices.Utils;

public class ejer4_countOccurrences {

	public static void main(String[] args) {
		// Realiza un método llamado "countOccurrences", que reciba:
	//	- Un array de números enteros.
	//	- Un valor entero.
	//	El método debe devolver un valor entero, que corresponda con el número de veces que el valor entero recibido 
	//	como segundo parámetro exista dentro del array recibido como primer parámetro
	
		int [] array = new int [] {15, 5, 25, 5, 10};
		
		System.out.println(countOccurrences(array, 5));
	}
	public static int countOccurrences (int[] array, int valor) {
		int cont =0; 
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] == valor) {
				cont++;
			}
		}
		return cont;
	}

}
