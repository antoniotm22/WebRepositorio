package paqueteAntonio.capitulo2;

import javax.swing.JOptionPane;

public class Bloque2 {
	
	/**
	 * Método que contiene el ejercicio 1 del bloque 2 del capitulo 2
	 */
	private static void bloque2Ejercicio1 () {
		
		//Pedimos al usuario 5 números
		String str = JOptionPane.showInputDialog("Inserte un valor: ");
		int num1 = Integer.parseInt(str);
		

		str = JOptionPane.showInputDialog("Inserte un valor: ");
		int num2 = Integer.parseInt(str);
		
		
		str = JOptionPane.showInputDialog("Inserte un valor: ");
		int num3 = Integer.parseInt(str);
		
		
		str = JOptionPane.showInputDialog("Inserte un valor: ");
		int num4 = Integer.parseInt(str);
	
	
		str = JOptionPane.showInputDialog("Inserte un valor: ");
		int num5 = Integer.parseInt(str);
	
		//Declaramos contadores
		int numeroNegativo = 0;
		int numeroBajos = 0;
		int numeroMedios = 0;
		int numeroGrandes = 0;
		
		
		//Comprobacion número por número. 1 
		if (num1 < 0 ) {
			numeroNegativo = numeroNegativo + num1;
			}
		if (num1 > 0 && num1 <= 25) {
				numeroBajos = numeroBajos + num1;
			} 
		if (num1 >= 26 && num1 <= 250) {
				numeroMedios = numeroMedios + num1;
			}
		if (num1 > 250) {
				numeroGrandes = numeroGrandes + num1;
			}
			
		//Comprobacion número por número. 2
		if (num2 < 0 ) {
			numeroNegativo = numeroNegativo + num2;
			}
		if (num2 > 0 && num2 <= 25) {
				numeroBajos = numeroBajos + num2;
			} 
		if (num2 >= 26 && num2 <= 250) {
				numeroMedios = numeroMedios + num2;
			}
		if (num2 > 250) {
				numeroGrandes = numeroGrandes + num2;
			}
		
		//Comprobacion número por número. 3
		if (num3 < 0 ) {
			numeroNegativo = numeroNegativo + num3;
			}
		if (num3 > 0 && num3 <= 25) {
				numeroBajos = numeroBajos + num3;
			} 
		if (num3 >= 26 && num3 <= 250) {
				numeroMedios = numeroMedios + num3;
			}
		if (num3 > 250) {
				numeroGrandes = numeroGrandes + num3;
			}
		
		//Comprobacion número por número. 4
		if (num4 < 0 ) {
			numeroNegativo = numeroNegativo + num4;
			}
		if (num4 > 0 && num4 <= 25) {
				numeroBajos = numeroBajos + num4;
			} 
		if (num4 >= 26 && num4 <= 250) {
				numeroMedios = numeroMedios + num4;
			}
		if (num4 > 250) {
				numeroGrandes = numeroGrandes + num4;
			}
		
		////Comprobacion número por número. 5
		if (num5 < 0 ) {
			numeroNegativo = numeroNegativo + num5;
			}
		if (num5 > 0 && num5 <= 25) {
				numeroBajos = numeroBajos + num5;
			} 
		if (num5 >= 26 && num5 <= 250) {
				numeroMedios = numeroMedios + num5;
			}
		if (num5 > 250) {
				numeroGrandes = numeroGrandes + num5;
			}
		
		
		
		//Imprimimos por pantalla resultado de los contadores
		System.out.println("Numeros Negativos = " + numeroNegativo + '\n' + 
						   "Numeros Bajos = " + numeroBajos +  '\n' + 
						   "Numeros Medios = " + numeroMedios +  '\n' + 
						   "Numeros Grandes = " + numeroGrandes +  '\n'
						   
				);
		
	}
	
	/**
	 * Método que contiene ejercicio 2 del bloque 2 del capitulo 2;
	 */
	private static void bloque2Ejercicio2 () {
		String str = JOptionPane.showInputDialog("Inserte un valor: ");
		int num1 = Integer.parseInt(str);
		

		str = JOptionPane.showInputDialog("Inserte un valor: ");
		int num2 = Integer.parseInt(str);
		
		
		str = JOptionPane.showInputDialog("Inserte un valor: ");
		int num3 = Integer.parseInt(str);
		
		
		str = JOptionPane.showInputDialog("Inserte un valor: ");
		int num4 = Integer.parseInt(str);
	
	
		str = JOptionPane.showInputDialog("Inserte un valor: ");
		int num5 = Integer.parseInt(str);
	
	

		int numeroBajos = 0;
		int numeroMedios = 0;
		int numeroGrandes = 0;
		
		
		
		if (num1 < 0 ) {
			System.exit(0);
			}			
		if (num1 > 0 && num1 <= 25) {
				numeroBajos = numeroBajos + num1;
			} 
		if (num1 >= 26 && num1 <= 250) {
				numeroMedios = numeroMedios + num1;
			}
		if (num1 > 250) {
				numeroGrandes = numeroGrandes + num1;
			}
			
		
		if (num2 < 0 ) {
			System.exit(0);
			}
		if (num2 > 0 && num2 <= 25) {
				numeroBajos = numeroBajos + num2;
			} 
		if (num2 >= 26 && num2 <= 250) {
				numeroMedios = numeroMedios + num2;
			}
		if (num2 > 250) {
				numeroGrandes = numeroGrandes + num2;
			}
		
		
		if (num3 < 0 ) {
			System.exit(0);
			}
		if (num3 > 0 && num3 <= 25) {
				numeroBajos = numeroBajos + num3;
			} 
		if (num3 >= 26 && num3 <= 250) {
				numeroMedios = numeroMedios + num3;
			}
		if (num3 > 250) {
				numeroGrandes = numeroGrandes + num3;
			}
		
		
		if (num4 < 0 ) {
			System.exit(0);
			}
		if (num4 > 0 && num4 <= 25) {
				numeroBajos = numeroBajos + num4;
			} 
		if (num4 >= 26 && num4 <= 250) {
				numeroMedios = numeroMedios + num4;
			}
		if (num4 > 250) {
				numeroGrandes = numeroGrandes + num4;
			}
		
		
		if (num5 < 0 ) {
			System.exit(0);
			}
		if (num5 > 0 && num5 <= 25) {
				numeroBajos = numeroBajos + num5;
			} 
		if (num5 >= 26 && num5 <= 250) {
				numeroMedios = numeroMedios + num5;
			}
		if (num5 > 250) {
				numeroGrandes = numeroGrandes + num5;
			}
		
		
		
		
		System.out.println("Numeros Bajos = " + numeroBajos +  '\n' + 
						   "Numeros Medios = " + numeroMedios +  '\n' + 
						   "Numeros Grandes = " + numeroGrandes +  '\n'
						   
				);
	}
	
	/***
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		

	}

}
