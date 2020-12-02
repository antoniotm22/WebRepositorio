package paqueteAlmudena.capitulo05.bloque06_Matrices;

public class apartado06_dispersa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int matriz[][] = new int [5][5]; // array bidimensional
		apartado01_rellenaMatriz.rellenaMatriz(matriz);
		apartado02_mostrarMatriz.mostrarMatriz(matriz);
		
		System.out.println("La matriz es dispersa = " + compruebaDispersa(matriz));
		
	}
	
	// - Crea un método que compruebe si la matriz es dispersa. (Todos las filas y todas las columnas contienen al menos un elemento nulo)
		public static boolean compruebaDispersa (int matriz [][]) {
			
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
			
			
			return dispersa;
			
		}

}
