package paqueteAntonio.capitulo3;

import javax.swing.JOptionPane;

public class ejerciciosBloque1 {
	
	
	
	/**
	 * Método que contiene el ejercicio 1 del bloque 1 del capitulo 1
	 */
	private static void ejercicio1() {
		
		int num;
		int suma=0;
		
		 //El bucle se recorre 4 veces porque asi lo hemos indicado.
		for (int i = 0; i < 4; i++) {
			
			num=Integer.parseInt( JOptionPane.showInputDialog("Introduce numero"));
			
			
			if(num>10) {
				suma+= num;
			}
		}
		System.out.println("La suma de los numeros mayores de 10 es: "+suma);
	}
	
	
	
	
	/**
	 * Método que contiene el ejercicio 2 del bloque 1 del capitulo 3
	 */
	private static void ejercicio2() {
		int num;
		int suma=0;
		
		//Usuario indica cuantas veces se ejecuta el bucle
		int repeticiones=Integer.parseInt( JOptionPane.showInputDialog("Introduce numero de veces a ejecutar"));
		 
		for (int i = 0; i < repeticiones; i++) {
			boolean esValorPositivo=false;
			num=Integer.parseInt( JOptionPane.showInputDialog("Introduce numero"));
			
			//Condicion, si el numero es mayor de 10 se sumará
			if(num>10) {
				suma+= num;
			}
		}
		//Mostramos en pantalla el resultado
		System.out.println("La suma de los numeros mayores de 10 es: "+suma);
	}
	
	
	
	
	/**
	 * Método que contiene el ejercicio 3 del bloque 1 del capítulo 3
	 */
	private static void ejercicio3() {
		
		//Declaracion de variables
		int num;
		int contadorNegativo=0;
		int contadorPositivo=0;
		
		//El usuario indica las veces que se va a recorrer el bucle
		int repeticiones=Integer.parseInt( JOptionPane.showInputDialog("Introduce numero de veces a ejecutar"));
	 
		
			for (int i = 0; i < repeticiones; i++) {
						
					num=Integer.parseInt( JOptionPane.showInputDialog("Introduce numero"));
						
						//si es mayor de 0 es positivo,por lo tanto entra en la condicion
						if(num>=0) {
							//contadorPositivo=contadorPositivo+1;
							//Sumamos 1 al contador positivo
							contadorPositivo++;
							System.out.println("Hay: "+contadorPositivo+" números positivos" );
						}
						else {
							//sumamos 1 al contador negativo
							contadorNegativo++;
							System.out.println("Hay: "+contadorNegativo+" números negativos" );
						}
						
					}
	}
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		//ejercicio1();
		//ejercicio2();
		//ejercicio3();
	}

}
