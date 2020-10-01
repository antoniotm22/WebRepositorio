package paqueteAlmudena.Capitulo2.Bloque1;
 
import javax.swing.JOptionPane;

public class Ejer5 {
	public static void main(String[] args) {
		// Pedir al usuario cinco números, e imprimir posteriormente el mayor valor 
		//introducido y el menor valor introducido.
		
		//declaramos las variables
		double var1;
		double var2;
		double var3;
		double var4;
		double var5;
		String srt;
		
		//pedimos valores
		srt = JOptionPane.showInputDialog("Introduzca un numero");
		var1 = Double.parseDouble(srt);
		
		srt = JOptionPane.showInputDialog("Introduzca un numero");
		var2 = Double.parseDouble(srt);
		
		srt = JOptionPane.showInputDialog("Introduzca un numero");
		var3 = Double.parseDouble(srt);
		
		srt = JOptionPane.showInputDialog("Introduce el segundo");
		var4 = Double.parseDouble(srt);
		
		srt = JOptionPane.showInputDialog("Introduce el segundo");
		var5 = Double.parseDouble(srt);
		
		//comparamos para saber el mayor
		
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
		
		//comparamos para el menor
		if (var1 <= var2 && var1 <= var3 && var1 <= var4 && var1 <= var5) {
			System.out.println("El menor es: " + var1);
		} 
		else {
			if (var2 <= var1 && var2 <= var3 && var2 <= var4 && var2 <= var5) {
				System.out.println("El menor es: " + var2);
			}
			else {
				if (var3 <= var1 && var3<= var2 && var3 <= var4 && var3 <= var5) {
					System.out.println("El menor es: " + var3);
				}
				else {
					if (var4 <= var1 && var4 <= var2 && var4 <= var3 && var4 <= var5) {
						System.out.println("El menor es: " + var4);
					}
					else {
						System.out.println("El menor es: " + var5);
					}
				}
			}
		}

	}
}
