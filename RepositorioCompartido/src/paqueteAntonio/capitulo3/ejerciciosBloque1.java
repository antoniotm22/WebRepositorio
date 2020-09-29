package paqueteAntonio.capitulo3;

import javax.swing.JOptionPane;

public class ejerciciosBloque1 {
	
	/**
	 * 
	 */
	private static void ejercicio1() {
		
		int num;
		int suma=0;
		
		 
		for (int i = 0; i < 4; i++) {
			
			num=Integer.parseInt( JOptionPane.showInputDialog("Introduce numero"));
			
			
			if(num>10) {
				suma+= num;
			}
		}
		System.out.println("La suma de los numeros mayores de 10 es: "+suma);
	}
	
	/**
	 * 
	 */
	private static void ejercicio2() {
		int num;
		int suma=0;
		
	
		int repeticiones=Integer.parseInt( JOptionPane.showInputDialog("Introduce numero de veces a ejecutar"));
		 
		for (int i = 0; i < repeticiones; i++) {
			
			num=Integer.parseInt( JOptionPane.showInputDialog("Introduce numero"));
			
			
			if(num>10) {
				suma+= num;
			}
		}
		System.out.println("La suma de los numeros mayores de 10 es: "+suma);
	}
	
	private static void ejercicio3() {
		boolean esValorPositivo=true;
		int num;
		int contadorNegativo=0;
		int contadorPositivo=0;
		
		int repeticiones=Integer.parseInt( JOptionPane.showInputDialog("Introduce numero de veces a ejecutar"));
	
		
			for (int i = 0; i < repeticiones; i++) {
					int valor=Integer.parseInt( JOptionPane.showInputDialog("Introduce numero de veces a ejecutar"));	
					num=Integer.parseInt( JOptionPane.showInputDialog("Introduce numero"));
						
						if(esValorPositivo==true) {
							
						}
						
						
					}
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
