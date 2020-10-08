package paqueteAntonio.capitulo5;

import javax.swing.JOptionPane;	

public class EjerciciosBloque1 {	

	/**	
	 * Método para ejercicio 1 bloque 1 Capitulo 5	
	 * 	
	 * 0º.- Realiza un ejercicio que inicialice un array de 150 elementos enteros al azar entre 0 y 100.	
	 *  Debes mostrar el array en pantalla y obtener la suma, la media,	
	 *  el menor y el mayor de todos los números que aparecen en el array.	
	 */	
	private static void ejercicio0() {	

		int array [] = new int [150];	
		int menor;	
		int mayor;	
		int suma= 0;	
		float media =0; 	

		//Inicializar array	
		for (int i = 0; i < array.length; i++) {	

			array[i]= (int) Math.round(Math.random()*100);	

		}	

		//Mostrar array	
		for (int i = 0; i < array.length; i++) {	
			System.out.println(array[i]);	
		}	

		//Asigno el primer valor del array a las variables creadas 	
		// para compararlas después	
		menor= array[0];	
		mayor= array[0];	


		for (int i = 0; i < array.length; i++) {	


			suma += array[i];	

			media= suma / array.length;	

			if(array[i]> mayor) {	
				mayor = array[i];	
			}else {	

				if(array[i] < menor) {	
					menor = array[i];	
				}	
			}	

		}	

		System.out.println("El total es: " + suma);	
		System.out.println("El menor es: " + menor);	
		System.out.println("El mayor es: " + mayor);	
		System.out.println("La media es: " + media);	

	}	



	/**	
	 * 	
	 * 1º.- Realiza un ejercicio que inicialice un array de 150 elementos enteros al azar entre un límite inferior y uno superior que debe especificar el usuario.	
	 *  Debes mostrar el array en pantalla para comprobar el funcionamiento	
	 * 	
	 */	
	private static void ejercicio1() {	

		int array [] = new int [150];	

		int limSup= Integer.parseInt(JOptionPane.showInputDialog("Introduzca límite superior"));	
		int limInf= Integer.parseInt(JOptionPane.showInputDialog("Introduzca límite inferior"));	

		for (int i = 0; i < array.length; i++) {	

			array[i] = (int) Math.round(Math.random()* (limSup - limInf) + limInf) ;	
		}	

		for (int i = 0; i < array.length; i++) {	
			System.out.println(array[i]);	
		}	

	}	

	/**	
	 * 	
	 * 2º.- Realiza un ejercicio que inicialice un array de 150 elementos enteros al azar entre 0 y 100.	
	 *  Después de su inicialización debéis imprimir el array en orden inverso.	
	 */	
	private static void ejercicio2() {	

		int array [] = new int[10];	

		for (int i = 0; i < array.length; i++) {	

			array[i] = (int) Math.round(Math.random()*100);	
		}	

		//Imprimo el bucle normal para diferenciar cambio	
		for (int i = 0; i < array.length; i++) {	
			System.out.println(array[i]);	
		}	

		System.out.println();	

		//Imprimo en orden inverso	
		for (int i = array.length-1 ; i >= 0; i--) {	
			System.out.println(array[i]);	
		}	

	}	

	/**	
	 * 3º.- Realiza un ejercicio que inicialice un array de 150 elementos enteros al azar entre 0 y 100.	
	 *  A continuación pedirás al usuario un valor y buscarás dicho valor en el array. Si lo encuentras,	
	 *   debes indicar al usuario la posición del array en que se encuenta.	
	 *  En caso de que no encuentres el valor buscado, debes indicárselo también al usuario.	
	 * 	
	 */	
	private static void ejercicio3() {	

		int array [] = new int [150];	
		boolean estaNum = false;	


				int limSup= Integer.parseInt(JOptionPane.showInputDialog("Introduzca límite superior"));	
				int limInf= Integer.parseInt(JOptionPane.showInputDialog("Introduzca límite inferior"));	

				int numABuscar= Integer.parseInt(JOptionPane.showInputDialog("Introduzca número a buscar"));	


				for (int i = 0; i < array.length; i++) {	

					array[i] = (int) Math.round(Math.random()* (limSup - limInf) + limInf) ;	
				}	

				for (int i = 0; i < array.length; i++) {	
					System.out.println(array[i]);	

					if(numABuscar == array[i]) {	
						System.out.println();	
						System.out.println("Se ha encontrado tu número en la posición: " + i);	
						System.out.println();	
						estaNum= true;	
					}	



				}	

				if(estaNum == false) {	
					System.out.println("No se ha encontrado tu numero");	
				}	


	}	


	/**	
	 * 	
	 * 4º.- Realiza un ejercicio que inicialice un array de 150 elementos enteros al azar entre 0 y 100.	
	 *  Debes obtener la suma de los números pares y los impares en variables separadas. 	
	 */	
	private static void ejercicio4() {	

		int array [] = new int[150];	
		int contPares = 0;	
		int contImpares = 0;	

		for (int i = 0; i < array.length; i++) {	

			array[i] = (int) Math.round(Math.random()*100);	
		}	

		for (int i = 0; i < array.length; i++) {	
			System.out.println(array[i] + " ");	
		}	

		for (int i = 0; i < array.length; i++) {	

			if(array[i] % 2 == 0) {	
				contPares += array[i];	
			}else {	
				contImpares += array[i];	
			}	
		}	

		System.out.println("Total pares: " + contPares);	
		System.out.println("Total impares: " + contImpares);	
	}	



	/**	
	 * 	
	 * 5º.- Realiza un ejercicio que inicialice un array de 150 elementos enteros al azar entre 0 y 100.	
	 *  Debes mostrar al usuario la suma de los elementos cuyo índice sea par.	
	 */	
	private static void ejercicio5() {	

		int array [] = new int[10];	
		int contPares = 0;	


		for (int i = 0; i < array.length; i++) {	

			array[i] = (int) Math.round(Math.random()*100);	
		}	

		for (int i = 0; i < array.length; i++) {	
			System.out.println(array[i] + " ");	
		}	

		for (int i = 0; i < array.length; i++) {	

			if(array[i] % 2 == 0) {	
				contPares += array[i];	
			}	
		}	

		System.out.println("Total pares: " + contPares);	


	}	

	/**	
	 * 	
	 * @param args	
	 */	
	public static void main(String[] args) {	

		//ejercicio0();	
		ejercicio1();	
		//ejercicio2();	
		//ejercicio3();	
		//ejercicio4();	
		//ejercicio5();	
	}	

}