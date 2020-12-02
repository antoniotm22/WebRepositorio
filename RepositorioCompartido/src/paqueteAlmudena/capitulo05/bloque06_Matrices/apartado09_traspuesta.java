package paqueteAlmudena.capitulo05.bloque06_Matrices;

import paqueteAlmudena.capitulo05.bloque04_arrayMatrices.Utils;

public class apartado09_traspuesta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int matriz[][] = new int [5][5]; // array bidimensional
		apartado01_rellenaMatriz.rellenaMatriz(matriz);
		apartado02_mostrarMatriz.mostrarMatriz(matriz);
		
		
		apartado02_mostrarMatriz.mostrarMatriz(matrizTraspuesta(matriz));
		
		

	}
	
	// - Crea un método que realice la matriz traspuesta de la que recibe.
		public static int[][] matrizTraspuesta (int matriz [][]) {
			//creamos la matri traspuesta con las mismas propiedades que la matriz principal
			int matrizTraspuesta [][] = new int [matriz[0].length][matriz.length];
			
			for (int i = 0; i < matriz.length; i++) {
				for (int j = 0; j < matriz.length; j++) {
					matrizTraspuesta[j][i] = matriz[i][j];// le damos la vuelta a los valores
					
				}
			}
			System.out.println("\nMATRIZ TRASPUESTA\n");
			return matrizTraspuesta;
			
		}

}
