package paqueteAlmudena.capitulo01.bloque01;

import javax.swing.JOptionPane;

public class Ejer3 {

	public static void main(String[] args) {
		//Realiza un programa que pida al usuario tres números y calcule y muestre en pantalla la suma de los tres.

		//Declaramos las variables
		String srt; 
		double var1;
		double suma= 0;
		
		//Guardamos el primer numero
		srt = JOptionPane.showInputDialog("Inserta un numero");
		var1 = Double.parseDouble(srt);
		suma = suma + var1;
		
		//Guardamos el segundo numero
		srt = JOptionPane.showInputDialog("Inserta un numero");
		var1 = Double.parseDouble(srt);
		suma = suma + var1;
		
		//Guardamos el tercer numero
		srt = JOptionPane.showInputDialog("Inserta un numero");
		var1 = Double.parseDouble(srt);
		suma = suma + var1;
		
		System.out.println(suma);			

	}

}
