package paqueteAntonio.capitulo5;

import javax.swing.JOptionPane;

public class ejerciciosBloque2 {

	
	
	/**
	 * 1º.- Realiza un ejercicio que inicialice un array de 150 elementos enteros al azar entre -100 y 100.
	 *  Debes conseguir que todos los números pares del array cambien de signo,
	 *  los positivos deben pasar a negativos y viceversa. 
	 */
	private static void ejercicio1() {
		
		//Declaro array y su extension;
		int array[] = new int[150];
		
		//Inicializamos array
		for (int i = 0; i < array.length; i++) {
			
			//Número aleatorio  *(mayor - menor) + menor
			array[i] = (int) Math.round(Math.random() * (100 - -100) + -100);
				
		}
		
		//Mostramos valores del array
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		System.out.println();
		
		//Mostramos valores del array multiplicado por -1 ,  para cambiar el signo
		for (int i = 0; i < array.length; i++) {
			
			System.out.println(array[i] * -1);
		}
		
	}
	
	/**
	 * 2º.- Realiza un ejercicio que inicialice dos arrays de 150 elementos enteros al azar entre 0 y 100. Debes crear un tercer array, 
	 * compuesto de la siguiente forma: en los elementos de índice impar del tercer array debes copiar los elementos de índice impar del primer array;
	 * . en los elementos de índice par del tercer array debes copiar los elementos de índice par del segundo array.
	 */
	private static void ejercicio2() {
		
		//Declaro los tres arrays
	      int array2[] = new int[5];
	        int array[] = new int[5];
	        int array3[] = new int [5];

			// Inicializamos el contenido del array
			for (int i = 0; i < array.length; i++) {
				array[i] = (int) Math.round(Math.random() * (5));
			}
			
			// Imprimir en la consola el array creado
			for (int i = 0; i < array.length; i++) {
	            System.out.print(array[i] + " ");
	        }
	        
			System.out.println("");   

			// Inicializamos el contenido del array
			for (int i = 0; i < array2.length; i++) {
				array2[i] = (int) Math.round(Math.random() * (5));
			}
			
			System.out.println("");
			
			// Imprimir en la consola el array creado
			for (int i = 0; i < array2.length; i++) {
	            System.out.print(array2[i] + " ");
	        }
			
			System.out.println("");
	    
			//Declaro un bucle para asignar los valores del tercer array
			// Vamos a operar con el tercer array
	        for (int i = 0; i < array3.length; i++) {

	        	
	        //Si la i del 3	array es impar el valor se rellena con el array1
	        if (i % 2 == 1) {
	                array3[i] = array[i];
	        }
	        
	        	//Si la i es par se rellena con el valor del segundo array;
	            if (i % 2 == 0) {
	            array3[i] = array2[i];
	                
	    
	    
	            }
	            System.out.print(array3[i]);   
	            
	        }
	        
	    
	}
	
	
	/**
	 * 
	 * 3º.- Realiza un ejercicio que inicialice un array de 150 elementos enteros al azar entre 0 y 100.
	 *  Debes conseguir multiplicar cada uno de los elementos del array por un número determinado, pedido al usuario.
	 */
	private static void ejercicio3() {
		
		int array [] = new int [10];
		
		int numUsuario = Integer.parseInt(JOptionPane.showInputDialog("Introduce número por el que multiplicar"));
		
		//Recorro array para asignar valores aleatorios
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random()*100);
		}
		
		//Imprimo array de muestra (original sin modificar).
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i] + " ");
		}
		//Salto de línea
		System.out.println();
		
		//Declaro array para trabajar con el, multiplico cada valor por el numUsuario
		for (int i = 0; i < array.length; i++) {
			
			array[i] = array[i] * numUsuario;
		}
		
		//Imprimimos array en consola
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i] + " ");
		}
		
	}
	
	/**
	 * 4º.- Realiza un ejercicio en que inicialice un array de 5 elementos enteros al azar entre 0 y 100.
	 *  Debes conseguir que se desplacen los números un lugar a su derecha, de manera que el desplazamiento sea circular,
	 *  si un número sale por la derecha volverá a entrar por la izquierda. Ejemplo: 1 2 3 4 5 pasa a ser 5 1 2 3 4 que pasa a ser 4 5 1 2 3.
	 * 
	 */
	private static void ejercicio4() {
		int aux;
		int array [] = new int[5];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random()*100);
		}
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i] + " ");
		}
		
		System.out.println();
		
	
		//Con la variable aux guardo el último valor del array, para no perderlo
		aux = array[array.length-1];
		// Bucle donde voy a desplazar.
		for (int i = array.length -1 ; i > 0; i--) {
			
			//Por cada iteracion, voy a hacer que el valor de array[i] sea el de su anterior
			// en el ultimo caso voy a hacer que el último valor lo guardo en una aux.
			
			array[i] = array[i -1];						
		}
		
		//Cuando acaba el bucle, en array de 0, asigno mi valor de aux. No del reves
		array[0] = aux ;
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i] + " ");
		}
	}
	
	
	/**
	 * 5º.- Realiza un ejercicio igual al anterior, pero en el que el usuario pueda indicar la cantidad de posiciones que deseamos desplazar.
	 * 
	 */
	private static void ejercicio5() {
		
		int numVeces = Integer.parseInt(JOptionPane.showInputDialog("Introduce numero de veces a desplazar"));
		int aux;
		int array [] = new int[5];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random()*100);
		}
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i] + " ");
		}
		
		System.out.println();
		
		for (int j = 0; j < numVeces; j++) {
			
		
	
		//Con la variable aux guardo el último valor del array, para no perderlo
		aux = array[array.length-1];
		// Bucle donde voy a desplazar.
		for (int i = array.length -1 ; i > 0; i--) {
			
			//Por cada iteracion, voy a hacer que el valor de array[i] sea el de su anterior
			// en el ultimo caso voy a hacer que el último valor lo guardo en una aux.
			
			array[i] = array[i - 1];						
		}
		
		
		//Cuando acaba el bucle, en array de 0, asigno mi valor de aux. No del reves
		array[0] = aux ;
		
		}
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i] + " ");
		}
	}
	
	/**
	 * 6º.- Realiza un ejercicio igual al anterior, en el que el usuario también pueda deteminar la dirección del movimiento.
	 * 
	 */
	private static void ejercicio6() {
		
		
		int dir = Integer.parseInt(JOptionPane.showInputDialog("Introduce direccion \n "
															+ "1. Derecha \n"
															+ "2. Izquierda"));
		int numVeces = Integer.parseInt(JOptionPane.showInputDialog("Introduce numero de veces a desplazar"));
		int aux;
		int array [] = new int[5];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random()*100);
		}
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		
		System.out.println();
		
		if(dir == 1) {
			
		
		
		for (int j = 0; j < numVeces; j++) {
			
		
	
		//Con la variable aux guardo el último valor del array, para no perderlo
		aux = array[array.length-1];
		// Bucle donde voy a desplazar.
		for (int i = array.length -1 ; i > 0; i--) {
			
			//Por cada iteracion, voy a hacer que el valor de array[i] sea el de su anterior
			// en el ultimo caso voy a hacer que el último valor lo guardo en una aux.
			
			array[i] = array[i - 1];						
		}
		
		
		//Cuando acaba el bucle, en array de 0, asigno mi valor de aux. No del reves
		array[0] = aux ;
		
		}
		
		}else {
			//Izquierda
			for (int j = 0; j < numVeces; j++) {
				
				
				
				//Con la variable aux guardo el último valor del array, para no perderlo
				aux = array[0];
				// Bucle donde voy a desplazar.
				for (int i = 0; i < array.length -1; i++) {
					
				
					
					//Por cada iteracion, voy a hacer que el valor de array[i] sea el de su anterior
					// en el ultimo caso voy a hacer que el último valor lo guardo en una aux.
					
					array[i] = array[i + 1];						
				}
				
				
				//Cuando acaba el bucle, en array de 0, asigno mi valor de aux. No del reves
				array[array.length-1] = aux ;
				
				}
		}
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
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
		//ejercicio5();
		//ejercicio6();
	}

}
