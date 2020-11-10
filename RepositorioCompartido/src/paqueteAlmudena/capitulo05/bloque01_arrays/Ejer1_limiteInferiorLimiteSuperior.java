package paqueteAlmudena.capitulo05.bloque01_arrays;

import javax.swing.JOptionPane;

import paqueteAlmudena.capitulo05.bloque04_arrayMatrices.Utils;

public class Ejer1_limiteInferiorLimiteSuperior {

	public static void main(String[] args) {
		//  Realiza un ejercicio que inicialice un array de 150 elementos enteros al azar entre un límite inferior y 
		// uno superior que debe especificar el usuario. Debes mostrar el array en pantalla para comprobar el funcionamiento
		
		int suma = 0;
		int limiteInf = 0;
		int limiteSup = 0;
		float media; 
		String srt;
		
		srt = JOptionPane.showInputDialog("Inserte el limite inferior");
		limiteInf = Integer.parseInt(srt);
		
		srt = JOptionPane.showInputDialog("Inserte el limite superior");
		limiteSup = Integer.parseInt(srt);
		
		
		
		
		int array [] = new int [150]; 
		
		
		
		for (int i = 0; i < array.length; i++) {
			array[i] = Utils.numAleatorioLimSupInf(limiteInf, limiteSup);
			
			System.out.println(array[i]);
			
			
		}
		
		
	}

}
