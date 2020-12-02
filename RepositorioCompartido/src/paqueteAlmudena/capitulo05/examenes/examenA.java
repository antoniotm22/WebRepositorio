package paqueteAlmudena.capitulo05.examenes;

import javax.swing.JOptionPane;

import paqueteAlmudena.capitulo05.bloque04_arrayMatrices.Utils;

public class examenA {

	public static void main(String[] args) {
		// En el momento de inicializar el juego, todos los bolos tendrán un valor de
		// “1”, indicando
		// que el bolo aún se mantiene en pie. La inicialización del juego debe hacerse
		// con una
		// función.
		int bolosJugador1[] = new int[10];
		int bolosJugador2[] = new int[10];
		int valorJuga1 = 10;
		int valorJuga2 = 10;
		int puntosJugador1 = 0;
		int puntosJugador2 = 0;
		int rondas = 0;
		darValoresInicales(bolosJugador1);
		darValoresInicales(bolosJugador2);

		int lanzamiento;
		do {
			lanzamiento = Integer.parseInt(JOptionPane.showInputDialog("MENÚ : \n 0: Salir \n 1: Juega"));
			rondas++;
			switch (lanzamiento) {
			case 0:
				System.exit(0);
			case 1: 
				int jugador = Integer.parseInt(
						JOptionPane.showInputDialog("¿Qué jugador va a jugar? : \n 1: Jugador 1 \n 2: Jugador 2"));
				switch (jugador) {
				case 1:
					puntosJugador1 += (caeBolo(bolosJugador1, valorJuga1, rondas));
					System.out.println("Puntos Totales : " + puntosJugador1);
					imprimirBolos(bolosJugador1);
					valorJuga1 = valorJuga1 / 2;
					break;

				case 2: 
					puntosJugador2 += (caeBolo(bolosJugador2, valorJuga2, rondas));
					System.out.println("Puntos Totales : " + puntosJugador2);
					imprimirBolos(bolosJugador2);

					valorJuga2 = valorJuga2 / 2;

					break;

				}

			}

			System.out.println("Lanzamiento: " + lanzamiento + " - bolosJ1: " + quedanBolos(bolosJugador1) + " - bolosJ2: " + quedanBolos(bolosJugador2));
		} while (lanzamiento != 0 && (quedanBolos(bolosJugador1) == true) && (quedanBolos(bolosJugador2) == true));

		if (puntosJugador1 < puntosJugador2) {
			System.out.println("Ha ganado Jugador 2");
		} else {
			System.out.println("Ha ganado Jugador 1");
		}
	}

	public static void darValoresInicales(int array[]) {
		for (int i = 0; i < array.length; i++) {
			array[i] = 1;
		}
	}

	public static void imprimirBolos(int array[]) {
		System.out.println(array[0] + "\t" + array[1] + "\t" + array[2] + "\t" + array[3] + "\n");
		System.out.println("    " + array[4] + "       " + array[5] + "       " + array[6] + "\n");
		System.out.println("        " + array[7] + "       " + array[8] + "\n");
		System.out.println("            " + array[9]);

		System.out.println();

	}

	public static int caeBolo(int array[], int valor, int rondas) {

		int contador = 0;
		int puntos = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 1) {
				if (puedoDisparar(array, rondas) == true) {
					array[i] = 0;
					contador++;
				}
			}

		}

		puntos = valor * contador;
		System.out.println("Has tirado  " + contador + " bolos");
		System.out.println("Valor de puntuación " + valor);
		System.out.println("Puntos obtenidos en esta ronda: " + puntos);

		return puntos = valor * contador;

	}

	public static boolean puedoDisparar(int array[],int  numRonda) {
		int numAzar = (int) Math.round(Math.random() * 100); // Obtengo un número al azar entre 0 y 100
		// Si el número es menor o igual a la probabilidadDisparo del objeto, decido
		// disparar

	//	int probabilidad = (int) Utils.numAleatorioLimSupInf(30, 70);
		int probabilidad = calculoProbabilidad(numRonda);
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 1) {
				if (numAzar <= probabilidad) {
					return true;
				}

			}
		}

		return false; // Si llego hasta aquí es porque la probabilidad no se ha cumplido

	}

	public static boolean quedanBolos(int array[]) {
		boolean tirados = false;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 1) {
				tirados = true;
				break;
			}
		}

		return tirados;
	}
	
	public static int calculoProbabilidad(int numRonda) {
		
		int probabilidad =Utils.numAleatorioLimSupInf(60, 70)- 15 * numRonda;
		if (probabilidad < 30) {
			probabilidad = 30;
		}
		return probabilidad;
	}

}
