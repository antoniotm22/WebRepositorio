package paqueteAlmudena.capitulo05.examenes;

import javax.swing.JOptionPane;

import paqueteAlmudena.capitulo05.bloque04_arrayMatrices.Utils;

public class examenB {

	public static void main(String[] args) {
		menuPrincipal();
	}

	public static void escribeArray(int array[]) {
		int opcion;
		for (int i = 0; i < array.length; i++) {
			// opcion = Integer.parseInt(JOptionPane.showInputDialog("MENÚ DE JUEGO :\n1:
			// Mora \n 2: Naranja \n 3: Campana \n 4: Dolar"));
			opcion = Utils.numAleatorioLimSupInf(1, 4);
			array[i] = opcion;
			System.out.print(array[i] + "  ");
		}
	}

	public static int compruebaValores(int array[], int acumulador) {
		// compruebo que todos sean iguales o no , si lo son sumo 1000 sino resto 100
		if (array[0] == array[1] && array[1] == array[2]) {
			acumulador += 1000;
		} else
			acumulador -= 100;

		// compruevo si hay algun numero que no sea 4, si no los hay cambio la variables
		// esDolar por false
		boolean esDolar = true;
		for (int i = 0; i < array.length; i++) {
			if (array[i] != 4)
				esDolar = false;
		}

		// si todos los elementos son dolar, sumo 3000 puntos
		if (esDolar == true)
			acumulador += 3000;

		return acumulador;
	}

	public static void menuPrincipal() {

		int[] array = new int[3];
		// int opcion = 31;
		int acumulador = 0;
		int menu = 45;
		int puntuacion = 0;

		do {
			menu = Integer.parseInt(JOptionPane.showInputDialog("MENÚ : \n 0: Salir \n 1: Juega"));

			if (menu == 1) {
				escribeArray(array);
				puntuacion += compruebaValores(array, acumulador);
				System.out.println("Puntuación : " + puntuacion);
			}
		} while (menu != 0);
	}

}
