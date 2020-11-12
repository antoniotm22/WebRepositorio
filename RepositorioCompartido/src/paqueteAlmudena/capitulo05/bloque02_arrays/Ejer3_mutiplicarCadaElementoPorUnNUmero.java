package paqueteAlmudena.capitulo05.bloque02_arrays;

import javax.swing.JOptionPane;

import paqueteAlmudena.capitulo05.bloque04_arrayMatrices.Utils;

public class Ejer3_mutiplicarCadaElementoPorUnNUmero {

	public static void main(String[] args) {
		// Realiza un ejercicio que inicialice un array de 150 elementos enteros al azar entre 0 y 100. 
		// Debes conseguir multiplicar cada uno de los elementos del array por un número determinado, 
		// pedido al usuario.
		
		int array[] = new int [150];
		
		int num;
		String srt;
		
		srt = JOptionPane.showInputDialog("Inserte el número por el que quieres multiplicar el array");
		num = Integer.parseInt(srt);
		
		for (int i = 0; i < array.length; i++) {
			array[i] = Utils.obtenerNumeroAzar100() * num; // lo multiplicamos por el numero introducido por el usuario
			System.out.println("ARRAY : " + array[i]);
		}

	}

}
