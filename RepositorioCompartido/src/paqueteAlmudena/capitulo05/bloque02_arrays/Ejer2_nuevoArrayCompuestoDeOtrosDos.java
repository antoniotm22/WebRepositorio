package paqueteAlmudena.capitulo05.bloque02_arrays;

import paqueteAlmudena.capitulo05.bloque04_arrayMatrices.Utils;

public class Ejer2_nuevoArrayCompuestoDeOtrosDos {

	public static void main(String[] args) {
		// Realiza un ejercicio que inicialice dos arrays de 150 elementos enteros al azar entre 0 y 100. 
		// Debes crear un tercer array, compuesto de la siguiente forma: en los elementos de índice impar del tercer
		// array debes copiar los elementos de índice impar del primer array; en los elementos de índice par del tercer
		// array debes copiar los elementos de índice par del segundo array.TODO Auto-generated method stub
		
		
		int array1 [] = new int [150];
		int array2 [] = new int [150];
		int array3 [] = new int [150];
		
		// le damos los valores a los array con números aleatorios
		for (int i = 0; i < array1.length; i++) {
			array1[i] = Utils.obtenerNumeroAzar100();
			array2[i] = Utils.obtenerNumeroAzar100();
			
			System.out.println("ARRAY1 : " + array1[i]);
			System.out.println("ARRAY2 : " + array2[i]);
			
		}
		
		for (int i = 0; i < array3.length; i++) {
			if (i % 2 != 0) { // si el indice es impar le añadimos el valor de esa posicion del array1
				array3[i] =  array1[i];
			}
			
			if (i % 2 == 0) { // si el indice es par le añadimos el valor de esa posicion del array2
				array3[i] = array2[i]; 
			}
			System.out.println("ARRAY3 : " + array3[i]);
		}
		
		
		
		
		
	}

}
