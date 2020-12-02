package paqueteAlmudena.capitulo05.bloque06_Matrices;

public class apartado04_diagonal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int matriz[][] = new int [5][5]; // array bidimensional
		apartado01_rellenaMatriz.rellenaMatriz(matriz);
		apartado02_mostrarMatriz.mostrarMatriz(matriz);
		
		System.out.println("La matriz es diagonal = " + compruebaDiagonal(matriz)); 
		
		
	}
	//- Crea un método que compruebe si la matriz es diagonal (Todos los elementos que no están en la diagonal principal son nulos).
	public static boolean compruebaDiagonal(int matriz [][]) {
		boolean diagonal = true;
		for (int i = 0; i < matriz.length; i++) {
			for (int j=0; j < matriz[i].length; j++) {
				//comprobamos las posiciones que no son de la diagonal si son 0 o no; si son 0 puede ser una matriz diagonal sino no
				  if (i != j) {
					if (matriz[i][j] == 0) {
						diagonal = true;
					}
					else {
						diagonal = false;
						break;
					}
				  }
				  //comprobamos que los valores de la diagonal son distintas de 0
				  if (i == j) {
					if (matriz [i][j] != 0) {
						diagonal = true;
					}
					else {
						diagonal = false;
						break;
					}
				}	  
			}	
		}
		return diagonal;
		
	}

}
