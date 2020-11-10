package paqueteAlmudena.capitulo05.bloque03_ordenacion;

import paqueteAlmudena.capitulo05.bloque04_arrayMatrices.Utils;

public class Ejer3_ordenacionShell {

	public static void main(String[] args) {
		// Realiza un ejercicio que inicialice un array de 150 elementos enteros al azar entre 0 y 1.000. 
		// Una vez que lo hayas conseguido debes realizar implementar el algoritmo de ordenación llamado "Shell",
		// con el objetivo de ordenar el array completamente.
		
		int salto, aux, i;
        boolean cambios;
        int array[] = new  int [150];
        
        for (int j = 0; j < array.length; j++) {
			array[j] = Utils.obtenerNumeroAzar1000();
		}
  
        for (salto = array.length / 2; salto != 0; salto /= 2) {
            cambios = true;
            while (cambios) {   // Mientras se intercambie algún elemento                                         
                cambios = false;
                for (i = salto; i < array.length; i++)   // se da una pasada
                {
                    if (array[i - salto] > array[i]) {       // y si están desordenados
                        aux = array[i];                  // se reordenan
                        array[i] = array[i - salto];
                        array[i - salto] = aux;
                        cambios = true;              // y se marca como cambio. 
                        
                    }
                }
            }
        }
        
        Utils.mostrarArrayInt(array);
	}
}
