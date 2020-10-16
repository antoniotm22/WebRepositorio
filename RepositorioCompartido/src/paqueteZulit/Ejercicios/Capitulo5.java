package paqueteZulit.Ejercicios;

import javax.swing.JOptionPane;



public class Capitulo5 {

	/**
	 * 										**BLOQUE 1**
	 */
	
	/**
	 * EJERCICIO 1 - ARRAY DE 150 NUM - CALCULAR MAYOR , MENOR , SUMA , MEDIA
	 */

	private static void bloque1Ejercicio1 () {
		//Inicializar
		int array[] = new int [150];
		int mayor = 0;
		int menor = 0;
		int media = 0;
		int suma = 0;
		
		//Primer bucle para asignar valores al array
		for (int i = 0; i < array.length; i++) {
			
			array[i] = (int) Math.round(Math.random() *100);		
		}
		//Sacar por pantalla el array
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		//Asignamos valores al menor y al mayor
		menor = array[0];
		mayor = array[0];
		
		//bucle para calcular la suma , media
		for (int i = 0; i < array.length; i++) {
			
			suma+=array[i];
			
			media = suma / array.length;
			//Comprbación y asignación del mayor
			if (array[i] > mayor) {
				mayor = array[i];
			}
			else {
				//Comprobación y asignación del menor
				if (array[i] < menor) {
					menor = array[i];
				}
			}
			
		}
		
		System.out.println("El numero mayor es: " + mayor);
		System.out.println("El numero menor es: " + menor);
		System.out.println("La media es: " + media);
		System.out.println("La suma de los numers es: " + suma);
		
		
	}
	
	/**
	 * EJERCICIO 2 - ARRAY 150 - USUARIO ELIGE LIMITE
	 */
	
	private static void bloque1Ejercicio2 () {
		//Iniacilización de el array
		int array[] = new int [150];
		//Pedir limite superior al usuario
		int numSup = Integer.parseInt(JOptionPane.showInputDialog("Inserte el tope superior"));
		//Pedir limite ifnferior al usuario
		int numInf = Integer.parseInt(JOptionPane.showInputDialog("Inserte el tope inferior"));
		
		//Bucle para iniciar el array
		for (int i = 0; i < array.length; i++) {
			
			array [i] = (int) Math.round(Math.random() * (numSup - numInf) + numInf);
		}
		//Bucle para mostrar en pantalla el array
		for (int i = 0; i < array.length; i++) {
			
			System.out.println(array[i]);
		}
		
		
		
	}
	
	/**
	 * EJERCICIO 3 - ARRAY 150 - MOSTRAR ORDEN INVERSO
	 */
	
	private static void bloque1Ejercicio3 () {
		//Asignacion de cantidad de valores dentro del array
		int array[] = new int [150];
		//Bucle para el array 
		for (int i = 0; i < array.length; i++) {
					
					array[i] = (int) Math.round(Math.random() *100);		
				}
		//Bucle para mostrar en pantalla sentido correcto
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]+ "Normal");
		}//Bucle para mostrar en pantalla sentido contrario
		for (int i = array.length-1; i >=0 ; i--) {
			System.out.println(array[i]+ "Invertido");
		}

	}
	
	/**
	 * EJERCICIO 4 - ARRAY 150 - BUSCAR VALOR Y MOSTRAR SI SE ENCUENTRA O NO
	 */
	
	private static void bloque1Ejercicio4 () {
		
		int array[] = new int[150];
		
		int numBusc = Integer.parseInt(JOptionPane.showInputDialog("Inserte el numero que quiere comprobar"));
		//Bucle dar valores al array
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random()*100);
			
			}
		//Bucle para imprimir en pantalla el array
		for (int i = 0; i < array.length; i++) {
					
					System.out.print(array[i] +" ");
				}
		//Condición booleana
		boolean encontrado = false;
		//Bucle para la comprobación de si el numero se encuentra y en que posicion se encuentra
		for (int i = 0; i < array.length; i++) {
			
			if (array[i] == numBusc) {
				JOptionPane.showInputDialog("El valor se encuentra en el array" + '\n' 
										  + "Se ha encontrado en la posicion: " + i);
				encontrado = true;
			}			
		}
		
		if (encontrado == false) {
			JOptionPane.showMessageDialog(null, "El valor si se encuentra en el array");
		}
	
	}

	/**
	 * EJERCICIO 5 - ARRAY 150 - SUMA DE VALORES PAR Y SUMA DE VALORES IMPAR
	 */
	
	private static void bloque1Ejercicio5 () {
		
		int array[] = new int [150];
		int par = 0, impar = 0;
		//Inicialización del array
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random()* 100);
		}
		//Impresión del array
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		//Comprobación de los valores
		for (int i = 0; i < array.length; i++) {
			
			if (array[i] % 2 == 0) {
				par += array[i];
			}else if (array[i] % 2 !=0) {
				impar += array[i];
			}
		}
		
		System.out.println("La suma de los valores pares son: " + par + '\n' +
						   "La suma de los valores impares son : " + impar);
	}
	
	/**
	 * EJERCICIO 6 - ARRAY 150 - SUMA DE VALORES CON INDICE PAR
	 */
	
	private static void bloque1Ejercicio6 () {
		//Creación del array
		int array[] = new int[150];
		int sumapar = 0;
		//Iniacilización del array
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random()* 100);
		}
		//Bucle mostrar por pantalla array
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		//Bucle para la suma de los valores pares
		for (int i = 0; i < array.length; i++) {
			if (i % 2 == 0) {
				sumapar += array[i];
			}
		}
		System.out.println("La suma de los valores con indice par son :" + sumapar);
		
	}
	
	
	/**
	 * 										**BLOQUE 2**
	 */
	
	/**
	 * EJERCICIO 1 - ARRAY 150 - CAMBIAR DE SIGNO A LOS VALORES
	 */
	
	private static void bloque2Ejercicio1 () {
		//creación del array
		int array[] = UtilsArrays.creaArrayNumerosAzar(150, -100, 100);
		//Impresión del array
		UtilsArrays.mostrarArray(array);
		//Bucle para cambiar simbolo de los numeros pares
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				array[i] *= -1;
			}
		}
		UtilsArrays.mostrarArray(array);
		
	}
	
	/**
	 * EJERCICIO 2 - ARRAY 150 - CREA 3 ARRAYS EN EL TERCERO METES LOS VALORES DE LOS OTROS 2
	 */
	
	private static void bloque2Ejercicio2 () {
		//crear arrays
		int primerArray[] = UtilsArrays.creaArrayNumerosAzar(150, 0, 100);
		int segundoArray[] = UtilsArrays.creaArrayNumerosAzar(150, 0, 100);
		int tercerArray[] = new int[150];
		//mostrar los dos primeros arrays
		UtilsArrays.mostrarArray(primerArray);
		UtilsArrays.mostrarArray(segundoArray);
		//Pasar los valores del primer y segundo array al tercero
		for (int i = 0; i < tercerArray.length; i++) {
			if (i % 2 == 0) {
				tercerArray[i] = primerArray[i];
			}
			else {
				tercerArray[i] = segundoArray[i];
			}
		}
		
		//mostrar tercer array ya modificado
		UtilsArrays.mostrarArray(tercerArray);
		

		
	}
	
	/**
	 * EJERCICIO 3 - ARRAY 150 - MULTIPLICAR VALOR INTRODUCIDO POR EL USUARIO POR VALORES DEL ARRAY
	 */
	
	private static void bloque2Ejercicio3 () {
		
		int array[] = UtilsArrays.creaArrayNumerosAzar(150, 0, 100);
		
		int numUsuario = (int)Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero"));
		
		UtilsArrays.mostrarArray(array);
				
		for (int i = 0; i < array.length; i++) {
			array[i] *= numUsuario;
		}
		UtilsArrays.mostrarArray(array);
	}
	
	/**
	 * EJERCICIO 4 - ARRAY 5 - DESPLAZAR VALORES DEL ARRAY
	 */
	
	private static void bloque2Ejercicio4 () {
		
		int array[] = UtilsArrays.creaArrayNumerosAzar(5, 0, 9);
		
		UtilsArrays.mostrarArray(array);
		
		int aux = array[array.length - 1];
		for (int i = array.length - 1; i > 0; i--) {
			array[i] = array[i-1];
		}
		array[0] = aux;
		
		UtilsArrays.mostrarArray(array);
	}

	/**
	 * EJERCICIO 5 - ARRAY 5 - DESPLAZAR VALORES TANTOS COMO USUARIO PIDA
	 */
	
	private static void bloque2Ejercicio5 () {
		//Crear array
		int array[] = UtilsArrays.creaArrayNumerosAzar(5, 0, 9);
		//Pedir numero a usuario
		int numVeces = (int)Integer.parseInt(JOptionPane.showInputDialog("Inserte numero: "));
		//Mostrar array
		UtilsArrays.mostrarArray(array);
		//Bucle veces a ejercutar el movimiento de valores
		for (int j = 0; j < numVeces ; j++) {
			int aux = array[array.length - 1];
			//Bucle mover valores
			for (int i = array.length - 1; i > 0; i--) {
				array[i] = array[i-1];
			}
			array[0] = aux;


		}
		//Imprimir array	
		UtilsArrays.mostrarArray(array);
	}

	/**
	 * EJERCICIO 6 - ARRAY 5 - DESPLAZAR VALORES TANTOS COMO USUARIO PIDA Y DIRECCIÓN ELEGIDA
	 */
	
	public static void bloque2Ejercicio6 () {

		int array[] = UtilsArrays.creaArrayNumerosAzar(5, 0, 9);


		int direccion = Utils.obtenerNumUsuario("Indique dirección de ciclo\n"
				+ '\n'+"0.- Ciclo a derecha"
				+ '\n'+ "1.- Ciclo a izquierda", 0, 1);
		int numCiclos = Utils.obtenerNumUsuario("Elija cuántos ciclos debe realizar");

		// Bucle que repite tantas veces como ha dicho el usuario
		for (int i = 0; i < numCiclos; i++) {
			switch (direccion) {
			case 0: //derecha
				// Comienzo el algoritmo de ciclo
				int aux = array[array.length - 1];
				for (int j = array.length - 1; j > 0; j--) {
					array[j] = array[j-1];
				}
				array[0] = aux;
				// Finalizo el algoritmo del ciclo
				break;
			case 1: //izquierda
				// Salvaguardo la primera posición del array
				aux = array[0];
				// Recorro las posiciones del array de primera a penúltima
				for (int j = 0; j < array.length - 1; j++) {
					array[j] = array[j+1];
				}
				// La primera posición, guardada en aux, pasa a ser la última
				array[array.length-1] = aux;
				break;
			}

		}

	}
	
	/**
	 * 										**BLOQUE 3**
	 */
	
	/**
	 * EJERCICIO 1 - ARRAY 150 - ORDENACIÓN BURBUJA
	 */
	
	public static void bloque3Ejercicio1 () {
		
		int array[] = UtilsArrays.creaArrayNumerosAzar(150, 0, 1000);
		
		int interaccion = 0;
		boolean burbuja = true;
		int actual ;
		
		while (burbuja) {
			interaccion++;
			
			for (int i = 0; i < array.length; i++) {
				
			}
			
			
		}
		
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		//bloque1Ejercicio1();
		//bloque1Ejercicio2();
		//bloque1Ejercicio3();
		//bloque1Ejercicio4();
		//bloque1Ejercicio5();
		//bloque1Ejercicio6();
		//bloque2Ejercicio2();
		//bloque2Ejercicio3();
		//bloque2Ejercicio4();
		bloque2Ejercicio5();
	}

}
