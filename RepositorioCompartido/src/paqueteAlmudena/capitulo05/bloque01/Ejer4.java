package paqueteAlmudena.capitulo05.bloque01;

public class Ejer4 {

	public static void main(String[] args) {
		//  Realiza un ejercicio que inicialice un array de 150 elementos enteros al azar entre 0 y 100.
		// Debes obtener la suma de los números pares y los impares en variables separadas.
		
		int array [] = new int [150];
		int sumPar = 0;
		int sumImp = 0;
		
		for (int i = 0; i < array.length; i++) {
			array[i] = Utils.obtenerNumeroAzar();
		}
		
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				sumPar += array[i];
			}
			if (array[i] % 2 != 0) {
				sumImp += array[i];
			}
		}
		System.out.println("La suma de los valores pares es : " + sumPar +"\n" +
				"La suma de los valores impares es : " + sumImp);

	}

}
