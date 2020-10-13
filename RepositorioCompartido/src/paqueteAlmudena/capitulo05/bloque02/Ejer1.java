package paqueteAlmudena.capitulo05.bloque02;

public class Ejer1 {

	public static void main(String[] args) {
		//  Realiza un ejercicio que inicialice un array de 150 elementos enteros al azar entre -100 y 100.
		// Debes conseguir que todos los números pares del array cambien de signo, los positivos deben pasar a
		// negativos y viceversa.
		
		int array[] = new int [150];
		int limiteSup = 100;
		int limiteInf = -100;
		
		for (int i = 0; i < array.length; i++) {
			array[i] = Utils.numAleatorioLimSupInf(limiteSup, limiteInf);
		}
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				System.out.println("Sin cambiar " + array[i]);
				array[i] *= -1;
				System.out.println("Cambiado " + array[i]);
			}
		}

	}

}
