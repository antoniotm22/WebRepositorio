package paqueteAlmudena.capitulo05.bloque04_arrayMatrices;


public class Ejer1_posicionMitad {

	public static void main(String[] args) {
		//  Crea un método que reciba un array de números enteros creados al azar entre 0 y 100. 
		// El método debe examinar la longitud del array, comprobar que la longitud es un valor impar 
		// y devolver el valor que se encuentre en la posición media. En caso de que la longitud del array 
		// sea un número par no se debe devolver un valor -1.
		
		
		
		int array[] = new int [7];
		
		
		for (int i = 0; i < array.length; i++) {
			array[i] = Utils.obtenerNumeroAzar100();
		}
		
		System.out.println(examinarLong(array));
	}
	
	public static int examinarLong (int array[]) {
		int media;
		
		if (array.length % 2 != 0) {
			media = array.length / 2;
			return media;
			
		}
		else {
			return -1;
		}
	}

}
