package paqueteAlmudena.capitulo05.bloque02_arrays;

import paqueteAlmudena.capitulo05.bloque04_arrayMatrices.Utils;

public class Ejer4_DesplazamientoDerecha {

	public static void main(String[] args) {
		// Realiza un ejercicio en que inicialice un array de 5 elementos enteros al azar entre 0 y 100.
		// Debes conseguir que se desplacen los números un lugar a su derecha, de manera que el desplazamiento 
		// sea circular, si un número sale por la derecha volverá a entrar por la izquierda. Ejemplo: 1 2 3 4 5 
		// pasa a ser 5 1 2 3 4 que pasa a ser 4 5 1 2 3.
		
		int array[] = new int [5];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = Utils.obtenerNumeroAzar100();
			System.out.println("VIEJO " + array[i]);
		}
		
		//Guardo el ultimo valor del array en la aux
		
		int	aux = array[array.length-1];
		
		//desplazamos los valores a la derecha
		for (int i = array.length -1; i > 0; i--) {
			array[i] = array[i - 1];
		}
		//Cuando acaba el bucle, pongo mi aux en la posicion 0
		array[0] = aux ;	

		for (int i = 0; i < array.length; i++) {	
			System.out.println("NUEVO " + array[i]);	
		}	
		
	}

}
