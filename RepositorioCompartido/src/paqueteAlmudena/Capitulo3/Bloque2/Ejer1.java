package paqueteAlmudena.Capitulo3.Bloque2;

import javax.swing.JOptionPane;

public class Ejer1 {

	public static void main(String[] args) {
		// Media de una cantidad de números introducidos por el usuario. El usuario especificará una cantidad de números, 
		//tras lo cual se le deben pedir tantos como este haya indicado. Al final se debe imprimir la media
		
		String srt;
		int cant;
		int num;
		int suma = 0;
		int media;
		
		srt = JOptionPane.showInputDialog("Introduzca la cantidad de numeros a los que le vas a hacer la media");
		cant = Integer.parseInt(srt);
		
		for (int i = 0; i <cant; i++) {
			srt = JOptionPane.showInputDialog("Introduzca un numero");
			num = Integer.parseInt(srt);
			suma = suma+ num;
		}
		
		media = suma / cant;
		System.out.println("La media es: " + media);
		
	}

}
