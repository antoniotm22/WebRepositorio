package paqueteZulit.Ejercicios.Examenes.Pruebas;

import javax.swing.JOptionPane;

import paqueteAlmudena.capitulo05.bloque04_arrayMatrices.Utils;

public class ExamenA {

	public static void main(String[] args) {
		
		int bolos[] = new int[10];
		int puntuacionRonda = 10;
		int puntuacionTotal = 0;
		int bolosTirados = 0;
		int bolosTotalTirados = 0;
		
		//Creacion y muestra de la partida
		System.out.println("INICIO DE PARTIDA");
		valoresBolos(bolos);
		imprimirBolos(bolos);
		
		//Variable de la tirada
		int opcion;
		
		do {
			//Mostrar Menu
			opcion = Integer.parseInt(JOptionPane.showInputDialog("Si quiere jugar pulse 1" + '\n' +
					  "Si quiere finalizar partida pulse 0 "));
			
			
			switch (opcion) {
			//Primer caso finalizar programa
			case 0:
				System.out.println("La partida ha finalizado");
			
				break;
			//Segundo caso Tirada del Jugador
			case 1:
				
				puntos(bolos, bolosTirados, bolosTotalTirados);
				
				tirada(bolos);

				puntos(bolos, bolosTirados, bolosTotalTirados);
				
				int bolosNuevosTirados = bolosTotalTirados - bolosTirados;
				
				imprimirBolos(bolos);
				
				puntuacionTotal+= puntuacionRonda * bolosNuevosTirados;
				System.out.println(puntuacionTotal);
				puntuacionRonda/=2;
				
				
				
				break;
			//Salida default
			default:
				System.out.println("La opcion elegida no es valida");
				break;
			}
			
			System.out.println("tirada: " + opcion + " - quedanBolos: " + quedanBolos(bolos));
		} while (opcion != 0 && quedanBolos(bolos));
		
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
			inicioFila += i;
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

	/**
	 * 
	 * @param array
	 * @return
	 */
	public static boolean quedanBolos(int array[]) {
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 1) {
				return true;
			}
		}
		
		return false;
	}
	
	/**
	 * 
	 * @param array
	 * @param puntuacionRonda
	 * @return
	 */
	public static int puntos(int array[], int bolosTirados, int bolosTotalTirados) {
	
		bolosTirados = 0;
		bolosTotalTirados = 0;
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 0) {
				bolosTirados++;
			}
		}
		
		bolosTotalTirados = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 0) {
				bolosTotalTirados++;
			}
		}
		return bolosTotalTirados;
		
		

		
		
	
	}	
}
	
//	for (int i = 0; i < array.length; i++) {
//		if (array[i] == 0) {
//			bolosTirados++;
//
//			}
//		}
//	puntuacionRonda *= bolosTirados;
//	
//	
//	
//	bolosTirados = 0;
//	return puntuacionRonda;
//	}
	

