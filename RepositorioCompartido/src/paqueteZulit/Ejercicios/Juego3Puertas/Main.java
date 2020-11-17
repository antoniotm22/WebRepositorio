package paqueteZulit.Ejercicios.Juego3Puertas;

import java.util.Date;

import javax.swing.JOptionPane;
import paqueteZulit.Ejercicios.Utils;

public class Main {

	public static void main(String[] args) {

		int puertas[] = new int[3];
		int vidas = 3;
		int fallos = 0;

		int rondasGanadas = 0;

		int velocidad = 6000;

		do {
			// Mido el tiempo de inicio
			long millisAntesDeLaOrdenacion = new Date().getTime();

			generarBandoleros(puertas);

			boolean rondas = true;

			for (int i = 0; i < puertas.length; i++) {
				int shot = Integer.parseInt(JOptionPane
						.showInputDialog("Rondas Ganadas: " + rondasGanadas + '\n' + stringFromArray(puertas)));

				if (shot != puertas[i] && shot != 0 && shot != 1) {
					fallos++;
					JOptionPane.showMessageDialog(null, "Respuesta incorrecta. ", "Has Perdido Una Vida0",
							JOptionPane.ERROR_MESSAGE);
					rondas = false;
					break;

				} else {

				}
				

			}
			if (rondas = true) {
				rondasGanadas++;
			}

			// Mido el tiempo después
			long millisDespuesDeLaOrdenacion = new Date().getTime();

			if ((millisDespuesDeLaOrdenacion - millisAntesDeLaOrdenacion) > velocidad) {
				JOptionPane.showMessageDialog(null, "Muy lento ", "Has Perdido Una Vida0", JOptionPane.ERROR_MESSAGE);
				fallos++;
			} else {
				if (velocidad > 500) {
					velocidad -= 200;
				}
			}

		} while (vidas - fallos != 0);

		JOptionPane.showInputDialog("Tu total de Rondas Ganadas es : " + rondasGanadas +
									"Eres el Sherif mas Rapido del Condado");
	}

	public static int[] generarBandoleros(int array[]) {

		for (int i = 0; i < array.length; i++) {
			array[i] = Utils.obtenerNumeroAzar(0, 1);

		}

		return array;
	}

	public static String stringFromArray(int array[]) {
		String srt = " ";
		for (int i = 0; i < array.length; i++) {
			srt += array[i] + " ";
		}

		return srt;
	}

}
