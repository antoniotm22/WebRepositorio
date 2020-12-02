package paqueteAlmudena.capitulo05.bloque05_metodos_y_arrays;

import paqueteAlmudena.capitulo05.bloque04_arrayMatrices.Utils;

public class ejer3_addInteger {

	public static void main(String[] args) {
		// Realiza un método llamado "addInteger", que reciba:
	//	   - Un array de números enteros.
	//	   - Un valor entero.
	//	Dentro del método debes:
	//	   - Crear un nuevo array, cuya longitud sea la del array recibido como primer parámetro + 1.
	//	   - Copiar el array del primer parámetro en el array creado dentro del método, elemento tras elemento.
	//	   - Agregar el nuevo elemento al final del nuevo array.
	//	   - Asignar, al array recibido mediante el primer parámetro, el puntero al nuevo array creado en el interior del método.
	//	   - El método debe devolver void, pero el array (puntero) recibido como primer parámetro debe haber 
	//	   	cambiado a un nuevo puntero, que apunte al array que contiene un nuevo elemento.

		int [] array = new int [5];
		for (int i = 0; i < array.length; i++) {
			array[i] = Utils.obtenerNumeroAzar100();
		}
		Utils.mostrarArrayInt(array);
		System.out.println("\nArray con el valor añadido: ");
		Utils.mostrarArrayInt(addInteger(array, 6));
		
		
	}
	
	public static int[] addInteger (int[] array, int valor) {
		
		int [] array2 = new int[array.length + 1];
		
		for (int i = 0; i < array.length; i++) {
			
				array2[i] = array[i];
			
		}
		
		array2[array2.length -1] = valor;
		
		return array2;
	}

}
