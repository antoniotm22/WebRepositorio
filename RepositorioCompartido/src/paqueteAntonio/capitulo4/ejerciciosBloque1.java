package paqueteAntonio.capitulo4;

import javax.swing.JOptionPane;

public class ejerciciosBloque1 {

	
	/**
	 * 0º.- Realiza un ejercicio que inicialice un array de 150 elementos enteros al azar entre 0 y 100.
	 *  Debes mostrar el array en pantalla y obtener la suma, la media, el menor y el mayor de todos los números que aparecen en el array.
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
		 System.out.println("El número mas grande es: " + mayor);
		 System.out.println("El numero mas chico es: " + menor);
		
	}
	
	
	/**
	 * 1º.- Realiza un ejercicio que inicialice un array de 150 elementos enteros al azar entre un límite inferior y uno superior que debe especificar el usuario.
	 *  Debes mostrar el array en pantalla para comprobar el funcionamiento
	 */
	private static void ejercicio1() {
		
		int array[] = new int [100];
		
		int limInferior = Integer.parseInt(JOptionPane.showInputDialog("Introduce el límte inferior"));
		int limSuperior = Integer.parseInt(JOptionPane.showInputDialog("Introduce el límte superior"));
		
		for (int i = 0; i < array.length; i++) {
			
			array[i] = (int) Math.round(Math.random()*(limSuperior - limInferior) + limInferior);
			
			System.out.println(array[i]);
		}
		
		
	}
	
	/**
	 * 2º.- Realiza un ejercicio que inicialice un array de 150 elementos enteros al azar entre 0 y 100.
	 *  Después de su inicialización debéis imprimir el array en orden inverso.
	 */
	private static void ejercicio2() {
	
		int array[] = new int[10];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random()*30);
		}
		
		for (int i = 0; i < array.length; i++) {
			
			System.out.println(array[i]);
			
		}
		
		//Salto de línea
		System.out.println();
		
		//bucle for con decremento, el valor de i al principio sera array.length -1 e irá bajando
		for (int i = array.length-1; i >= 0 ; i--) {
			
		System.out.println(	array[i]);
		
		}
		
	}
	
	/**
	 * 3º.- Realiza un ejercicio que inicialice un array de 150 elementos enteros al azar entre 0 y 100. A continuación pedirás al usuario un valor y buscarás dicho valor en el array.
	 *  Si lo encuentras, debes indicar al usuario la posición del array en que se encuenta.
	 *  En caso de que no encuentres el valor buscado, debes indicárselo también al usuario.
	 */
//	private static void ejercicio3() {
//		
//		int array[] = new int[150];
//		int i;
//		
//		int numBuscar= Integer.parseInt(JOptionPane.showInputDialog("Introduce número"));
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
//				System.out.println("No se ha encontrado tu número, inténtalo de nuevo");
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
