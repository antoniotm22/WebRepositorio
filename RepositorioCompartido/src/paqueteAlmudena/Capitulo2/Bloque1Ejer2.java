package paqueteAlmudena.Capitulo2;

import javax.swing.JOptionPane;

public class Bloque1Ejer2 {

	public static void main(String[] args) {
		// Repetir el ejercicio anterior para mostrar el número menor de los dos introducidos

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
		if (var1<var2) {
			System.out.println("El menor es: " + var1);
		}else {
			System.out.println("El menor es: " + var2);
		}

	}

}
