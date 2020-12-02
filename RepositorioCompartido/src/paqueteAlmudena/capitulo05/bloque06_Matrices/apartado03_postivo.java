package paqueteAlmudena.capitulo05.bloque06_Matrices;

public class apartado03_postivo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int matriz[][] = new int[5][5]; // array bidimensional
		apartado01_rellenaMatriz.rellenaMatriz(matriz);
		apartado02_mostrarMatriz.mostrarMatriz(matriz);
		System.out.println("La matriz es positiva = " + compruebaPositivo(matriz));
	}

	// - Crea un método que compruebe si la matriz es positiva. (Todos sus elementos
	// mayores o iguales a cero)

	public static boolean compruebaPositivo(int matriz[][]) {
		boolean positiva = true;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {

				if (matriz[i][j] < 0) {
					positiva = false;
					break;
				}
			}
		}
		return positiva;

	}
}
