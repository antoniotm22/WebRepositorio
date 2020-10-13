package paqueteAlmudena.capitulo05.bloque01;

public class Ejer5 {
	public static void main(String[] args) {
		// Realiza un ejercicio que inicialice un array de 150 elementos enteros al azar entre 0 y 100. 
		// Debes mostrar al usuario la suma de los elementos cuyo índice sea par.
		
		int array[] = new int [150];
		int suma = 0;
		
		for (int i = 0; i < array.length; i++) {
			array[i] = Utils.obtenerNumeroAzar();
		}
		for (int i = 0; i < array.length; i++) {
			if (i % 2 == 0) {
				suma += array[i];
			}
		}
		
		System.out.println("La suma de los numeros en indices pares es : " + suma);
	}
}
