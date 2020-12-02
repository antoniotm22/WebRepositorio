package paqueteAlmudena.capitulo05.bloque05_metodos_y_arrays;

import paqueteAlmudena.capitulo05.bloque04_arrayMatrices.Utils;

public class ejer5_removeInteger {

	public static void main(String[] args) {
		// Realiza un método llamado "removeInteger", que reciba:
//  	- Un array de números enteros.
//  	- Un valor entero.
//  	Si el valor entero recibido como segundo parámetro existe dentro del array recibido como primer parámetro,
//  	debes conseguir que ese valor desaparezca del array. Puedes seguir la siguiente guía:
//  	- Utiliza el método del ejercicio 4 para saber cuántas veces aparece el valor entero (segundo parámetro) dentro 
//  	del array (primer parámetro).
//  	- Crea un nuevo array, que tenga la dimensión del array recibido como primer parámetro menos la cantidad de veces 
//  	que el valor entero del segundo parámetro aparezca en dicho array.
//  	- Copia todos los elementos del array recibido como primer parámetro, dentro del nuevo array creado por ti en el 
//  	método. Lógicamente no debes copiar en el array los valores del primer array que coincidan con el valor introducido 
//  	como segundo parámetro.
//  	- "Sustituye" el puntero del array recibido como primer parámetro, para que apunte al nuevo array creado por ti en 
//  	el interior del método. El método debe devolver "void", pero el array (puntero) recibido como primer parámetro debe 
//  	haber cambiado para reflejar que ahora no existan los valores recibidos como segundo parámetro

		int [] original = new int [] {15, 5, 25, 5, 10};
		Utils.mostrarArrayInt(original);
		System.out.println("");
		removeInteger(original, 5);
	
	}
	
	public static void removeInteger(int[] array, int valor) {
		
		int num = ejer4_countOccurrences.countOccurrences(array, valor); // cogemos el metodo del ejercicio anterior y guardamos la cantidad que se repite en na variable
		
		int [] arrayBorrado = new int [array.length - num]; // para asignar la longitud del array teniendo en cuenta los numeros que se hamborrado
		
		int aux = 0;
		
		for (int i = 0; i < array.length; i++) {
			
			
			if (array[i] == valor) {
				aux++;
			}
			else {
				arrayBorrado[i-aux] = array[i];
			}
			
		}
		

		Utils.mostrarArrayInt(arrayBorrado);
	}

}
