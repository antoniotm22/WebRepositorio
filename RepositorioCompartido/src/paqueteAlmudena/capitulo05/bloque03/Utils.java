package paqueteAlmudena.capitulo05.bloque03;

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
	
	public static int obtenerNumeroAzar1000 () {
		
		return (int) Math.round(Math.random()*1000);
	}
	
	public static void mostrarArray (int array[]) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		} 
		
	}
	

	
}
