package paqueteAlmudena.Capitulo2.Bloque1;

import javax.swing.JOptionPane;

public class Ejer3 {
	public static void main(String[] args) {
		//Repetir el ejercicio 1º de este bloque de ejercicios, pero pidiendo al usuario cinco 
		//variables. Es decir, se pedirán al usuario cinco variables y se mostrará el mayor valor 
		//en pantalla.
		
		//declaramos las variables
		double var1;
		double var2;
		double var3;
		double var4;
		double var5;
		String srt;
		
		//pedimos los datos
		srt = JOptionPane.showInputDialog("Introduce el primer valor");
		var1 = Double.parseDouble(srt);
		
		srt = JOptionPane.showInputDialog("Introduce el segundo valor");
		var2 = Double.parseDouble(srt);
		
		srt = JOptionPane.showInputDialog("Introduce el segundo valor");
		var3 = Double.parseDouble(srt);
		
		srt = JOptionPane.showInputDialog("Introduce el segundo valor");
		var4 = Double.parseDouble(srt);
		
		srt = JOptionPane.showInputDialog("Introduce el segundo valor");
		var5 = Double.parseDouble(srt);
		
		//comparamos valores
		
		if (var1 >= var2 && var1 >= var3 && var1 >= var4 && var1 >= var5) {
			System.out.println("El mayor es: " + var1);
		} 
		else {
			if (var2 >= var1 && var2 >= var3 && var2 >= var4 && var2 >= var5) {
				System.out.println("El mayor es: " + var2);
			}
			else {
				if (var3 >= var1 && var3>= var2 && var3 >= var4 && var3 >= var5) {
					System.out.println("El mayor es: " + var3);
				}
				else {
					if (var4 >= var1 && var4 >= var2 && var4 >= var3 && var4 >= var5) {
						System.out.println("El mayor es: " + var4);
					}
					else {
						System.out.println("El mayor es: " + var5);
					}
				}
			}
		}

	}
}
