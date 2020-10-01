package paqueteAlmudena.Capitulo2.Bloque3;

import javax.swing.JOptionPane;

public class Ejer1 {
	public static void main(String[] args) {
		// Realiza un ejercicio que califique la nota obtenida por un alumno/a en un examen. 
		//El ejercicio pedirá al usuario la nota numérica, y se imprimirá en pantalla su traducción a
		//nota de texto: muy deficiente, insuficiente, suficiente, bien, notable y sobresaliente. 
		//Debes realizar el ejercicio a través de una sentencia switch, no de if anidados.
		
		//declaramos las variables
		String srt;
		int nota;
		
		//pedimos la nota
		srt = JOptionPane.showInputDialog("Inserte la nota");
		nota = Integer.parseInt(srt);
		
		//clasificamos
		switch (nota) {
		case 1:
			System.out.println("Muy deficiente");
			break;
		case 2:
			System.out.println("Muy deficiente");
			break;
		case 3:
			System.out.println("Insuficiente");
			break;
		case 4:
			System.out.println("Insuficiente");
			break;
		case 5:
			System.out.println("Suficiente");
			break;
		case 6:
			System.out.println("Bien");
			break;
		case 7:
			System.out.println("Notable");
			break;
		case 8:
			System.out.println("Notable");
			break;
		case 9:
			System.out.println("Sobresaliente");
			break;
		case 10:
			System.out.println("Sobresaliente");
			break;
		default:
			break;
		}
	}
}
