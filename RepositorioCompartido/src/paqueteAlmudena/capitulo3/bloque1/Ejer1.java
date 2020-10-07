package paqueteAlmudena.capitulo3.bloque1;

import javax.swing.JOptionPane;

public class Ejer1 {

	public static void main(String[] args) {
		//  Realiza un programa que pida al usuario cuatro números enteros, y calcule la 
		//suma solo de aquellos números introducidos por el usuario, que sean mayores de 
		//10. Es decir, que si el usuario introduce el 5, el 15, el 6 y el 25, el programa
		//debe calcular la suma solo de 15 más 25, ya que 5 y 6 son menores de 10.
		
		int num;
		int suma = 0;
		String srt;
		
		
		for (int i = 0; i < 4; i++) {
			srt = JOptionPane.showInputDialog("Introduzca un numero entero");
			num = Integer.parseInt(srt);
			if (num > 10) {
				suma = suma + num;
			}
		}
		
		System.out.println("El resultado de la suma de los numeros mayores de 10 es: " + suma);
	}

}
