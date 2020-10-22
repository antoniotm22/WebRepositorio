package paqueteAlmudena.capitulo05.bloque04;

public class Ejer4 {

	public static void main(String[] args) {
		/**
		 *Realiza un programa que cree un array bidimensional, una matriz, de 5 filas x 5 columnas. Una vez hecho el array, realiza estos pasos:
         *- Crea un método que rellena la matriz con valores creados al azar.
         *- Crea un método que imprima la matriz en pantalla.
	     *- Crea un método que compruebe si la matriz es positiva. (Todos sus elementos mayores o iguales a cero)
	     *- Crea un método que compruebe si la matriz es diagonal (Todos los elementos que no est´an en la diagonal principal son nulos).
	     *- Crea un método que compruebe si la matriz es triangular superior. (Todos los elementos que están por debajo de la diagonal principal son nulos).
	     *- Crea un método que compruebe si la matriz es dispersa. (Todos las filas y todas las columnas contienen al menos un elemento nulo)
	     *- Crea un método que construya un array unidimensional con todos los elementos de la matriz.
	     *- Crea un método que compruebe si la matriz es simétrica. (Los elementos de la matriz (i, j) y (j, i), si existen, son iguales).
         *- Crea un método que realice la matriz traspuesta de la que recibe.
         *- Crea un método que realice la matiz opuesta de la que recibe.
         *- Crea un método que pida al usuario un número de fila sobre la matriz. Debes crear una matriz igual a la original pero eliminando el número de fila
         *    que el usuario ha especificado.
		 **/
		int matriz[][] = new int [5][5]; // array bidimensional
		
		rellenaMatriz(matriz);
		mostrarMatriz(matriz);
		compruebaPositivo (matriz);
		compruebaDiagonal(matriz);
		compruebaTriangular(matriz);
		compruebaDispersa(matriz);
		compruebaUnidimensional(matriz);
		compruebaSimetrica(matriz);
		matrizTraspuesta(matriz);
		matrizOpuesta(matriz);
		quitaFila(matriz);
		
	}
	
	//- Crea un método que rellena la matriz con valores creados al azar.
	public static void rellenaMatriz (int matriz[][]) {
		
		for (int i=0; i < matriz.length; i++) {
			  for (int j=0; j < matriz[i].length; j++) {
				  matriz [i][j] = Utils.obtenerNumeroAzar100();
			  }
		}
		
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
	
	//- Crea un método que compruebe si la matriz es positiva. (Todos sus elementos mayores o iguales a cero)
	
	public static void compruebaPositivo (int matriz[][]) {
		boolean positiva = true;
		for (int i=0; i < matriz.length; i++) {
			  for (int j=0; j < matriz[i].length; j++) {
				  
				  if (matriz[i][j] < 0) {
					positiva = false;
					break;
				  }
				  
				  
			  }
			  
		}
		System.out.println("La matriz es positiva = " + positiva);
	}
	
	//- Crea un método que compruebe si la matriz es diagonal (Todos los elementos que no están en la diagonal principal son nulos).
	
	public static void compruebaDiagonal(int matriz [][]) {
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
		System.out.println("La matriz es diagonal = " + diagonal); 
	}
	
	//- Crea un método que compruebe si la matriz es triangular superior. (Todos los elementos que están por debajo de la diagonal principal son nulos).
	
	public static void compruebaTriangular (int matriz [][]) {
		
		boolean triangular = true;
		for (int i = 1; i < matriz.length; i++) {
			for (int j = 0; j <i; j++) {
				if (matriz[i][j] != 0) {
					triangular = false;
				}
				
			}
		}
		System.out.println("La matriz es triangular = " + triangular);
	}
	
	// - Crea un método que compruebe si la matriz es dispersa. (Todos las filas y todas las columnas contienen al menos un elemento nulo)
	public static void compruebaDispersa (int matriz [][]) {
		
		
		
		
		
		
		
		
	}
	
	// - Crea un método que construya un array unidimensional con todos los elementos de la matriz.
	public static void compruebaUnidimensional (int matriz [][]) {
		
	}
	
	// - Crea un método que compruebe si la matriz es simétrica. (Los elementos de la matriz (i, j) y (j, i), si existen, son iguales).
	public static void compruebaSimetrica (int matriz [][]) {
		
	}
	
	// - Crea un método que realice la matriz traspuesta de la que recibe.
	public static void matrizTraspuesta (int matriz [][]) {
		
	}
	
	// - Crea un método que realice la matiz opuesta de la que recibe.
	public static void matrizOpuesta (int matriz [][]) {
		
	}
	
	//- Crea un método que pida al usuario un número de fila sobre la matriz. Debes crear una matriz igual a la original pero eliminando el número de fila
    //   que el usuario ha especificado.
	public static void quitaFila (int matriz [][]) {
		
		
	}
	
	
	
}
