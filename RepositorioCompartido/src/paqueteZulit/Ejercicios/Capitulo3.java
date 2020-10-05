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
	
	
	/**
	 * 										**BLOQUE DE EJERCICIOS 2**
	 */
	
	/**
	 * EJERCICIO 1 - MEDIA NUMEROS INTRODUCIDOS POR USUARIO
	 */
	
	private static void bloque2Ejercicio1 () {
		//Pedir numeros al usuario
		int numerosAPedir = Integer.parseInt(JOptionPane.showInputDialog("Inserte cuantos numeros quiere comprobar : "));
		int media = 0;
		//Bucle
		for (int i = 0; i < numerosAPedir; i++) {
			// Pido un numero al usuario
			int num = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero"));
			// Acumulador de los numeros introducidos para calcular la media
			media += num;
		}
		//Imprimir en pantalla la media
		System.out.println("La media de los valores introducidos es : " + media);
	}
	
	/**
	 * FIN DEL EJERCICIO 1
	 */
	
	/**
	 * EJERCICIO 2 - MAYOR Y MENOR DE UNA CANTIDAD ELEGIDA POR EL USUARIO
	 */
	
	private static void bloque2Ejercicio2 () {
		int mayor = 0, menor = 0;
		//Elegir cuantos numeros se van a comprobar
		int numerosAPedir = Integer.parseInt(JOptionPane.showInputDialog("Inserte cuantos numeros quiere comprobar : "));
		
		for (int i = 0; i < numerosAPedir; i++) {
			
			int num = Integer.parseInt(JOptionPane.showInputDialog("Inserte los numeros"));
			
			if (i == 0) {
				mayor = num;
				menor = num;
			}else {
				// Comparo con el mayor
				if (num > mayor) mayor = num;
				// Comparo con el menor
				if (num < menor) menor = num;
			}
		}
		System.out.println("El numero mayor es = " + mayor + '\n'+
						   "El numero menor es = " + menor );
		
		
	}
	
	/**
	 * FIN DEL EJERCICIO 2
	 */
	
	/**
	 * EJERCICIO 3 - OBTENER MULTIPLOS DE UN NUMERO INTRODUCIDO POR EL USUARIO
	 */
	
	private static void bloque2Ejercicio3 () {
		
		int num = Integer.parseInt(JOptionPane.showInputDialog("Inserte el valor que quiere comprobar"));
		//Pedir valor al usuario
		
		//Bucle
		for (int i = 0; i <= 100; i++) {
			//Comprobacion del multiplo
			if(i % num == 0) {
				
			}//Imprimir en pantalla
			System.out.println(i + "Es el multiplo de : " + num);
		}
		
		
	}
	
	/**
	 * FIN DEL EJERCICIO 3
	 */
	
	/**
	 * EJERCICIO 4 - OBTENER MULTIPLOS DE UN NUMERO INTRODUCIDO POR EL USUARIO
	 */
	
	private static void bloque2Ejercicio4 () {
		
		int num = Integer.parseInt(JOptionPane.showInputDialog("Inserte el valor "));
		
		//Pedir valor al usuario
		int limite = Integer.parseInt(JOptionPane.showInputDialog("Inserte cual es el limite de numeros que quiere comprobar : "));
		//Bucle
		for (int i = 0; i <= limite; i++) {
			//Comprobacion del multiplo
			if(i % num == 0) {
				//Imprimir en pantalla
				System.out.println(i + "Es el multiplo de : " + num);
			}
		}
	}
	
	/**
	 * FIN DEL EJERCICIO 4
	 */
	
	/**
	 * 										**FIN DEL BLOQUE DE EJERCICIOS 2**
	 */
	
	
	
	
	/**
	 * 										**BLOQUE DE EJERCICIO3**
	 */
	
	/**
	 * EJERCICIO 1 - SUMAR NUMEROS Y SI SE INTRODUCE EL 0 FINALIZA PROGRAMA
	 */
	
	private static void bloque3Ejercicio1 () {
		
		int suma = 0;
		int numerosApedir = Integer.parseInt(JOptionPane.showInputDialog("Inserte cuantos numeros quiere comprobar"));
		
		for (int i = 0; i < numerosApedir; i++) {
			int num = Integer.parseInt(JOptionPane.showInputDialog("Inserte un numero" + '\n' 
									+ "Introduzca 0 para finalizar el programa"));
			if (num == 0) {
				System.out.println("La suma de los valores introducidos hasta el momento es = " + suma );
				System.exit(0);
			} else {
				suma += num;
			}
		}
		System.out.println("La suma de los valores introducidos es = " + suma );
		
	}
	
	/**
	 * FIN DEL EJERCICIO 1
	 */
	
	/**
	 * EJERCICIO 2 - MEDIA NUMEROS Y SI SE INTRODUCE EL 0 FINALIZA PROGRAMA
	 */
	
	private static void bloque3Ejercicio2 () {
		int suma = 0, num = -1, i;

		for (i = 0; num != 0; i++) {
			num = Integer.parseInt(JOptionPane.showInputDialog(
					"Introduzca numero (0 -> Salir): "));
			suma = suma + num;
		}
		
		JOptionPane.showMessageDialog(null, "Media total " + 
				((float) suma / (i-1))); 
	
	}
	
	/**
	 * FIN DEL EJERCICIO 2
	 */
	
	/**
	 * EJERCICIO 3 - VALOR DE MAYOR VALOR
	 */
	
	
	
	/**
	 * 										**FIN DEL BLOQUE DE EJERCICIOS 3**
	 */
	
	public static void main(String[] args) {
		//bloque1Ejercicio1();
		//bloque1Ejercicio2();
		//bloque1Ejercicio3();
		//bloque2Ejercicio1();
		//bloque2Ejercicio2();
		//bloque2Ejercicio3();
		//bloque2Ejercicio4();
		bloque3Ejercicio1();
	}
	
	}




