package paqueteAntonio.capitulo3;

import javax.swing.JOptionPane;

public class ejerciciosBloque3 {
	
	/**
	 * 
	 * 1�.- Realiza un ejercicio que pida n�meros al usuario. El programa debe detenerse cuando el usuario introduzca el n�mero 0 (cero),
	 *  que no debe tenerse en cuenta para ninguna operaci�n aritm�tica, simplemente para salir de la aplicaci�n.
	 *  Cuando el programa haya terminado, se debe sacar en pantalla el valor de la suma de todos los n�meros.
	 */
	private static void ejercicio1() {
		
		int total=0;
		int num;
		
		//Hago un bucle do while, mientras el usuario no marque 0 no parar�
		do {
			
		 num = Integer.parseInt(JOptionPane.showInputDialog("Introduce n�mero"));
		 
		 total += +num;
			
		}while(num!=0);
		
		System.out.println("La suma es: "+total);
	}
	
	
	/**
	 * 
	 */
	private static void ejercicio2() {
		
		float contador=0f;
		float total=0f;
		int num;
		
		//Hago un bucle do while, mientras el usuario no marque 0 no parar�
		do {
			
		 num = Integer.parseInt(JOptionPane.showInputDialog("Introduce n�mero"));
		 
		 total += +num;
		 contador++;	
		 
		}while(num!=0);
		
		System.out.println("La media es: "+ (total/(contador-1)));
		
	}
	
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		//ejercicio1();
		ejercicio2();

	}

}
