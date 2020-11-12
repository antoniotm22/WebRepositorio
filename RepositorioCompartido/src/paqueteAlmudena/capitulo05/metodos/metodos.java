package paqueteAlmudena.capitulo05.metodos;

import javax.swing.JOptionPane;
import javax.swing.event.SwingPropertyChangeSupport;

import paqueteAlmudena.capitulo05.bloque04_arrayMatrices.Utils;

public class metodos {

	public static void main(String[] args) {
	//  EJERCICIO 1
		System.out.println("-------------------- EJERCICIO 1 ------------------\n");
		System.out.println(media(2 , 2 , 2 , 2.8f));
		System.out.println("");
		
	//	EJERCICIO 2
		System.out.println("-------------------- EJERCICIO 2 ------------------\n");
		System.out.println("Valor entre dos numeros : " + obtenerNumeroDeUsuarioEntreMinimoYMaximo(8, 20));
		System.out.println("");
		
	//	EJERCICIO 3
		System.out.println("-------------------- EJERCICIO 3 ------------------\n");
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("EJERCICIO3:\nIntroduce un numero"));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("EJERCICIO3:\nIntroduce otro numero"));
		System.out.println("El mayor de los dos es : " + maximo(num1, num2));
		System.out.println("");
		
	//	EJERCICIO 4
		System.out.println("-------------------- EJERCICIO 4 ------------------\n");
		System.out.println("Número impar entre dos limites : " + numeroImparEntreLimites(6, 10));
		System.out.println("");
		
	//  EJERCICIO 5
		System.out.println("-------------------- EJERCICIO 5 ------------------\n");
		System.out.println("El número escrito es : " + getStringFromEntero(5));
		System.out.println("");
		
	//  EJERCICIO 6 
		System.out.println("-------------------- EJERCICIO 6 ------------------\n");
		System.out.print("El orden de menor a mayor es: ");
		imprimeMinimoAMaximo(20, 100, 50);
		System.out.println("");
		
	//  EJERCICIO 7
		System.out.println("\n-------------------- EJERCICIO 7 ------------------\n	Serie FIBONACCI\n");
		int log = Integer.parseInt(JOptionPane.showInputDialog("EJERCICIO7:\nIntroduce la congitud de la cadena de Fibonacci"));
		fibonacci(log);
		System.out.println("");
	// EJERCICIO 8
		System.out.println("\n-------------------- EJERCICIO 8 ------------------\n	Array:\n");
		int arrayEjer8[] = new int [5];
		for (int i = 0; i < arrayEjer8.length; i++) {
			
			arrayEjer8[i]  = Utils.obtenerNumeroAzar100();
			
		}
		imprimeArray(arrayEjer8);
		
		System.out.println("");
	
	//EJERCICIO 9 
		System.out.println("\n-------------------- EJERCICIO 9 ------------------\n Recorte :\n");
		int arrayEjer9[] = new int [10];
		for (int i = 0; i < arrayEjer9.length; i++) {
			arrayEjer9[i]  = Utils.obtenerNumeroAzar100();
		}
		
		recorte(arrayEjer9, 1, 5);
		System.out.println("");
	
	//EJERCICIO 10
		System.out.println("\n-------------------- EJERCICIO 10 ------------------\n Recursividad:\n");
		recursividad(100);
		
		
	}
	
	public static float media (int n1, int n2, int n3, float n4) {
		//Método que reciba como parámetros de entrada tres valores enteros y uno flotante. El método se llamará 
		//"media" y debe devolver la media aritmética de los cuatro valores. El valor devuelto debe ser flotante. 
		//El método "main" debe llamar a este otro método, con valores inventados por ti, e imprimir el valor de la 
		//media en la consola de salida.
		
		float resultado = (n1 + n2 + n3 + n4) / 4 ;
		return resultado;
	}
	
	public static int obtenerNumeroDeUsuarioEntreMinimoYMaximo ( int minimo, int maximo) {
		//Método llamado "obtenerNumeroDeUsuarioEntreMinimoYMaximo" que reciba dos valores enteros: un valor mínimo y un 
		//valor máximo. El método debe pedir un numero al usuario. El método examinará el número introducido por el usuario 
		//y, si dicho número no está entre el valor mínimo y el máximo que se ha indicado, seguirá pidiendo números al usuario
		//hasta que se obtenga uno válido. Finalmente se debe devolver dicho valor del usuario al método main, que lo imprimirá 
		//en la consola
		
		String srt;
		int numero;
		
		do {
			srt = JOptionPane.showInputDialog("EJERCICIO 2:\nIntroduce un número");
			numero = Integer.parseInt(srt);
			
		} while (!(numero > minimo && numero < maximo));
		
		return numero;
		
	}
	
	public static int maximo (int num1, int num2) {
		//Método llamado "maximo" que devuelva el valor máximo de dos números enteros recibidos como argumentos de entrada. 
		//El método main pedirá dos números al usuario y los enviará a este nuevo método. Finalmente imprimirá en consola el 
		//valor devuelto por el método.
		int maxim = 0;
		if (num1 >= num2) {
			maxim = num1;
		}
		if (num2 > num1) {
			maxim = num2;
		}
		
		return maxim;
		
	}
	
	public static int numeroImparEntreLimites (int limInf, int limSup) {
		//	Método llamado "numeroImparEntreLimites" que devuelva un número entero aleatorio, impar y comprendido entre dos 
		//	límites recibidos como parámetros de entrada. "main" debe llamar a este método e imprimir el valor devuelto.
		int numero = 0;
		
		do {
			numero = Utils.numAleatorioLimSupInf(limInf, limSup);
			
		} while (!(numero % 2 != 0));
		
		return numero;
	}

	
	public static String getStringFromEntero (int valor) {
	//	Realiza un método que reciba un valor entero, del 1 al 10, como argumento de entrada y devuelva un String, 
	//	con  dicho número escrito en palabras. Llama a este método "getStringFromEntero".
		String srt  = "";
		switch (valor) {
		case 1: 
			srt = "uno";
			break;
		case 2: 
			srt = "dos";
			break;
		case 3: 
			srt = "tres";
			break;
		case 4: 
			srt = "cuatro";
			break;
		case 5: 
			srt = "cinco";
			break;
		case 6: 
			srt = "seis";
			break;
		case 7: 
			srt = "siete";
			break;
		case 8:
			srt = "ocho";
			break;
		case 9: 
			srt = "nueve";
			break;
		case 10:
			srt = "diez";	
			break;
		default:
			System.out.println("valor no encontrado");

		}
		return srt;
	}
	
	public static void imprimeMinimoAMaximo (int num1, int num2, int num3) {
		// Método, llamado "imprimeMinimoAMaximo", que reciba tres valores enteros como argumentos de entrada. 
		//Debe imprimir dichos valores en orden de menor a mayor.	
		int maximo = 0, minimo = 0, medio = 0;
		
		// buscamos los mayores
		if (num1 >= num2 && num1 >= num3) {
			maximo = num1;
			
		}
		if (num2 >= num1 && num2 >= num3) {
			maximo = num2;
		}
		
		if (num3 >= num1 && num3 >= num2) {
			maximo = num3;
		}
		
		// buscamos los pequeños
		
		if (num1 <= num2 && num1<=num3) {
			minimo = num1;
			
		}
		if (num2 <= num1 && num2 <= num3) {
			minimo = num2;
		}
		
		if (num3 <= num1 && num3 <= num2) {
			minimo = num3;
		}
		
		// comprobamos que el medio no sea el maximo ni el minimo
		
		if (num1 != minimo && num1 != maximo) {
			medio = num1;
		}
		if (num2 != minimo && num2 != maximo) {
			medio = num2;
		}
		if (num3 != minimo && num3 != maximo) {
			medio = num3;
		}
		if (num1 == num2 && num2 == num3) {
			medio = num2;
		}
		
		
		System.out.println(minimo + " , " + medio + " , " + maximo);
		
		
	}
	
	public static void fibonacci (int longitud) {
		
//		La serie de Fibonacci es una serie numérica que comienza en los números 1, 1 y continua de forma infinita, 
//		calculando cada mienbro de la serie como la suma de los dos anteriores. De esta manera, la serie de Fibonacci comienza 
//		1, 1, 2, 3, 5, 8, 13, 21, 34, 55.......... Debes realizar un método llamado "fibonacci". Recibirá un argumento de 
//		entrada, de tipo entero. El método debe devolver un array con la serie de Fibonacci. El parámetro de entrada del método 
//		determinará la longitud del array a devolver. El método main recibirá el array y lo imprimirá en la consola.
		
		
		int numeros[] = new int[longitud];
		
		numeros[0] = 1;
		numeros[1] = 1;
		for (int i = 2; i < numeros.length; i++) {
			numeros[i] = numeros[i-1] + numeros[i-2];
		}
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		}
	}

	
	public static void imprimeArray(int array[]) {
	//	Método que imprima en pantalla un array, recibirá un array como parámetro de entrada y lo mostrará en consola. Main 
	//	debe enviar el array al método, llamado "imprimeArray".
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "\t");
		} 
	
		
		
	}
	
	public static void recorte (int array1[], int primerIndice, int segundoIndice) {
		//Método que "recorte" un array. El método recibirá un array, un "primerIndice" y un "ultimoIndice" y debe devolver un array, formado 
		//con los elementos del array recibido, cuyos índices estén dentro del intervalo cerrado formado por los dos índices recibidos
		
		primerIndice --; // le restamos 1 porque el array empieza en 0
		segundoIndice--;
		 int longitud = segundoIndice - primerIndice;
		 int array2[] = new int[longitud-1];
		
		 imprimeArray(array1);
		 System.out.println("");
		
	  	for (int i = 0; i < array1.length; i++) {
	  		for (int j = 0; j < array2.length; j++) {
				if (i >= primerIndice && i <= segundoIndice) {
					array2[j] = array1[i];
					System.out.print(array2[j] + "\t");
					break;
				}
				break;
			}
	  	}

	}

	public static void recursividad (int num) {
		//Método que muestre en pantalla los números del 1 al 100. El único requisito para esto es que debe hacerse utilizando la recursividad.
		
		if (num>=1) {
			recursividad(num-1);
            System.out.print(num + "  ");            
        } 
		
	}
	
	
	
	
	
}
