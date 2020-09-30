package paqueteAlmudena.Capitulo1;

import javax.swing.JOptionPane;

public class Ejer5 {

	public static void main(String[] args) {
		// Realiza un programa que pida dos variables al usuario, intercambie los valores de las
	    //dos variables y las muestre en pantalla ANTES y DESPUéS del intercambio de valores.
		
		//declaramos las variables
		String srt;
		Double var1, var2;
		Double x = 0.0; //le asignamos el valor 0 
		Double y= 0.0; //le asignamos el valor 0 
		
		//pedimos los valores
		srt= JOptionPane.showInputDialog("Inserta un numero (var1)");
		var1 = Double.parseDouble(srt);
		
		srt= JOptionPane.showInputDialog("Inserta un numero (var2)");
		var2 = Double.parseDouble(srt);
		
		//Sacamos por pantalla
		System.out.println("Valor de la variable 1 (ANTES): " + var1+
				"\nVarlor de la variable 2(ANTES): "+ var2);
		
		//Intercambiamos variables
		
		x=var1;
		y= var2;
		var2 = x;
		var1= y;
		
		//Mostramos los valores intercambiados
		
		System.out.println("Valor de la variable 1 (AHORA) "+var1+
				"\nValor de la variable 2 (AHORA) "+var2);
		
	}

}
