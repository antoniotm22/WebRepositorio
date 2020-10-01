package paqueteZulit.Ejercicios;

import javax.swing.JOptionPane;

public class Capitulo3 {

	
	/**
	 * 										**BLOQUE DE EJERCICIOS 1**
	 */
	
	/**
	 * EJERCICIO 1 - RECOGIDA DE NUMEROS MEDIANTE UN BUCLE Y SUMA DE LOS MAYORES DE 10
	 */
	private static void bloque1Ejercicio1 () {
		
		int acumuladorMayoresDeDiez = 0;
		//Bucle para la recogida y suma de los numeros introducidos por el usuario
		for (int i = 0; i < 4; i++) {
			int num = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero"));
			if (num >= 10) {
				acumuladorMayoresDeDiez += num;
			}
			//Mostrar datos usuario
		System.out.println("La suma de los numeros mayores de diez introducidos son = " + acumuladorMayoresDeDiez);			
		}
	}
	
	/**
	 * FIN DEL EJERCICIO 1
	 */
	
	/**
	 * EJERCICIO 2 - RECOGIDA DE NUMEROS MEDIANTE UN BUCLE EL CUAL DEFINE EL USUARIO LA DURACION
	 */
	private static void bloque1Ejercicio2 () {
			
		int acumuladorMayoresDeDiez = 0;
		//Numero de veces que se va a realizar el bucle es escogido por el usuario
		int numerosAPedir = Integer.parseInt(JOptionPane.showInputDialog("Inserte cuantos numeros quiere comprobar : "));
		//Bucle para la recogida y suma de los numeros introducidos por el usuario
		for (int i = 0; i < numerosAPedir; i++) {
			int num = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero"));
			if (num >= 10) {
				acumuladorMayoresDeDiez += num;
			}
			//Mostrar datos usuario
		System.out.println("La suma de los numeros mayores de diez introducidos son = " + acumuladorMayoresDeDiez);			
		}
	}
	
	/**
	 * FIN DEL EJERCICIO 2
	 */
	
	/**
	 * EJERCICIO 3 - RECOGIDA DE NUMEROS HE INDICAR CUALES SON POSITIVOS Y CUALES NEGATIVOS
	 */
	private static void bloque1Ejercicio3 () {
		
		int acumuladorPositivos = 0 , acumuladorNegativos = 0;
		//Numero de veces que se va a realizar el bucle es escogido por el usuario
		int numerosAPedir = Integer.parseInt(JOptionPane.showInputDialog("Inserte cuantos numeros quiere comprobar : "));
		//Bucle para la regida y clasificacion de los numeros introducidos
		for (int i = 0; i < numerosAPedir; i++) {
			int num = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un valor"));
			if (num > 0) {
				acumuladorPositivos ++;
			} else {
				acumuladorNegativos ++;
			}
		}
		System.out.println("Numeros positivos introducidos = " + acumuladorPositivos + '\n'+
						   "Numeros negativos introducidos = " + acumuladorNegativos);
		
	}
	
	/**
	 * FIN DEL EJERCICIO 3
	 */

	/**
	 * 										**FIN DEL BLOQUE DE EJERCICIOS1**
	 */
	public static void main(String[] args) {
		
	}

}
