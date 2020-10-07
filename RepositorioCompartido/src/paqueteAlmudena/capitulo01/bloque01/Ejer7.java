package paqueteAlmudena.capitulo01.bloque01;

import javax.swing.JOptionPane;

public class Ejer7 {

	public static void main(String[] args) {
		// Realiza el "complemento a dos" de un número dado por el usuario. El complemento a 
		//dos consiste en dos pasos: en primer lugar se deben cambiar todos los bits del valor 
		//al que el complemento se está aplicando, en segundo lugar se le debe sumar 1 (uno). Este 
		//ejercicio pedirá al usuario un valor y mostrará el complemento a dos del mismo. La impresión debe 
		//hacerse sin signo

		int valor;
		String srt;
		srt = JOptionPane.showInputDialog("Inserte el valor ");
		valor = Integer.parseInt(srt);
	
		//mostramos el valor y el complemento a dos
		//para hacer la imprenson sin signo hay que utilizar ~ 
		
		System.out.println("Valor: "+ valor+
				"\nComplemento a dos :" +( (~valor) + 1));
	}		

}
