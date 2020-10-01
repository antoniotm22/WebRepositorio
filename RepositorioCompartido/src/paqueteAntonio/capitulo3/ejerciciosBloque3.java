package paqueteAntonio.capitulo3;

import javax.swing.JOptionPane;

public class ejerciciosBloque3 {
	
	/**
	 * 
	 * 1�.- Realiza un ejercicio que pida n�meros al usuario. El programa debe detenerse cuando el usuario introduzca el n�mero 0 (cero),
	 *  que no debe tenerse en cuenta para ninguna operaci�n aritm�tica, simplemente para salir de la aplicaci�n.
	 *  Cuando el programa haya terminado, se debe sacar en pantalla el valor de la suma de todos los n�meros .
	 */
	private static void ejercicio1() {
		
		int total=0;
		int num;
		
		//Hago un bucle do while, mientras el usuario no marque 0 no parar�
		do {
			
		 num = Integer.parseInt(JOptionPane.showInputDialog(" Introduce n�mero"));
		 
		 total += +num;
			
		}while(num!=0);
		
		System.out.println("La suma es: "+total);
	}
	
	
	/**
	 * M�todo que recoje el ejercicio 2 del bloque 3 capitulo 3
	 */
	private static void ejercicio2() {
		
		float contador=0f;
		float total=0f;
		int num;
		
		//Hago un bucle do while, mientras el usuario no marque 0 no parar�
		do {
			
		 num = Integer.parseInt(JOptionPane.showInputDialog("Introduce n�mero"));
		 
		 total += +num;
		 contador++;	
		 
		}while(num!=0);
		
		System.out.println("La media es: "+ (total/(contador-1)));
		
	}
	
	/**
	 * M�todo para ejercicio 3 bloque 3 capitulo 3
	 * 
	 * 3�.- Realiza un ejercicio que pida n�meros al usuario hasta que este introduzca el 0 (cero).
	 *  Al finalizar el ejercicio se debe imprimir en pantalla el valor mayor introducido. El valor 0 (cero) no debe tenerse en cuenta.
	 */
	private static void ejercicio3() {
		
		int mayor=0;
		int num;
		
		//Hago un bucle do while, mientras el usuario no marque 0 no parar�
		do {
			
		 num = Integer.parseInt(JOptionPane.showInputDialog("Introduce n�mero"));
		 
		if(num > mayor) {
			mayor = num;
		}
			
		}while(num!=0);
		
		System.out.println("�l numero mayor es: " + mayor );
		
		
	}
	
	/**
	 * M�todo para ejercicio 4 bloque 3 capitulo 3
	 * 
	 * 4�.- Realiza un ejercicio igual al anterior, con la particularidad de que debe imprimir en pantalla el menor, no el mayor.
	 * 
	 */
	private static void ejercicio4() {
		
		int menor = 0;
		int num;
		
		//Hago un bucle do while, mientras el usuario no marque 0 no parar�
		do {
			
		 num = Integer.parseInt(JOptionPane.showInputDialog("Introduce n�mero"));
		 
		if(num < menor) {
			menor = num;
		}
			
		}while(num!=0);
		
		System.out.println("�l numero menor es: " + menor );
		
		
	}
	
	/**
	 * M�todo que contiene ejercicio 5, bloque 3 capitulo 3
	 * 
	 * 5�.- Realiza un ejercicio parecido a los dos anteriores, d�nde se imprima el mayor valor y el menor de todos los introducidos.
	 * 
	 */
	private static void ejercicio5() {
		
		int mayor = 0;
		int menor = 0;
		int num;
		
		//Hago un bucle do while, mientras el usuario no marque 0 no parar�
		do {
			
		 num = Integer.parseInt(JOptionPane.showInputDialog("Introduce n�mero"));
		 
		if(num < menor) {
			menor = num;
		}
		
		if(num > mayor) {
			mayor = num;
		}
			
		}while(num!=0);
		
		System.out.println("�l numero menor es: " + menor );	
		System.out.println("�l numero mayor es: " + mayor );
		
	}
	
	/**
	 * M�todo que contiene el ejercicio 6 del bloque 3 cap�tulo 3
	 * 
	 * 6�.- Realiza un ejercicio que pida n�meros al usuario, hasta que uno de ellos sea 0 (cero).
	 *  Para cada n�mero introducido se debe mostrar en pantalla su tabla de multiplicar, desde el 0 (cero) hasta el 10. 
	 */
	private static void ejercicio6(){
		
		int num ;
		int aux;
		
		//Bucle do while hasta que marque 0
		do {
			
			 num = Integer.parseInt(JOptionPane.showInputDialog("Introduce n�mero"));
			 
			 //Si el numero es 0, se cierra el programa y no se imprime la tabla del 0
			 if(num == 0) {
				 System.exit(num);
				 System.out.println("Saliste del programa");
			 } else {
				 
			 
				 	 //Bucle con incremento, aprovechando dicho incremento multiplico con num
					 for (int i = 1; i <= 10; i++) {
						
						 //Declaro una variable auxiliar para que no me acumule el valor
						 // El resultado sin la variable sera para la segunda iteracion= 12x2, siguiente: 24x3....
						 aux = num * i; 
						 System.out.println(num + " x " + i + " = "+ aux);
						 
						 //Pongo la auxiliar a 0 para que no se acumulen las operaciones
						 aux = 0;
						
						
					}
					 System.out.println();
					 
			 }
				
			}while(num!=0);
		
	}
	
	/**
	 * M�todo que contiene ejercicio 7 bloque 3 capitulo 3
	 * 
	 * 7�.- Realiza un ejercicio que pida n�meros al usuario, hasta que uno de ellos sea 0 (cero).
	 *  Al finalizar se debe imprimir en pantalla cuantos son positivos y cuantos negativos. No debes tener en cuenta el 0 (cero).
	 */
	private static void ejercicio7() {
		
		int contNegativo = 0;
		int contPositivo = 0;
		int num;
		
		//Hago un bucle do while, mientras el usuario no marque 0 no parar�
		do {
			
		 num = Integer.parseInt(JOptionPane.showInputDialog("Introduce n�mero"));
		 
		 	if(num > 0) {
		 		contPositivo++;
		 	}else {
		 		contNegativo++;
		 	}
		 
		}while(num!=0);
		
		System.out.println("Hay " + contPositivo + " numeros positivos");
		System.out.println("Hay " + contNegativo + "  numeros negativos");
		
		
		
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
