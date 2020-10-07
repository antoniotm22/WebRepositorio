package paqueteAntonio.capitulo3;

import javax.swing.JOptionPane;

public class EjerciciosBloque2 {

	/**
	 * M�todo que contiene  el ejercicio 1 del bloque 2 capitulo 3
	 * 
	 * 1�.- Media de una cantidad de n�meros introducidos por el usuario. El usuario especificar� una cantidad de n�meros,
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
	 * M�todo que contiene ejercicip 2 bloque 2 capitulo 3
	 * 
	 * 2�.- Mayor y menor de una cantidad de n�meros dada por el usuario. El usuario introducir� una cantidad de n�meros,
	 *  tras lo cual se le deben pedir tantos como este haya indicado.
	 *   Al final se debe imprimir el mayor y el menor de todos los introducidos. 
	 */
	private static void ejercicio2(){
		
		int num;
		int aux;
		int mayor=0;
		int menor=0;
		
		
		float numUsuario= Float.parseFloat(JOptionPane.showInputDialog("introduce numero veces a ejecutar"));
		
		//Bucle que va a clasificar numeros en menor y mayor
		for (int i = 0; i < numUsuario; i++) {
			
			num= Integer.parseInt(JOptionPane.showInputDialog("Introduce numero"));
			
			
			if(i == 0) {
				mayor = num;
				menor = num;
			}
			else {
			
				if(num < menor) menor = num;
				
				if(num > mayor) mayor = num;
					
				
			}
			
			
		}
		//Imprimo por consola el resultado
		System.out.println("El mayor n�mero es: " + mayor);
		System.out.println("El menor n�mero es: " + menor);
		
	}
	
	
	/**
	 * M�todo que contiene ejercicio 3 bloque 2 capitulo 3
	 * 
	 * 3�.- Ejercicio que obtenga todos los m�ltiplos de un n�mero introducido por el usuario.
	 *  Se imprimir�n todos los m�ltiplos menores de 100, este ser� el l�mite.
	 * 
	 */
	private static void ejercicio3() {
		
		//Pido al usuario que numero quiere buscar sus multiplos
		int num= Integer.parseInt(JOptionPane.showInputDialog("Introduce numero"));
		
		//Bucle que se ejecuta 100 veces
		for (int i = 0; i <=100; i++) {
			
			//Uso el incremento de la i para usar el modulo con la iteracion de la i
			if(i % num == 0) {
				System.out.println("El n�mero "+ i + " es m�ltiplo de: " + num);
				
			}
		}
		
	}
	
	// Preguntar sobre modulo del bucle, no funciona como deberia.
	
	/**
	 * M�todo que contiene ejercicio 4 bloque 2 capitulo 3
	 * 
	 * 4�.- Reforma el ejercicio anterior, para que el l�mite sea tambi�n introducido por el usuario.
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
						System.out.println("El n�mero "+ i + " es m�ltiplo de: " + num);
						
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
		//ejercicio3();
		//ejercicio4();
	}

}
