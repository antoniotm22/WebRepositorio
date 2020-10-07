package paqueteAlmudena.capitulo02.bloque03;
 
import javax.swing.JOptionPane;

public class Ejer2 {
	public static void main(String[] args) {
		//Realiza una calculadora avanzada, pero con la particularidad de que las operaciones
		//deben ser raices, potencias y el módulo de la división.

		//declaro las variables
		
		String srt;
		int opcion;
		
		//pido la opcion 
		srt = JOptionPane.showInputDialog("Elija la operación que desea realizar: \n"
				+ "1. Raiz \n"
				+ "2. Potencia \n"
				+ "3. Modulo de la división");
		opcion = Integer.parseInt(srt);
		
		//realizamos las operaciones segun la opción
		switch (opcion) {
		case 1: //raiz
			double num;
			srt = JOptionPane.showInputDialog("Inserte el número");
			num = Double.parseDouble(srt);
			
			num = Math.sqrt(num); //calculamos
			
			System.out.println("El resultado de la raiz es: " + num);
			break;
			
		case 2: //potencia
			double numPot;
			int numExp;
			
			srt = JOptionPane.showInputDialog("Inserte el número base");
			numPot = Double.parseDouble(srt);
			
			srt = JOptionPane.showInputDialog("Inserte el número del exponente");
			numExp = Integer.parseInt(srt);
			
			numPot = Math.pow(numPot, numExp);//calculamos
			
			System.out.println(numPot);
			break;
			
		case 3://módulo de la división
			double numerador;
			double denominador;
			double modulo;
			
			srt = JOptionPane.showInputDialog("Inserte el numerador");
			numerador = Double.parseDouble(srt);
			
			srt = JOptionPane.showInputDialog("Inserte el deniminador");
			denominador = Double.parseDouble(srt);
			
			modulo = numerador % denominador;
			
			System.out.println(modulo);
			break;

		default:
			System.out.println("Has intoducido una opción que no esta en el menú");
			break;
		}
	}
}
