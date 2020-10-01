package paqueteAlmudena.Capitulo2.Bloque1;

import javax.swing.JOptionPane;

public class Ejer1 {
	public static void main(String[] args) {
		//Realiza un ejercicio que pida dos variables al usuario, tras lo cual, muestre en pantalla
		//el número mayor de los dos introducidos.
		
		//declaramos las variables
		double var1;
		double var2;
		String srt;
		
		//pedimos los datos
		srt = JOptionPane.showInputDialog("Introduce el primer valor");
		var1 = Double.parseDouble(srt);
		
		srt = JOptionPane.showInputDialog("Introduce el segundo valor");
		var2 = Double.parseDouble(srt);
		
		//comparamos valores
		if (var1>var2) {
			System.out.println("El mayor es: " + var1);
		}else {
			System.out.println("El mayor es: " + var2);
		}

	}
}
