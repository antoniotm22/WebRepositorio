package paqueteAlmudena.capitulo05.bloque06_Matrices;

public class apartado05_triangular {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int matriz[][] = new int [5][5]; // array bidimensional
		apartado01_rellenaMatriz.rellenaMatriz(matriz);
		apartado02_mostrarMatriz.mostrarMatriz(matriz);
		
		System.out.println("La matriz es triangular = " + compruebaTriangular(matriz));
		
	}
	//- Crea un método que compruebe si la matriz es triangular superior. (Todos los elementos que están por debajo de la diagonal principal son nulos).
	
		public static boolean compruebaTriangular (int matriz [][]) {
			
			boolean triangular = true;
			for (int i = 1; i < matriz.length; i++) {
				for (int j = 0; j <i; j++) {
					if (matriz[i][j] != 0) {
						triangular = false;
					}
					
				}
			}
			
			return triangular;
			
		}
}
