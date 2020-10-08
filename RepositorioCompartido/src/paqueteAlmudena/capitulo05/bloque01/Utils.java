package paqueteAlmudena.capitulo05.bloque01;

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
	
}
