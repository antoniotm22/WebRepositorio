package paqueteAlmudena.capitulo05.bloque04_arrayMatrices;

import javax.swing.JOptionPane;

public class Ejer4_matriz {

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
		
		int arrayUni[] = creaUnidimensional(matriz);
		Utils.mostrarArrayInt(arrayUni);
		System.out.println();
		
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
		
		boolean dispersa = true;
		boolean ceroFila = false;
		boolean ceroColumna = false;
		
		 // comprobamos las filas
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				if (matriz[i][j] == 0) {
					ceroFila = true;
				}
			}
			
			
		}
		//comprobamos columnas
		for (int j = 0; j < matriz.length; j++) {
			for (int i = 0; i < matriz.length; i++) {
				if (matriz[i][j] == 0) {
					ceroColumna = true;
				}
			}
			
		}
		//preguntamos si alguna fila o alguna columna no tiene ningun 0 si es asi la matriz no es dispersa
		
		if (ceroFila == false || ceroColumna == false) {
			dispersa = false;
		}
		
		System.out.println("La matriz es dispersa = " + dispersa);
		
		
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
	
	// - Crea un método que compruebe si la matriz es simétrica. (Los elementos de la matriz (i, j) y (j, i), si existen, son iguales).
	public static void compruebaSimetrica (int matriz [][]) {
		boolean simetrica = true;
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				if (matriz[i][j] != matriz[j][i]) {
					simetrica = false;
					break;
				}
			}
		}
		
		System.out.println("La matriz es simetrica = " + simetrica);
	}
	
	// - Crea un método que realice la matriz traspuesta de la que recibe.
	public static void matrizTraspuesta (int matriz [][]) {
		//creamos la matri traspuesta con las mismas propiedades que la matriz principal
		int matrizTraspuesta [][] = new int [matriz[0].length][matriz.length];
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				matrizTraspuesta[j][i] = matriz[i][j];// le damos la vuelta a los valores
				
			}
		}
		System.out.println("\nMATRIZ TRASPUESTA\n");
		Utils.mostrarMatriz(matrizTraspuesta);
		
	}
	
	// - Crea un método que realice la matiz opuesta de la que recibe.
	public static void matrizOpuesta (int matriz [][]) {
		int matrizOpuesta[][] = new int  [matriz[0].length][matriz.length];
				for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				matrizOpuesta[i][j] = matriz[i][j] * -1;
				
			}
		}
	
		System.out.println("\nMATRIZ OPUESTA\n");
		Utils.mostrarMatriz(matrizOpuesta);
				
	}
	
	//- Crea un método que pida al usuario un número de fila sobre la matriz. Debes crear una matriz igual a la original pero eliminando el número de fila
    //   que el usuario ha especificado.
	public static void quitaFila (int matriz [][]) {
		String srt;
		int filaEliminada;
		int matrizFilaMenos [][] = new int [matriz.length-1][matriz[0].length];
		
		//pedimos la fila que queremos eliminar
		srt = JOptionPane.showInputDialog("Introduzca la fila que quieres eliminar");
		filaEliminada = Integer.parseInt(srt);
		
		if (filaEliminada < 0 || filaEliminada >= matriz.length) {
			Utils.mostrarMatriz(matriz);
		}
		
		
		int filaNueva = 0;
		for (int i = 0; i < matriz.length; i++) {
			if (i != filaEliminada) {
				for (int j = 0; j < matriz.length; j++) {
					matrizFilaMenos[filaNueva][j] = matriz[i][j];
				}
				filaNueva++;
			}
		}
		
		System.out.println("\nMATRIZ CON LA FILA ELIMINADA " + filaEliminada + "\n");
		Utils.mostrarMatriz(matrizFilaMenos);
		
		
		
	}
	
	
	
}
