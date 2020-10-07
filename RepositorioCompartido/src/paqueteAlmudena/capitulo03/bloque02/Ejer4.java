package paqueteAlmudena.capitulo03.bloque02;

import javax.swing.JOptionPane;

public class Ejer4 {

	public static void main(String[] args) {
		// Reforma el ejercicio anterior, para que el límite sea también introducido por el usuario.

		int num;
		String srt;
		int limite;
		
		srt = JOptionPane.showInputDialog("Introduzca el numero");
		num = Integer.parseInt(srt);

		srt = JOptionPane.showInputDialog("Introduzca el limite de de multiplos");
		limite = Integer.parseInt(srt);
		
		for (int i = 0; i <= limite; i++) {
			if (i % num == 0) {
				System.out.println(i + " es multiplo de " + num);
			}
		}
	}

}
