package paqueteAlmudena.capitulo05.bloque03;

public class Ejer1 {

	public static void main(String[] args) {
		// Realiza un ejercicio que inicialice un array de 150 elementos enteros al azar entre 0 y 1.000. 
		// Una vez que lo hayas conseguido debes realizar implementar el algoritmo de ordenación llamado "Burbuja", 
		// con el objetivo de ordenar el array completamente.

		int array[] = new int [150];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = Utils.obtenerNumeroAzar1000();
		}
		
		ordenaBurbuja(array);
		Utils.mostrarArray(array);
		
	}
	
	static void ordenaBurbuja(int array[]) {
		// Bucle desde 0 hasta la longitud del array -1 
        for (int i = 0; i < array.length - 1; i++) {
           
        	// Bucle anidado desde 0 hasta la longitud del array -1 
            
        	for (int j = 0; j < array.length - 1; j++) { 
            	
        		// Si el número almacenado en la posición j es mayor que el de la posición j+1
            	
        		if (array[j] > array[j + 1]) {
                   
        			// guardamos el número de la posicion j+1 en una variable (el menor) 
                  
        			int menor = array[j + 1];
                  
        			// Lo intercambiamos de posición 
                      
        			array[j + 1] = array[j];
                    array[j] = menor;
                   
                }
            }
        }
	}
}
