package paqueteAlmudena.capitulo05.bloque06_Matrices;

import paqueteAlmudena.capitulo05.bloque04_arrayMatrices.Utils;

public class apartado10_opuesta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int matriz[][] = new int [5][5]; // array bidimensional
		apartado01_rellenaMatriz.rellenaMatriz(matriz);
		apartado02_mostrarMatriz.mostrarMatriz(matriz);
		
		apartado02_mostrarMatriz.mostrarMatriz(matrizOpuesta(matriz));
		
		
	}
	
// - Crea un método que realice la matiz opuesta de la que recibe.
	public static int[][] matrizOpuesta (int matriz [][]) {
		int matrizOpuesta[][] = new int  [matriz[0].length][matriz.length];
				for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				matrizOpuesta[i][j] = matriz[i][j] * -1;
				
			}
		}
	
		System.out.println("\nMATRIZ OPUESTA\n");
		return matrizOpuesta;
				
	}
	
	

}
