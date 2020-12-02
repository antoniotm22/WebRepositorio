package paqueteAlmudena.capitulo05.bloque06_Matrices;

import paqueteAlmudena.capitulo05.bloque04_arrayMatrices.Utils;

public class apartado07_unidimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int matriz[][] = new int [5][5]; // array bidimensional
		apartado01_rellenaMatriz.rellenaMatriz(matriz);
		apartado02_mostrarMatriz.mostrarMatriz(matriz);
		
		System.out.println("Array unidimensional: ");
		
		int arrayUni[] = creaUnidimensional(matriz);
		Utils.mostrarArrayInt(arrayUni);
		System.out.println();
		
	}
	
	// - Crea un método que construya un array unidimensional con todos los elementos de la matriz.
	public static int[] creaUnidimensional (int matriz [][]) {
		
		int contador = 0;
		
		//recorremos las posiciones que tiene qque tener el array
		for (int i = 0; i < matriz.length; i++) {
			contador +=  matriz[i].length;;
			
		}
		
		int arrayUni [] = new int [contador];
		int x = 0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				arrayUni[x] = matriz[i][j];
				x++;
			}
			
		}
		return arrayUni;
		
	
	}
}
