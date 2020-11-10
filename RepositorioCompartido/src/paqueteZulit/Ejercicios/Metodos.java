package paqueteZulit.Ejercicios;

import javax.swing.JOptionPane;

public class Metodos {


	public static boolean metodoMedia4Num () {

		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Inserte el primer valor"));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Inserte el segundo valor"));
		int num3 = Integer.parseInt(JOptionPane.showInputDialog("Inserte el tercer valor"));
		float num4 = Float.parseFloat(JOptionPane.showInputDialog("Inserte el cuarto valor"));
		
		float media = (float) ((num1 + num2 + num3 + num4)/4);
		
		System.out.println("La media de los valores asignados es: " + media);
		
		return true;
	}
	
	public static int obtenerNumeroDeUsuarioEntreMinimoYMaximo (int numMIN , int numMAX) {
		
		int numero;
		
		do {
			String str = JOptionPane.showInputDialog("Inserte el valor a comprobar");
			numero = Integer.parseInt(str);
		} while (!(numero > numMIN && numero < numMAX));
		
		System.out.println("El numero introducido es correcto: " + numero);
		
		return numero;
		
	}
	
	public static boolean maximo (int num1 , int num2) {
		
		int maximo;
		
		if (num1 > num2) {
			maximo = num1;
		}else {
			maximo = num2;
		}
		
		System.out.println("El numero de mayor valor introducido " + maximo);
		
		return true;
	}

	public static boolean numeroImparEntreLimites ( int limInf ,int limSup) {
		
		int numAzar;
		
		do {
			numAzar = Utils.obtenerNumeroAzar(limInf, limSup);
		} while (!(numAzar < limSup && numAzar > limInf && numAzar % 2 != 0));
		
		System.out.println("Este numero es impar y esta comprendido entre el "
						 + "numero inferior y superior , el numero es : " + numAzar);
		
		return true;
	}
	
	public static boolean getStringFromEntero (int limInf, int limSup) {
		
		int num = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero del 1 al 10"));
		
		switch (num) {
		case 1:
			System.out.println("Uno");
			break;
		case 2:
			System.out.println("Dos");
			break;
		case 3:
			System.out.println("Tres");
			break;
		case 4:
			System.out.println("Cuatro");
			break;
		case 5: 
			System.out.println("Cinco");
			break;
		case 6:
			System.out.println("Seis");
			break;
		case 7:
			System.out.println("Siete");
			break;
		case 8:
			System.out.println("Ocho");
			break;
		case 9:
			System.out.println("Nueve");
			break;
		case 10:
			System.out.println("Diez");
		default:
			break;
		}
		
		return true;
	}
	
	
	
	
	public static void main(String[] args) {
		System.out.println("<--------- PRIMER METODO --------->" + '\n');
		
		metodoMedia4Num();
		
		System.out.println('\n');
		System.out.println("<--------- SEGUNDO METODO --------->" + '\n');
		
		obtenerNumeroDeUsuarioEntreMinimoYMaximo(10,20);
		
		System.out.println('\n');
		System.out.println("<--------- TERCER METODO --------->" + '\n');
		
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Inserte el primer numero"));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Inserte el segundo numero"));
		
		maximo(num1, num2);
		
		System.out.println('\n');
		System.out.println("<--------- CUARTO METODO --------->" + '\n');
		
		numeroImparEntreLimites(0, 20);
		
		System.out.println('\n');
		System.out.println("<--------- QUINTO METODO --------->" + '\n');
		
		getStringFromEntero(1, 10);
		
		System.out.println('\n');
		System.out.println("<--------- SEXTO METODO --------->" + '\n');
		
		
		
		
		
	}

}
