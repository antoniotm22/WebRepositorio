package paqueteAlmudena.capitulo05.bloque01_arrays;

import paqueteAlmudena.capitulo05.bloque04_arrayMatrices.Utils;

public class Ejer0_sumaMediaMenorMayor {

	public static void main(String[] args) {
		// Realiza un ejercicio que inicialice un array de 150 elementos enteros al azar entre 0 y 100. 
		// Debes mostrar el array en pantalla y obtener la suma, la media, el menor y el mayor de todos 
		// los números que aparecen en el array
		
		int suma = 0;
		float media = 0; 
		int mayor = 0;
		int menor = 0;
		
		
		int array [] = new int [105]; 
		for (int i = 0; i < array.length; i++) {
			array[i] = Utils.obtenerNumeroAzar100();
			
		}
		//añadimos los valores 
		for (int i = 0; i < array.length; i++) {
			System.out.println("El array es : " + array[i]);
		}
		
		//damos valores de array a mayor y menor
		mayor = array[0];
		menor = array[0];
		
		//hacemos la suma y  comprobamos
		for (int i = 0; i < array.length; i++) {
			suma += array[i];
			
			//hacemos la media
			media = suma /array.length;
			
			//comprobamos
			if (array[i] > mayor) {
				mayor = array[i];
			}
			else {
				if (array[i] < menor) {
					menor = array[i];
				}
			}
		}
		
		
		
		
		
		System.out.println("El mayor es " + mayor);
		System.out.println("El menor es " + menor);
		System.out.println("La suma de los valores es : " + suma);
		System.out.println("Media : " + media);
	}

}
