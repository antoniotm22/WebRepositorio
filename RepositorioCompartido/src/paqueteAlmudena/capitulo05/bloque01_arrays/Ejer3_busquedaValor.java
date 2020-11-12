package paqueteAlmudena.capitulo05.bloque01_arrays;

import javax.swing.JOptionPane;

import paqueteAlmudena.capitulo05.bloque04_arrayMatrices.Utils;

public class Ejer3_busquedaValor {

	public static void main(String[] args) {
		// Realiza un ejercicio que inicialice un array de 150 elementos enteros al azar entre 0 y 100. 
		// A continuación pedirás al usuario un valor y buscarás dicho valor en el array. Si lo encuentras,
		// debes indicar al usuario la posición del array en que se encuenta. En caso de que no encuentres 
		// el valor buscado, debes indicárselo también al usuario.
		
		int array [] = new int [150]; 
		String srt;
		int num;
		boolean encontrado = false;
		
		srt = JOptionPane.showInputDialog("Pon un numero entre el 0 y 100");
		num = Integer.parseInt(srt);
		
		for (int i = 0; i < array.length; i++) {
			array[i] = Utils.obtenerNumeroAzar100();
			
		}
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] == num) {
				System.out.println("El valor esta en " + i);
				encontrado = true;
				break;
			}
			
		}
		if (encontrado == false) {
			System.out.println("No se ha encontrado el número en el array");
		}

	}

}
