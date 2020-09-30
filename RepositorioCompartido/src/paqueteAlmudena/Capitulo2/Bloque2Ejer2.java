package paqueteAlmudena.Capitulo2;

import javax.swing.JOptionPane;

public class Bloque2Ejer2 {

	public static void main(String[] args) {
		//Realiza un ejercicio igual al anterior, pero con las dos siguientes diferencias: 
		//no existe la categoría de números negativos, por tanto si el usuario introduce un
		//negativo, el programa debe terminar; la otra diferencia es que, al acabar, el programa 
		//no debe mostrar la suma de los números, sino cuantos han entrado en cada categoría. A esto 
		//se llema contadores, a diferencia del ejercicio anterior, que reciben el nombre de 
		//acumuladores.

		
		//declaramos las variables
		double var1;
		double var2;
		double var3;
		double var4;
		double var5;
		
		
		
		int numBajo = 0; // <= 25
		int numMedio = 0; // >25 && <=250
		int numGrande = 0; // >250
		
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
		
		//quitamos los números negativos
		if (var1 < 0 || var2 < 0 || var3 < 0 || var4 < 0 || var5 < 0) {
			
			System.exit(0);
		}
		
		//seleccionamos los números bajos
		if (var1 <= 25) {
			numBajo = numBajo + 1;
		}
		if (var2 <= 25) {
			numBajo = numBajo + 1;
		}
		if (var3 <= 25) {
			numBajo = numBajo + 1;
		}
		if (var4 <= 25) {
			numBajo = numBajo + 1;
		}
		if (var5 <= 25) {
			numBajo = numBajo + 1;
		}
		
		//seleccionamos los números medios
		
		if (var1 > 25 && var1 <=250) {
			numMedio = numMedio + 1;
		}
		if (var2 > 25 && var2 <=250) {
			numMedio = numMedio + 1;
		}
		if (var3 > 25 && var3 <=250) {
			numMedio = numMedio + 1;
		}
		if (var4 > 25 && var4 <=250) {
			numMedio = numMedio + 1;
		}
		if (var5 > 25 && var5 <=250) {
			numMedio = numMedio + 1;
		}
		
		//seleccionamos los números grandes
		
		if (var1 > 250) {
			numGrande = numGrande + 1;
		}
		if (var2 > 250) {
			numGrande = numGrande + 1;
		}
		if (var3 > 250) {
			numGrande = numGrande + 1;
		}
		if (var4 > 250) {
			numGrande = numGrande + 1;
		}
		if (var5 > 250) {
			numGrande = numGrande + 1;
		}
		
		
		//mostramos en pantala
		
		System.out.println("La cantidad de los numeros bajos son: " + numBajo +  '\n' +
				"La cantidad de los numeros medios son: " + numMedio +  '\n' +
				"La cantidad de los numeros grandes son: " + numGrande);
		
	}

}
