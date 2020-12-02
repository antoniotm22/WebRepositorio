package paqueteAlmudena.capitulo05.bloque06_Matrices;

import paqueteAlmudena.capitulo05.bloque04_arrayMatrices.Utils;

public class apartado01_rellenaMatriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int matriz[][] = new int [5][5]; // array bidimensional
		rellenaMatriz(matriz);
	}
	
	//- Crea un método que rellena la matriz con valores creados al azar.
		public static void rellenaMatriz (int matriz[][]) {
			
			for (int i=0; i < matriz.length; i++) {
				  for (int j=0; j < matriz[i].length; j++) {
					  matriz [i][j] = Utils.obtenerNumeroAzar100();
				  }
			}
			
		}
	

}
