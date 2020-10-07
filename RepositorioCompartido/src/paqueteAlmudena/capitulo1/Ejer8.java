package paqueteAlmudena.Capitulo1;

import javax.swing.JOptionPane;

public class Ejer8 {

	public static void main(String[] args) {
	//  Realiza un programa en C que pida al usuario tres números enteros, y 
	//localice e imprima en pantalla el mayor y el menor de los tres introducidos.

	int var1;
	int var2;
	int var3;
	String srt;
	srt= JOptionPane.showInputDialog("Introduzca un numero entero");
	var1= Integer.parseInt(srt);
	
	srt= JOptionPane.showInputDialog("Introduzca un numero entero");
	var2= Integer.parseInt(srt);
	
	srt= JOptionPane.showInputDialog("Introduzca un numero entero");
	var3= Integer.parseInt(srt);
	
	
	if(var1>var2 && var2>var3) {
		System.out.println("El valor mayor es "+ var1+
				"\nEl valor mas pequeño es "+ var3);
	}
	else {
		if(var1>var2 && var3>var2) {
			System.out.println("El valor mayor es "+var1+
					"\nEl valor mas pequeño es "+ var2);
		}
		else {
			if(var2>var3 && var1>var3) {
				System.out.println("El valor mayor es "+var2+
						"\nEl valor mas pequeño es "+ var3);
			}
			else {
				if(var2>var3 && var3>var1) {
					System.out.println("El valor mayor es "+var2+
							"\nEl valor mas pequeño es "+ var1);
				}
				else {
					if(var3>var1 && var1>var2) {
						System.out.println("El valor mayor es "+var3+
								"\nEl valor mas pequeño es "+ var2);
					}
					else {
						System.out.println("El valor mayor es "+var3+
								"\nEl valor mas pequeño es "+ var1);
						}
					}
				}
			}
		}
	}
}
