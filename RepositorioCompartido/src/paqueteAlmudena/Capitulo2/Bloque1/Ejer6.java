package paqueteAlmudena.Capitulo2.Bloque1;
 
import javax.swing.JOptionPane;

public class Ejer6 {
	public static void main(String[] args) {
		// Realizar un ejercicio que pida un número al usuario e indique en pantalla si se 
		//trata de un número par o impar. Recuerda que un número par es aquel cuyo resto de su 
		//división entre dos sea siempre cero, y recuerda que un número impar es aquel cuyo resto 
		//de su división entre dos sea siempre uno.

		//declaramos las variables
		int var1;
		String srt;
		
		//pedimos el valor
		srt = JOptionPane.showInputDialog("Inserta el valor");
		var1 = Integer.parseInt(srt);
		
		//comparamos con bits
		if ((var1 % 2) == 1) {
			System.out.println("Es impar");
		}
		else {
			System.out.println("Es par");
		}

	}
}
