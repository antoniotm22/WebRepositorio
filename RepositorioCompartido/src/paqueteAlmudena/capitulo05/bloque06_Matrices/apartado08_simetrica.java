package paqueteAlmudena.capitulo05.bloque06_Matrices;

public class apartado08_simetrica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int matriz[][] = new int [5][5]; // array bidimensional
		apartado01_rellenaMatriz.rellenaMatriz(matriz);
		apartado02_mostrarMatriz.mostrarMatriz(matriz);
		
		System.out.println("La matriz es simetrica = " + compruebaSimetrica(matriz));
		
		

	}
	
	// - Crea un método que compruebe si la matriz es simétrica. (Los elementos de la matriz (i, j) y (j, i), si existen, son iguales).
		public static boolean compruebaSimetrica (int matriz [][]) {
			boolean simetrica = true;
			
			for (int i = 0; i < matriz.length; i++) {
				for (int j = 0; j < matriz.length; j++) {
					if (matriz[i][j] != matriz[j][i]) {
						simetrica = false;
						break;
					}
				}
			}
			
			return simetrica;
			
		}

}
