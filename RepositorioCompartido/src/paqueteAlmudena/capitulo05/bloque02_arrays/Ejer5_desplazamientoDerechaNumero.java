package paqueteAlmudena.capitulo05.bloque02_arrays;

import javax.swing.JOptionPane;

import paqueteAlmudena.capitulo05.bloque04_arrayMatrices.Utils;

public class Ejer5_desplazamientoDerechaNumero {

	public static void main(String[] args) {
		// Realiza un ejercicio igual al anterior, pero en el que el usuario pueda indicar la cantidad de posiciones que deseamos desplazar.
		
		int array[] = new int [5];
		int posiciones;
		String srt;
		
		srt = JOptionPane.showInputDialog("Inserte las posiciones que desea desplazar");
		posiciones = Integer.parseInt(srt);
		
		
		for (int i = 0; i < array.length; i++) {
			array[i] = Utils.obtenerNumeroAzar100();
			System.out.println("VIEJO " + array[i]);
		}
		
		
		// lo hacemos las veces que ha introducido el usuario
		
		for (int i = 0; i < posiciones; i++) { 
			//Guardo el ultimo valor del array en la aux
			
			int	aux = array[array.length-1];
			
			//desplazamos los valores a la derecha
			for (int j = array.length -1; j > 0; j--) {
				array[j] = array[j - 1];
			}
			//Cuando acaba el bucle, pongo mi aux en la posicion 0
			array[0] = aux ;	

			
		}
		
		for (int j = 0; j < array.length; j++) {	
			System.out.println("NUEVO " + array[j]);	
		}	

	}

}
