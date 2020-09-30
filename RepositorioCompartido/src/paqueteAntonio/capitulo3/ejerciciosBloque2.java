package paqueteAntonio.capitulo3;

import javax.swing.JOptionPane;

public class ejerciciosBloque2 {

	/**
	 * Método que contiene  el ejercicio 1 del bloque 2 capitulo 3
	 * 
	 * 1º.- Media de una cantidad de números introducidos por el usuario. El usuario especificará una cantidad de números,
	 *  tras lo cual se le deben pedir tantos como este haya indicado. Al final se debe imprimir la media. 
	 */
	private static void ejercicio1(){
		
		// variable para sumar todas las cantidades dadas por el usuario
		float total=0;
		//usuario indica cuantas veces se va a ejecutar el bucle
		float numUsuario= Float.parseFloat(JOptionPane.showInputDialog("introduce numero veces a ejecutar"));
		
		for (int i = 0; i < numUsuario; i++) {
			
			float num= Float.parseFloat(JOptionPane.showInputDialog("Introduce numero"));
			
			//sumamos numero a total
			total += + num;
		}
		
		System.out.println("La media es:  " + total/numUsuario);
	}
	
	/**
	 * Método que contiene ejercicip 2 bloque 2 capitulo 3
	 * 
	 * 2º.- Mayor y menor de una cantidad de números dada por el usuario. El usuario introducirá una cantidad de números,
	 *  tras lo cual se le deben pedir tantos como este haya indicado.
	 *   Al final se debe imprimir el mayor y el menor de todos los introducidos. 
	 */
	private static void ejercicio2(){
		
		int mayor=0;
		int menor=0;
		
		float numUsuario= Float.parseFloat(JOptionPane.showInputDialog("introduce numero veces a ejecutar"));
		
		//Bucle que va a clasificar numeros en menor y mayor
		for (int i = 0; i < numUsuario; i++) {
			
			int num= Integer.parseInt(JOptionPane.showInputDialog("Introduce numero"));
			
			if(num > mayor) {
				mayor= num;
			}
			else {
				if(num < menor) {
					menor = num;
				}
			}
			
			
		}
		//Imprimo por consola el resultado
		System.out.println("El mayor número es: " + mayor);
		System.out.println("El menor número es: " + menor);
		
	}
	
	
	/**
	 * Método que contiene ejercicio 3 bloque 2 capitulo 3
	 * 
	 * 3º.- Ejercicio que obtenga todos los múltiplos de un número introducido por el usuario.
	 *  Se imprimirán todos los múltiplos menores de 100, este será el límite.
	 * 
	 */
	private static void ejercicio3() {
		
		//Pido al usuario que numero quiere buscar sus multiplos
		int num= Integer.parseInt(JOptionPane.showInputDialog("Introduce numero"));
		
		//Bucle que se ejecuta 100 veces
		for (int i = 0; i <=100; i++) {
			
			//Uso el incremento de la i para usar el modulo con la iteracion de la i
			if(i % num == 0) {
				System.out.println("El número "+ i + " es múltiplo de: " + num);
				
			}
		}
		
	}
	
	// Preguntar sobre modulo del bucle, no funciona como deberia.
	
	/**
	 * Método que contiene ejercicio 4 bloque 2 capitulo 3
	 * 
	 * 4º.- Reforma el ejercicio anterior, para que el límite sea también introducido por el usuario.
	 */
	private static void ejercicio4() {
		
		//Variable que determina entre cuantos numeros quiere buscar el usuario
		int numTotales= Integer.parseInt(JOptionPane.showInputDialog("Introduce numero de numeros totales"));
		
		//Pido al usuario que numero quiere buscar sus multiplos
		int num= Integer.parseInt(JOptionPane.showInputDialog("Introduce numero a buscar"));
				
		//Bucle que se ejecuta 100 veces
		for (int i = 0; i <=numTotales; i++) {
					
				//Uso el incremento de la i para usar el modulo con la iteracion de la i
				if(i % num  == 0) {
						System.out.println("El número "+ i + " es múltiplo de: " + num);
						
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
		//ejercicio4();
	}

}
