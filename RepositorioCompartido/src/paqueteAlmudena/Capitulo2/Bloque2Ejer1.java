package paqueteAlmudena.Capitulo2;

import javax.swing.JOptionPane;

public class Bloque2Ejer1 {

	public static void main(String[] args) {
		// Realiza un ejercicio que acumule cinco números introducidos por el usuario, 
		//es decir, que sume las cantidades introducidas, pero realizando cuatro categorías: 
		//números negativos, números bajos (entre 0 y 25, ambos inclusive), números medios 
		//(entre 26 y 250, ambos inclusie) y números grandes (mayores de 250). Al finalizar el 
		//programa, se debe mostrar el total de las sumas de los números introducidos en cada una 
		//de las categorías.
		
		//declaramos las variables
		double var1;
		double var2;
		double var3;
		double var4;
		double var5;
		
		double numNegativo = 0;
		double numBajo = 0;
		double numMedio = 0;
		double numGrande = 0;
		
		String srt;
		
		//pedimos laos valores
		srt = JOptionPane.showInputDialog("Inserte un valor");
		var1 = Double.parseDouble(srt);
		
		srt = JOptionPane.showInputDialog("Inserte un valor");
		var2 = Double.parseDouble(srt);
		
		srt = JOptionPane.showInputDialog("Inserte un valor");
		var3 = Double.parseDouble(srt);
		
		srt = JOptionPane.showInputDialog("Inserte un valor");
		var4 = Double.parseDouble(srt);
		
		srt = JOptionPane.showInputDialog("Inserte un valor");
		var5 = Double.parseDouble(srt);
		
		//seleccionamos los números negativos
		if (var1 < 0) {
			numNegativo = numNegativo + var1;
		}
		if (var2 < 0) {
			numNegativo = numNegativo + var2;
		}
		if (var3 < 0) {
			numNegativo = numNegativo + var3;
		}
		if (var4 < 0) {
			numNegativo = numNegativo + var4;
		}
		if (var5 < 0) {
			numNegativo = numNegativo + var5;
		}
		
		//selecionamos los números bajos
		if (var1 > 0 && var1 <= 25) {
			numBajo = numBajo + var1;
		}
		if (var2 > 0 && var1 <= 25) {
			numBajo = numBajo + var2;
		}
		if (var3 > 0 && var1 <= 25) {
			numBajo = numBajo + var3;
		}
		if (var4 > 0 && var1 <= 25) {
			numBajo = numBajo + var4;
		}
		if (var5 > 0 && var1 <= 25) {
			numBajo = numBajo + var5;
		}
		
		//seleccionamos los números medios
		if (var1 >= 26 && var1 <= 250) {
			numMedio = numMedio + var1;
		}
		if (var2 >= 26 && var1 <= 250) {
			numMedio = numMedio + var2;
		}
		if (var3 >= 26 && var1 <= 250) {
			numMedio = numMedio + var3;
		}
		if (var4 >= 26 && var1 <= 250) {
			numMedio = numMedio + var4;
		}
		if (var5 >= 26 && var1 <= 250) {
			numMedio = numMedio + var5;
		}
		
		//seleccionamos los números grandes
		if (var1 > 250) {
			numGrande = numGrande + var1;
		}
		if (var2 > 250) {
			numGrande = numGrande + var2;
		}
		if (var3 > 250) {
			numGrande = numGrande + var3;
		}
		if (var4 > 250) {
			numGrande = numGrande + var4;
		}
		if (var5 > 250) {
			numGrande = numGrande + var5;
		}
		
		//mostramos las sumas
		System.out.println("Suma de los valores negativos: " + numNegativo +
				"Suma de los valores bajos: " + numBajo +
				"Suma de los valores medios: " + numMedio +
				"Suma de los valores grandes: " + numGrande);

	}

}
