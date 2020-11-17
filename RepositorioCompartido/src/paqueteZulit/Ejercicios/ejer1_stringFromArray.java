package paqueteZulit.Ejercicios;

import paqueteAlmudena.capitulo05.bloque04_arrayMatrices.Utils;

public class ejer1_stringFromArray {

	public static void main(String[] args) {
		//  Un método llamado "stringFromArray", que reciba un array de números enteros y devuelva una cadena de caracteres.
		//  El método debe recorrer el array, de la misma forma en la que harías para mostrarlo en consola, pero en lugar de 
		//  imprimir en consola debes construir un objeto String. Finalmente debes devolver el String e imprimirlo en el método "main".

		int [] array = new int [5];
		for (int i = 0; i < array.length; i++) {
			array[i] = Utils.obtenerNumeroAzar100();
		}
		System.out.println(stringFromArray(array));
	}
	
	public static String stringFromArray (int[] array) {
		String srt = " ";
		for (int i = 0; i < array.length; i++) {
			srt += array[i] + " ";
		}

		return srt;
	}

}
