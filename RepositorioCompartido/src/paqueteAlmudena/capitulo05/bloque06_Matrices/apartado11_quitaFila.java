package paqueteAlmudena.capitulo05.bloque06_Matrices;

import javax.swing.JOptionPane;

import paqueteAlmudena.capitulo05.bloque04_arrayMatrices.Utils;

public class apartado11_quitaFila {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int matriz[][] = new int [5][5]; // array bidimensional
		apartado01_rellenaMatriz.rellenaMatriz(matriz);
		apartado02_mostrarMatriz.mostrarMatriz(matriz);
		
		
		apartado02_mostrarMatriz.mostrarMatriz(quitaFila(matriz));
		
	}
	
	//- Crea un método que pida al usuario un número de fila sobre la matriz. Debes crear una matriz igual a la original pero eliminando el número de fila
    //   que el usuario ha especificado.
	public static int[][] quitaFila (int matriz [][]) {
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
		return matrizFilaMenos;
		
		
		
	}

}
