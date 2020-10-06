package paqueteAntonio.capitulo5;

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
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		//ejercicio1();
		//ejercicio2();
	}

}
