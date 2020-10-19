package paqueteAlmudena.capitulo05.bloque03;

public class Ejer4 {

	public static void main(String[] args) {
		// Realiza un ejercicio que inicialice un array de 150 elementos enteros al azar entre 0 y 1.000. 
		// Una vez que lo hayas conseguido debes realizar implementar el algoritmo de ordenación llamado "Selección", 
		// con el objetivo de ordenar el array completamente
		
		int i, j, menor, pos, tmp;

        int array[] = new  int [150];
        for (int k = 0; k < array.length; k++) {
			array[k] = Utils.obtenerNumeroAzar1000();
		}
        
        
        for (i = 0; i < array.length - 1; i++) {      // tomamos como menor el primero
              menor = array[i];                       // de los elementos que quedan por ordenar                    
              pos = i;                                // y guardamos su posición
              for (j = i + 1; j < array.length; j++){ // buscamos en el resto
                    if (array[j] < menor) {           // del array algún elemento
                        menor = array[j];             // menor que el actual
                        pos = j;
                    }
              }
              if (pos != i){                      // si hay alguno menor se intercambia                         
                  tmp = array[i];
                  array[i] = array[pos];
                  array[pos] = tmp;   
              }
        }
        Utils.mostrarArray(array);
	}

}