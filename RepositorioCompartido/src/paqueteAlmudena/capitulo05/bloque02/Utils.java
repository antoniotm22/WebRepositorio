package paqueteAlmudena.capitulo05.bloque02;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import javax.swing.JOptionPane;

public class Utils {

	
	public static int obtenerNumeroAzar () { 
		 return (int) Math.round(Math.random() *100);
	}
	
	public static int numAleatorioLimSupInf (int limiteSup, int limiteInf) {
		
		return (int) Math.round(Math.random()* (limiteSup - limiteInf) + limiteInf);
	}
	
	public static int[] creaArrayNumerosAzarMenos100 (int longitud, int limInf, int limSup) {
		int array[] = new int[longitud];
		for (int i = 0; i < array.length; i++) {
			array[i] = obtenerNumeroAzar();
		}
		return array;
	}
	
}
