package paqueteAlmudena.Capitulo3.Bloque1;

import javax.swing.JOptionPane;

public class Ejer3 {

	public static void main(String[] args) {
		//  Realiza un ejercicio que pida números al usuario, tantos como indique el usuario.
		// al final debe aparecer cuantos números positivos y negativos se han introducido.
		

		String srt;
		int cuanNum;
		int num;
		int suma = 0;
		int cantPos = 0;
		int cantNeg = 0;
		
		srt = JOptionPane.showInputDialog("Cuantos numeros quieres pedir");
		cuanNum = Integer.parseInt(srt);
		
		for (int i = 0; i < cuanNum; i++) {
			srt = JOptionPane.showInputDialog("Inserte un numero");
			num = Integer.parseInt(srt);
			
			if (num > 0) {
				cantPos = cantPos + 1;
			}
			else {
				cantNeg = cantNeg + 1;
			}
		}
		
		System.out.println("Hay: " + cantPos + " numeros Positivos\n"
				+ "Hay: " + cantNeg + " numeros Negativos");
		
		
	}

}
