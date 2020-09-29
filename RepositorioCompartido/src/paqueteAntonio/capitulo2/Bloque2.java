package paqueteAntonio.capitulo2;

import javax.swing.JOptionPane;

public class Bloque2 {
	
	
	private static void bloque2Ejercicio1 () {
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
	
	
		int numeroNegativo = 0;
		int numeroBajos = 0;
		int numeroMedios = 0;
		int numeroGrandes = 0;
		
		
		
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
		
		
		
		
		System.out.println("Numeros Negativos = " + numeroNegativo + '\n' + 
						   "Numeros Bajos = " + numeroBajos +  '\n' + 
						   "Numeros Medios = " + numeroMedios +  '\n' + 
						   "Numeros Grandes = " + numeroGrandes +  '\n'
						   
				);
		
	}
	
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
