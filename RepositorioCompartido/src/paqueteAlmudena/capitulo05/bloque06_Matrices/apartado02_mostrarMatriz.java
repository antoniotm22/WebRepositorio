package paqueteAlmudena.capitulo05.bloque06_Matrices;
import paqueteAlmudena.capitulo05.bloque06_Matrices.apartado01_rellenaMatriz;
public class apartado02_mostrarMatriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int matriz[][] = new int [5][5]; // array bidimensional
		apartado01_rellenaMatriz.rellenaMatriz(matriz);
		mostrarMatriz(matriz);
		
	}
	
	//- Crea un método que imprima la matriz en pantalla.
		public static void mostrarMatriz (int matriz[][]) {
			
			for (int i=0; i < matriz.length; i++) {
				  for (int j=0; j < matriz[i].length; j++) {
					  System.out.print(matriz[i][j] + "\t");
				  }
				  System.out.println();
			}
		}

}
