package paqueteZulit.Ejercicios.Examenes.Pruebas;

import javax.swing.JOptionPane;

import paqueteAlmudena.capitulo05.bloque04_arrayMatrices.Utils;

public class ExamenA {

	public static void main(String[] args) {
		
		int bolos[] = new int[10];
		
		//Creacion y muestra de la partida
		System.out.println("INICIO DE PARTIDA");
		valoresBolos(bolos);
		imprimirBolos(bolos);
		
		//Variable de la tirada
		int tirada;
		
		do {
			//Mostrar Menu
			tirada = Integer.parseInt(JOptionPane.showInputDialog("Si quiere jugar pulse 1" + '\n' +
					  "Si quiere finalizar partida pulse 0 "));
			
			
			switch (tirada) {
			//Primer caso finalizar programa
			case 0:
				System.out.println("La partida ha finalizado");
			
				break;
			//Segundo caso Tirada del Jugador
			case 1:
				tirada(bolos);
				imprimirBolos(bolos);
				comprobarBolos(bolos);
				
				break;
			//Salida default
			default:
				System.out.println("La opcion elegida no es valida");
				break;
			}
			
			
		} while (tirada != 0);
		
	}
	
	/**
	 * 
	 * @param array
	 */
	public static void valoresBolos(int array[]) {
		
		for (int i = 0; i < array.length; i++) {
			array[i] = 1;
		}
	}
	
	/**
	 * 
	 * @param array
	 */
	public static void imprimirBolos(int array[]) {
		
		int inicioFila = 0;
		for (int i = 4; i > 0; i--) {
			for (int j = Math.abs(i-4); j > 0; j--) {
				System.out.print("  ");
			}
			for (int j = inicioFila; j < inicioFila + i; j++) {
				System.out.print(array[j] + "   ");
			}
			System.out.println();
		}
		
	}
	
	/**
	 * 
	 * @param array
	 */
	public static void tirada(int array[]) {
		
		for (int i = 0; i < array.length; i++) {
			int numAzar = Utils.obtenerNumeroAzar100();
			if (numAzar <=50) {
				array[i] = 0;
			}
		}
		
		
	}

	public static boolean comprobarBolos(int array[]) {
		
		boolean bolosEnPie = true;
		for (int i = 0; i < array.length; i++) {
			if (i == 1) {
				return true;
			}else {
				return false;
			}
			
		}
		if (bolosEnPie = false) {
			System.exit(0);
		}
		return bolosEnPie;
		
		
		
	}
	
	
	
}
