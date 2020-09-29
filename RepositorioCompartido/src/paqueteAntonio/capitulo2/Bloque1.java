package paqueteAntonio.capitulo2;

import javax.swing.JOptionPane;

public class Bloque1 {
	
	/***
	 * 
	 */
	
	private static void ejercicio1() {
	//Ejercicio 1 bloque 1
		
		String str= JOptionPane.showInputDialog("Introduce numnero");
		int num1= Integer.parseInt(str);
		str= JOptionPane.showInputDialog("Introduce numnero");
		int num2= Integer.parseInt(str);
		
		if(num1>num2){
			System.out.println("El mayor es: "+num1);
		}
		else{
			System.out.println("El mayor es: "+num2);
		}
		
	}
	
	
	private static void ejercicio2() {

		//Ejercicio 2
		String str= JOptionPane.showInputDialog("Introduce numnero");
		int num1= Integer.parseInt(str);
		str= JOptionPane.showInputDialog("Introduce numnero");
		int num2= Integer.parseInt(str);
		
		if(num1<num2){
			System.out.println("El menor es: "+num1);
		}
		else{
			System.out.println("El menor es: "+num2);
		}
	}
	
	
	private static void ejercicio3() {
		
		String str = JOptionPane.showInputDialog("Introduzca un número");
		int num1 = Integer.parseInt(str);
				str = JOptionPane.showInputDialog("Introduzca un número");
		int num2 = Integer.parseInt(str);
		str = JOptionPane.showInputDialog("Introduzca un número");
		int num3 = Integer.parseInt(str);
				str = JOptionPane.showInputDialog("Introduzca un número");
		int num4 = Integer.parseInt(str);
		str = JOptionPane.showInputDialog("Introduzca un número");
		int num5 = Integer.parseInt(str);
		
		if((num1>num2)&&(num1>num3)&&(num1>num4)&&(num1>num5)) {
			System.out.println("El numero mayor es: " + num1);
		}
	
			
		if((num2>num1)&&(num2>num3)&&(num2>num4)&&(num2>num5)) {
			System.out.println("El numero mayor es: " + num2);

		}
		if((num3>num1)&&(num3>num2)&&(num3>num4)&&(num3>num5)) {
			System.out.println("El numero mayor es: " + num3);

		}
		if((num4>num1)&&(num4>num3)&&(num4>num2)&&(num4>num5)) {
			System.out.println("El numero mayor es: " + num4);

		}
		if((num5>num1)&&(num5>num3)&&(num5>num4)&&(num5>num5)) {
			System.out.println("El numero mayor es: " + num5);

		}
	}
	
	
	private static void ejercicio4() {

		String str = JOptionPane.showInputDialog("Introduzca un número");
		int num1 = Integer.parseInt(str);
				str = JOptionPane.showInputDialog("Introduzca un número");
		int num2 = Integer.parseInt(str);
		str = JOptionPane.showInputDialog("Introduzca un número");
		int num3 = Integer.parseInt(str);
				str = JOptionPane.showInputDialog("Introduzca un número");
		int num4 = Integer.parseInt(str);
		str = JOptionPane.showInputDialog("Introduzca un número");
		int num5 = Integer.parseInt(str);
		
		if((num1<num2)&&(num1<num3)&&(num1<num4)&&(num1<num5)) {
			System.out.println("El numero menor es: " + num1);
		}
		if((num2<num1)&&(num2<num3)&&(num2<num4)&&(num2<num5)) {
			System.out.println("El numero menor es: " + num2);

		}
		if((num3<num1)&&(num3<num2)&&(num3<num4)&&(num3<num5)) {
			System.out.println("El numero menor es: " + num3);

		}
		if((num4<num1)&&(num4<num3)&&(num4<num2)&&(num4<num5)) {
			System.out.println("El numero menor es: " + num4);

		}System.out.println("El alumno ha sacado un suspenso");
		if((num5<num1)&&(num5<num3)&&(num5<num4)&&(num5<num5)) {
			System.out.println("El numero menor es: " + num5);

		}
	}
	
	private static void bloque1Ejercicio5 () {
		
		String str = JOptionPane.showInputDialog("Inserte el primer valor: ");
		int num1 = Integer.parseInt(str);
		
		str = JOptionPane.showInputDialog("Inserte el segundo valor: ");
		int num2 = Integer.parseInt(str);
		
		str = JOptionPane.showInputDialog("Inserte el segundo valor: ");
		int num3 = Integer.parseInt(str);
		
		str = JOptionPane.showInputDialog("Inserte el segundo valor: ");
		int num4 = Integer.parseInt(str);
		
		str = JOptionPane.showInputDialog("Inserte el segundo valor: ");
		int num5 = Integer.parseInt(str);
		
		if (num1 == num2 && num2 == num3 && num3 == num4 && num4 == num5) {
			System.out.println("Los valor tienen el mismo valor");
		} 
		else {
			if (num1 > num2 && num1 > num3 && num1 > num4 && num1 > num5) {
				System.out.println("El primer valor introducido es el mayor: " + num1);
			} 
			else {
				if (num2 > num1 && num2 > num3 && num2 > num4 && num2 > num5) {
					System.out.println("El segundo valor introducido es el mayor: " + num2);
				}
				else {
					if (num3 > num1 && num3 > num2 && num3 > num4 && num3 > num5) {
						System.out.println("El tercer valor introducido es el mayor: " + num3);
					}
					else {
						if (num4 > num1 && num4 > num2 && num4 > num3 && num4 > num5) {
							System.out.println("El cuarto valor introducido es el mayor: " + num4);
						} 
						else {
							System.out.println("El quinto valor introducido es el mayor valor: " + num5);
						}
					}
				}
			}
		}
		if (num1 == num2 && num2 == num3 && num3 == num4 && num4 == num5) {
			System.out.println("Los valor tienen el mismo valor");
		}
		else {
			if (num1 < num2 && num1 < num3 && num1 < num4 && num1 < num5) {
				System.out.println("El primer valor introducido es el menor: " + num1);
			}
			else {
				if (num2 < num1 && num2 < num3 && num2 < num4 && num2 < num5) {
					System.out.println("El segundo valor introducido es el menor: " + num2);
				} 
				else {
					if (num3 < num1 && num3 < num2 && num3 < num4 && num3 < num5) {
						System.out.println("El tercer valor introducido es el menor: " + num3);
					} 
					else {
						if (num4 < num1 && num4 < num2 && num4 < num3 && num4 < num5) {
							System.out.println("El cuarto valor introducido es el menor: " + num4);
						} 
						else {
							System.out.println("El quinto valor introducido es el menor valor: " + num5);
						}
					}
				}
			}
		}
	}
	
	
	private static void bloque1Ejercicio6 () {
		
		String str = JOptionPane.showInputDialog("Inserte un valor: ");
		int num = Integer.parseInt(str);
		
		int div= num % 2;
		
		if (div == 0) {
			System.out.println("El numero introducido es par");
		} else {
			System.out.println("El numero introducido es impar");
		}
	}
	
	
	private static void bloque1Ejercicio7 () {
		
		String str = JOptionPane.showInputDialog("Inserte un valor: ");
		int num = Integer.parseInt(str);
	
		if (num % 2==0 & num != 1) {
			System.out.println("El numero es par");
		} 
			else {
			System.out.println("El numero es impar");
		}
	}
	/***
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
	

	}

}
