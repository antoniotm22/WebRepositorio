package paqueteZulit.Ejercicios.Juego3Puertas;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import paqueteZulit.Ejercicios.Utils;

public class Main {

	public static void main(String[] args) {

		//Variables
		int puertas[] = new int[3];
		int vidas = 3;
		int fallos = 0;

		int rondasGanadas = 0;
		
		String nombre;
		
		int velocidad = 6000;

		//Pide nombre al Usuario
		nombre = JOptionPane.showInputDialog("Inserte su nombre: ");
		//Bucle de juego
		do {
			
			
			// Mido el tiempo de inicio
			long millisAntesDeLaOrdenacion = new Date().getTime();

			//Genero Bandoleros
			generarBandoleros(puertas);
			//Igualo el boolean a true para contador de rondas ganadas
			boolean rondas = true;

			//Bucle de creacion de tablero de juego, comprobacion de disparo y contador de fallos
			for (int i = 0; i < puertas.length; i++) {
				int shot = Integer.parseInt(JOptionPane.showInputDialog("Rondas Ganadas: " + rondasGanadas +'\n'+stringFromArray(puertas)));
				
				//Comprobacion de si el disparo a sido acertado o no
				if (shot != puertas[i]) {
					fallos++;
					JOptionPane.showMessageDialog(null, "Respuesta incorrecta. ", "Has Perdido Una Vida",
							JOptionPane.ERROR_MESSAGE);
					rondas = false;
					break;

				} else {

				}
				
			}
			//Comprobación de si la ronda a sido ganada
			if (rondas == true) {
				rondasGanadas++;
			}

			// Mido el tiempo despuÃ©s
			long millisDespuesDeLaOrdenacion = new Date().getTime();
			//Comprobacion de si la ronda a sido realizada en mas tiempo del permitido 
			if ((millisDespuesDeLaOrdenacion - millisAntesDeLaOrdenacion) > velocidad) {
				JOptionPane.showMessageDialog(null, "Muy lento ", "Has Perdido Una Vida", JOptionPane.ERROR_MESSAGE);
				fallos++;
			} else {
				if (velocidad > 500) {
					velocidad -= 200;
				}
			}
		//Fin del do/while , si las vidas - las fallos es igual a 0 terminar el programa
		} while (vidas - fallos != 0);
		//Mostrar que el programa a sido terminado y mostrar rondas Ganadas
		JOptionPane.showMessageDialog(null,"Tu total de Rondas Ganadas es : " + rondasGanadas +'\n',
									"Eres el Sherif mas Rapido del Condado" , JOptionPane.ERROR_MESSAGE,new ImageIcon("./elbigotes.png"));
		//Introduzccion de puntuaciones en un documento txt
		puntuaciones(rondasGanadas, nombre);
	}
	
	/**
	 * 
	 * @param array
	 * @return
	 */
	public static int[] generarBandoleros(int array[]) {

		for (int i = 0; i < array.length; i++) {
			array[i] = Utils.obtenerNumeroAzar(0, 1);

		}

		return array;
	}

	/**
	 * 
	 * @param array
	 * @return
	 */
	public static String stringFromArray(int array[]) {
		String srt = " ";
		for (int i = 0; i < array.length; i++) {
			srt += array[i] + " ";
		}

		return srt;
	}

	
	/**
	 * 
	 * @param rondasGanadas
	 * @param nombre
	 */
	public static void puntuaciones (int rondasGanadas, String nombre) {
		
		
		
		FileWriter fichero = null;
	        PrintWriter pw = null;
	        try {
	
	
	            fichero = new FileWriter("./src/paqueteZulit/Ejercicios/Juego3Puertas/Puntuaciones",true);
	            pw = new PrintWriter(fichero);
	
	                pw.print("Nombre: "+nombre+"  "+ "Rondas " + rondasGanadas+ '\n');
	                		
	
	        } catch (Exception e1) {
	            e1.printStackTrace();
	        } finally {
	            try {
	
	                if (fichero != null)
	                    fichero.close();
	            } catch (Exception e2) {
	                e2.printStackTrace();
	
	            }
	            System.exit(0);
	        }
	    }
	
	
	
	
	
	
	
	
}
