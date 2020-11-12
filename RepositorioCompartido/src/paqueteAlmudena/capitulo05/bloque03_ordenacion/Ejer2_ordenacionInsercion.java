package paqueteAlmudena.capitulo05.bloque03_ordenacion;

import paqueteAlmudena.capitulo05.bloque04_arrayMatrices.Utils;

public class Ejer2_ordenacionInsercion {

	public static void main(String[] args) {
		//  Realiza un ejercicio que inicialice un array de 150 elementos enteros al azar entre 0 y 1.000.
		// Una vez que lo hayas conseguido debes realizar implementar el algoritmo de ordenación llamado 
		// "Inserción directa", con el objetivo de ordenar el array completamente

		int array[] = new int [150];
		
		for (int i = 0; i < array.length; i++) {
		
			array[i]  = Utils.obtenerNumeroAzar1000();
			
		}
		
		busquedaPorInsercion(array);
		Utils.mostrarArrayInt(array);;
		
		
	}
	static void busquedaPorInsercion(int array[]) {
		int j; // declaramos ya la variable de j para que podamos poner poner la posicion adecuada
			   // al final del bucle for primero. Si lo ponemos dentro, no reconoce la variable 
			   // y sale error
		int actual;
		for (int i = 1; i < array.length; i++) {
			
			actual = array[i];
			
			for ( j = i; j > 0 &&  array[j - 1] > actual; j--) {
				array[j] = array[j - 1];
			}
			array[j] = actual;
		}
	}

}
