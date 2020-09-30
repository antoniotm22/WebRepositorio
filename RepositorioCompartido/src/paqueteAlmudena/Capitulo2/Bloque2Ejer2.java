package paqueteAlmudena.Capitulo2;

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
		
		
		
		
		
	}

}
