package paqueteAntonio.capitulo4;

import javax.swing.JOptionPane;

public class ejerciciosBloque1 {

	
	/**
	 * 0�.- Realiza un ejercicio que inicialice un array de 150 elementos enteros al azar entre 0 y 100.
	 *  Debes mostrar el array en pantalla y obtener la suma, la media, el menor y el mayor de todos los n�meros que aparecen en el array.
	 * 
	 */
	private static void ejercicio0() {
		
		int mayor,menor, suma;
		
		//Declaramos array, en este caso va a tener 150 elementos
		int array[] = new int[150];
				
		//Recorrer array, le asignamos un valor a cada elemento
		for (int i = 0; i < array.length; i++) {	
		
			array [i] = (int) Math.round(Math.random() * 100);
					
			//Impresion del array
			System.out.println(array[i]);
					
		}
		
		 mayor = array[0];
		 menor = array[0];
		 suma = array[0];
		 
		 for (int i = 0; i < array.length; i++) {
			 
			 suma += array[i];
			 
			 if(menor > array[i]) {
				 menor= array[i];
			 }
			 else {
				 
				 if(mayor < array[i]) {
					 mayor = array[i];
				 }
			 }
			
		}
		 System.out.println("La suma es: " + suma);
		 System.out.println("El n�mero mas grande es: " + mayor);
		 System.out.println("El numero mas chico es: " + menor);
		
	}
	
	
	/**
	 * 1�.- Realiza un ejercicio que inicialice un array de 150 elementos enteros al azar entre un l�mite inferior y uno superior que debe especificar el usuario.
	 *  Debes mostrar el array en pantalla para comprobar el funcionamiento
	 */
	private static void ejercicio1() {
		
		int array[] = new int [100];
		
		int limInferior = Integer.parseInt(JOptionPane.showInputDialog("Introduce el l�mte inferior"));
		int limSuperior = Integer.parseInt(JOptionPane.showInputDialog("Introduce el l�mte superior"));
		
		for (int i = 0; i < array.length; i++) {
			
			array[i] = (int) Math.round(Math.random()*(limSuperior - limInferior) + limInferior);
			
			System.out.println(array[i]);
		}
		
		
	}
	
	/**
	 * 2�.- Realiza un ejercicio que inicialice un array de 150 elementos enteros al azar entre 0 y 100.
	 *  Despu�s de su inicializaci�n deb�is imprimir el array en orden inverso.
	 */
	private static void ejercicio2() {
	
		int array[] = new int[10];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random()*30);
		}
		
		for (int i = 0; i < array.length; i++) {
			
			System.out.println(array[i]);
			
		}
		
		//Salto de l�nea
		System.out.println();
		
		//bucle for con decremento, el valor de i al principio sera array.length -1 e ir� bajando
		for (int i = array.length-1; i >= 0 ; i--) {
			
		System.out.println(	array[i]);
		
		}
		
	}
	
	/**
	 * 3�.- Realiza un ejercicio que inicialice un array de 150 elementos enteros al azar entre 0 y 100. A continuaci�n pedir�s al usuario un valor y buscar�s dicho valor en el array.
	 *  Si lo encuentras, debes indicar al usuario la posici�n del array en que se encuenta.
	 *  En caso de que no encuentres el valor buscado, debes indic�rselo tambi�n al usuario.
	 */
//	private static void ejercicio3() {
//		
//		int array[] = new int[150];
//		int i;
//		
//		int numBuscar= Integer.parseInt(JOptionPane.showInputDialog("Introduce n�mero"));
//		
//		for ( i = 0; i < array.length-1; i++) {
//			
//			array[i]= (int) Math.round(Math.random()*10);
//			System.out.println(array[i]);
//			
//			System.out.println();
//			
//			if(numBuscar == array[]) {
//				System.out.println("Se ha encontrado tu numero en la posicion: " + i);
//				
//			}else {
//				System.out.println("No se ha encontrado tu n�mero, int�ntalo de nuevo");
//			}
//		}
//		
//		
//	}
	
	
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
	
		//ejercicio0();
		//ejercicio1();
		//ejercicio2();
		//ejercicio3();
	}

}
