public class Utils {
	
	/**
	 * 
	 * @return
	 */
	
	public static int ObtenerNumAzarEntero() {
		
		int num = (int) Math.round(Math.random()*100);
		
		return num;
		
	}
	
	

	
	
	
	
	
	/**
	 * 
	 * @return
	 */
	public static double ObtenerNumAzarDouble() {
		
		double num = Math.round(Math.random()*1);
		
		return num;
	}
	
	
	
	/**	Método que devuelve un valor al azar entre dos numeros dados por el usuario.
	 * 
	 * @param limSuperiorValor
	 * @param limInferiorValor
	 * @return
	 */
	public static int ObtenerNumAzarEntreLimites(int limSuperiorValor , int limInferiorValor) {

		int num = (int) Math.round(Math.random()*(limSuperiorValor - limInferiorValor) + limInferiorValor);
		
		return num;
	}
	
	
	
	/**
						FINAL
	 * 
	 * @param elementosArray
	 * @param limInferiorValor
	 * @param limSuperiorValor
	 * @return
	 */
	public static int[] InicializarArrayConLimites(int elementosArray , int limInferiorValor , int limSuperiorValor) {
		
		int array[] = new int[elementosArray];
		int i;
		
		for ( i = 0; i < elementosArray; i++) {
			
			array[i] =  (int) Math.round(Math.random() * (limSuperiorValor - limInferiorValor) + limInferiorValor);
			
			System.out.print(array[i] + " ");
		}
		
		return array;
	}
	

	/**
	 * 
	 * @param array
	 * @return
	 */
	public static int[] burbujaArray(int [] array) {
		
		for (int i = 0; i < array.length; i++) {

			array[i] = (int) Math.round(Math.random() * 1000);
			System.out.print(array[i] + " ");

		}

		System.out.println();
		
		// Bucle donde trabajo el algoritmo, array.length -1 para evitar error
		// outofbounds
		for (int i = 0; i < array.length - 1; i++) {

			for (int j = 0; j < array.length - 1; j++) {

				// Si encuentra un número que cumpla dicha condicion entra en if e intercambia
				// valores
				if (array[j] > array[j + 1]) {

					// Intercambio de valores
					int aux = array[j];
					array[j] = array[j + 1];
					array[j + 1] = aux;

				}
			}
	
		
	}
		//Devuelve array ordenado
		return array;	
	}
	
	/**
	 * 
	 * @param array
	 */
	public static void mostrarArrayEntero(int array[]) {
		
		for (int i = 0; i < array.length; i++) {
			
			System.out.print(array[i] + " ");
		}
	}
	
	public static void mostrarArrayDouble(double array[]) {
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
	
	
	/**
	 * 
	 * @param array
	 */
	public static void inicializarArrayEntero(int array[]) {
		
		for (int i = 0; i < array.length; i++) {
			
			array[i] = Utils.ObtenerNumAzarEntero();
		}
	}
	
	/**
	 * 
	 * @param array
	 */
	public static void inicializarArrayDouble(double array[]) {
		
		for (int i = 0; i < array.length; i++) {
			array[i] = Utils.ObtenerNumAzarDouble();
		}
		
	}
	
	/**
	 * 
	 * @param matrizVar
	 */
	public static void mostrarMatriz (int[][] matrizVar) {
		
		for (int i = 0; i < matrizVar.length; i++) {
			
			
			for (int j = 0; j < matrizVar[i].length; j++) {
				
				System.out.print(matrizVar[i][j] + "\t");
				
			}
			
			System.out.print("\n");
		}
	}
	
	
	/**
	 * 
	 * @param matrizVar
	 * @return
	 */
	public static int[][] rellenarMatrizNumAzarInt (int[][] matrizVar , int limSuperior , int limInferior) {
		
		for (int i = 0; i < matrizVar.length; i++) {
					
					
					
					for (int j = 0; j < matrizVar[i].length; j++) {
						
						matrizVar[i][j] = Utils.ObtenerNumAzarEntreLimites(limSuperior, limInferior);
						
						
					}
					
				}
		return matrizVar;
	}
	
		
	
	
	/**
	 * 
	 * @param valorMatriz
	 * @param valorMatriz2
	 */
	public static void rellenarMatrizNumAleatorio(int valorMatriz , int valorMatriz2) {
		
		int matriz[][] = new int[valorMatriz][valorMatriz2];
		 
		//Método para rellenar von valores aleatorios
		Utils.rellenarMatrizNumAzarInt(matriz, 100, 0);
		
		//Método que muestra los valores de la matriz proporcionada
		Utils.mostrarMatriz(matriz);
		
		
	}
	
	/**
	 * 
	 * @param matrizVar
	 * @return
	 */
	public static boolean comprobarMatrizEsPositiva(int[][] matrizVar) {
		
		boolean negativo = true;
		
		for (int i = 0; i < matrizVar.length; i++) {
			
			for (int j = 0; j < matrizVar[i].length; j++) {
				
				if(matrizVar[i][j] < 0) {
					
					negativo = false;
				}
			}
		}
		System.out.println("Es la matriz positiva: " + negativo);
		return negativo;
		
	}
	
	/**
	 * Comprueba si en la matriz proporcionada es diagonal = diagonal principal solo tiene valores.
	 * 
	 * @param matrizVar
	 * @return
	 */
	public static boolean esMatrizDiagonal(int [][] matrizVar) {
		
		boolean esDiagonal = true;
		
		for (int i = 0; i < matrizVar.length; i++) {
			
			for (int j = 0; j < matrizVar[i].length; j++) {
				
				if(i != j && matrizVar[i][j] != 0 ) {
					
					esDiagonal = false;
				}
			}
		}
		
		return esDiagonal;
	}
	
	/**
	 * Método que comprueba si la matriz es Triangularmente superior
	 * 
	 * @param matrizVar
	 * @return
	 */
	public static boolean esMatrizTriangularSuperior(int [][] matrizVar) {
		
		boolean esSuperior = true;
		
		for (int i = 0; i < matrizVar.length; i++) {
			
			for (int j = 0; j < matrizVar[i].length; j++) {
				
				if(i > j && matrizVar[i][j] != 0) {
					
					esSuperior = false;
				}
			}
		}
		
		
		return esSuperior;
	}
	
	
	
	/**
	 * 
	 * @param matrizVar
	 * @return
	 */
	public static boolean esMatrizDispersa(int [][] matrizVar) {
		
		boolean esDispersa = false;
		boolean hayCeros = false; 
		
		for (int i = 0; i < matrizVar.length; i++) {
			
			 hayCeros = false;
			
			for (int j = 0; j < matrizVar.length; j++) {
				
				if (matrizVar[i][j] == 0) {
					hayCeros = true;
				}
			}
		}
		
		if (hayCeros == true) {
			esDispersa= true;
		}
		return esDispersa;
	}
	
	public static int[][] transponerMatrizEnOtra(int [][] matrizVar ) {
		
		
		
		int[][]nuevaMatriz = new int[matrizVar[0].length] [matrizVar.length];
		
		for (int i = 0; i < matrizVar.length; i++) {
			for (int j = 0; j < matrizVar.length; j++) {
				
				nuevaMatriz[j][i] = matrizVar[i][j];
			}
		}
		
		return nuevaMatriz;
	}
	
	/**
	 * 
	 * @param matriz
	 * @param matrizNueva
	 * @return
	 */
	public static boolean esMatrizTranspuesta( int[][] matriz, int[][] matrizNueva ) {
		
		boolean esTranspuesta = false;
		
		//Para realizar una comparación lógica deberemos de realizar un análisis recursivo.
		//Y para ello tenemos el método .deepEquals(). Este método evaluará de forma cada uno
		//de los elementos que contienen el array bidimensional
		if(Arrays.deepEquals(matriz, matrizNueva)) {
			
			esTranspuesta = true;
		}
		
		return esTranspuesta;
	}
	
	/**
	 * 
	 * @param matrizVar
	 * @param fila
	 * @return
	 */
	Object[] devolverArray(int[][] matrizVar , int fila) {
		
		Object[] array = new Object [matrizVar.length];
		
		
		for (int i = 0; i < matrizVar.length; i++) {
			
			array[i] = matrizVar[i][fila];
		}
		return array;
		
	}
	
//	public ArrayList devuelve(int[][] matrizVar) {
//		
//		
//		
//		for (int i = 0; i < matrizVar.length; i++) {
//			int[] arrayList = matrizVar[i];
//		}
//		
//		
//		return arrayList;
//		
//	}
//	
