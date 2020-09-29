package paqueteZulit.Ejercicios;

import javax.swing.JOptionPane;

public class Capitulo2 {

	//Bloque1 de ejercicios
	private static void bloque1Ejercicio1 () {
		
		String str = JOptionPane.showInputDialog("Inserte el primer valor deseado: ");
		int num1 = Integer.parseInt(str);
		
		str = JOptionPane.showInputDialog("Inserte el segundo valor deseado: ");
		int num2 = Integer.parseInt(str);
		
		if (num1 > num2) {
			System.out.println("EL valor de mayor tamaño es el primer valor introducido: " + num1);
		} else {
			System.out.println("El valor de mayor tamaño es el segundo valor introducido: " + num2);
		}
	}
	
	private static void bloque1Ejercicio2 () {
		String str = JOptionPane.showInputDialog("Inserte el primer valor deseado: ");
		int num1 = Integer.parseInt(str);
		
		str = JOptionPane.showInputDialog("Inserte el segundo valor deseado: ");
		int num2 = Integer.parseInt(str);
		
		if (num1 < num2) {
			System.out.println("EL valor de menor tamaño es el primer valor introducido: " + num1);
		} else {
			System.out.println("El valor de menor tamaño es el segundo valor introducido: " + num2);
		}
	}
	
	private static void bloque1Ejercicio3 () {
		
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
		} else {
			if (num1 > num2 && num1 > num3 && num1 > num4 && num1 > num5) {
				System.out.println("El primer valor introducido es el mayor: " + num1);
			} else {
				if (num2 > num1 && num2 > num3 && num2 > num4 && num2 > num5) {
					System.out.println("El segundo valor introducido es el mayor: " + num2);
				} else {
					if (num3 > num1 && num3 > num2 && num3 > num4 && num3 > num5) {
						System.out.println("El tercer valor introducido es el mayor: " + num3);
					} else {
						if (num4 > num1 && num4 > num2 && num4 > num3 && num4 > num5) {
							System.out.println("El cuarto valor introducido es el mayor: " + num4);
						} else {
							System.out.println("El quinto valor introducido es el mayor valor: " + num5);
						}
					}
				}
			}
		}
		
	}
	
	private static void bloque1Ejercicio4 () {
		
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
		} else {
			if (num1 < num2 && num1 < num3 && num1 < num4 && num1 < num5) {
				System.out.println("El primer valor introducido es el menor: " + num1);
			} else {
				if (num2 < num1 && num2 < num3 && num2 < num4 && num2 < num5) {
					System.out.println("El segundo valor introducido es el menor: " + num2);
				} else {
					if (num3 < num1 && num3 < num2 && num3 < num4 && num3 < num5) {
						System.out.println("El tercer valor introducido es el menor: " + num3);
					} else {
						if (num4 < num1 && num4 < num2 && num4 < num3 && num4 < num5) {
							System.out.println("El cuarto valor introducido es el menor: " + num4);
						} else {
							System.out.println("El quinto valor introducido es el menor valor: " + num5);
						}
					}
				}
			}
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
		} else {
			if (num1 > num2 && num1 > num3 && num1 > num4 && num1 > num5) {
				System.out.println("El primer valor introducido es el mayor: " + num1);
			} else {
				if (num2 > num1 && num2 > num3 && num2 > num4 && num2 > num5) {
					System.out.println("El segundo valor introducido es el mayor: " + num2);
				} else {
					if (num3 > num1 && num3 > num2 && num3 > num4 && num3 > num5) {
						System.out.println("El tercer valor introducido es el mayor: " + num3);
					} else {
						if (num4 > num1 && num4 > num2 && num4 > num3 && num4 > num5) {
							System.out.println("El cuarto valor introducido es el mayor: " + num4);
						} else {
							System.out.println("El quinto valor introducido es el mayor valor: " + num5);
						}
					}
				}
			}
		}
		if (num1 == num2 && num2 == num3 && num3 == num4 && num4 == num5) {
			System.out.println("Los valor tienen el mismo valor");
		} else {
			if (num1 < num2 && num1 < num3 && num1 < num4 && num1 < num5) {
				System.out.println("El primer valor introducido es el menor: " + num1);
			} else {
				if (num2 < num1 && num2 < num3 && num2 < num4 && num2 < num5) {
					System.out.println("El segundo valor introducido es el menor: " + num2);
				} else {
					if (num3 < num1 && num3 < num2 && num3 < num4 && num3 < num5) {
						System.out.println("El tercer valor introducido es el menor: " + num3);
					} else {
						if (num4 < num1 && num4 < num2 && num4 < num3 && num4 < num5) {
							System.out.println("El cuarto valor introducido es el menor: " + num4);
						} else {
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
		
		int division = num % 2;
		
		if (division == 0) {
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
	// Fin del primer bloque
	
	//Bloque2 de ejercicios
	
	private static void bloque2Ejercicio1 () {
		String str = JOptionPane.showInputDialog("Inserte un valor: ");
		int num1 = Integer.parseInt(str);
		

		str = JOptionPane.showInputDialog("Inserte un valor: ");
		int num2 = Integer.parseInt(str);
		
		
		str = JOptionPane.showInputDialog("Inserte un valor: ");
		int num3 = Integer.parseInt(str);
		
		
		str = JOptionPane.showInputDialog("Inserte un valor: ");
		int num4 = Integer.parseInt(str);
	
	
		str = JOptionPane.showInputDialog("Inserte un valor: ");
		int num5 = Integer.parseInt(str);
	
	
		int numeroNegativo = 0;
		int numeroBajos = 0;
		int numeroMedios = 0;
		int numeroGrandes = 0;
		
		
		
		if (num1 < 0 ) {
			numeroNegativo = numeroNegativo + num1;
			}
		if (num1 > 0 && num1 <= 25) {
				numeroBajos = numeroBajos + num1;
			} 
		if (num1 >= 26 && num1 <= 250) {
				numeroMedios = numeroMedios + num1;
			}
		if (num1 > 250) {
				numeroGrandes = numeroGrandes + num1;
			}
			
		
		if (num2 < 0 ) {
			numeroNegativo = numeroNegativo + num2;
			}
		if (num2 > 0 && num2 <= 25) {
				numeroBajos = numeroBajos + num2;
			} 
		if (num2 >= 26 && num2 <= 250) {
				numeroMedios = numeroMedios + num2;
			}
		if (num2 > 250) {
				numeroGrandes = numeroGrandes + num2;
			}
		
		
		if (num3 < 0 ) {
			numeroNegativo = numeroNegativo + num3;
			}
		if (num3 > 0 && num3 <= 25) {
				numeroBajos = numeroBajos + num3;
			} 
		if (num3 >= 26 && num3 <= 250) {
				numeroMedios = numeroMedios + num3;
			}
		if (num3 > 250) {
				numeroGrandes = numeroGrandes + num3;
			}
		
		
		if (num4 < 0 ) {
			numeroNegativo = numeroNegativo + num4;
			}
		if (num4 > 0 && num4 <= 25) {
				numeroBajos = numeroBajos + num4;
			} 
		if (num4 >= 26 && num4 <= 250) {
				numeroMedios = numeroMedios + num4;
			}
		if (num4 > 250) {
				numeroGrandes = numeroGrandes + num4;
			}
		
		
		if (num5 < 0 ) {
			numeroNegativo = numeroNegativo + num5;
			}
		if (num5 > 0 && num5 <= 25) {
				numeroBajos = numeroBajos + num5;
			} 
		if (num5 >= 26 && num5 <= 250) {
				numeroMedios = numeroMedios + num5;
			}
		if (num5 > 250) {
				numeroGrandes = numeroGrandes + num5;
			}
		
		
		
		
		System.out.println("Numeros Negativos = " + numeroNegativo + '\n' + 
						   "Numeros Bajos = " + numeroBajos +  '\n' + 
						   "Numeros Medios = " + numeroMedios +  '\n' + 
						   "Numeros Grandes = " + numeroGrandes +  '\n'
						   
				);
		
	}
	
	private static void bloque2Ejercicio2 () {
		String str = JOptionPane.showInputDialog("Inserte un valor: ");
		int num1 = Integer.parseInt(str);
		

		str = JOptionPane.showInputDialog("Inserte un valor: ");
		int num2 = Integer.parseInt(str);
		
		
		str = JOptionPane.showInputDialog("Inserte un valor: ");
		int num3 = Integer.parseInt(str);
		
		
		str = JOptionPane.showInputDialog("Inserte un valor: ");
		int num4 = Integer.parseInt(str);
	
	
		str = JOptionPane.showInputDialog("Inserte un valor: ");
		int num5 = Integer.parseInt(str);
	
	

		int numeroBajos = 0;
		int numeroMedios = 0;
		int numeroGrandes = 0;
		
		
		
		if (num1 < 0 ) {
			System.exit(0);
			}			
		if (num1 > 0 && num1 <= 25) {
				numeroBajos = numeroBajos + num1;
			} 
		if (num1 >= 26 && num1 <= 250) {
				numeroMedios = numeroMedios + num1;
			}
		if (num1 > 250) {
				numeroGrandes = numeroGrandes + num1;
			}
			
		
		if (num2 < 0 ) {
			System.exit(0);
			}
		if (num2 > 0 && num2 <= 25) {
				numeroBajos = numeroBajos + num2;
			} 
		if (num2 >= 26 && num2 <= 250) {
				numeroMedios = numeroMedios + num2;
			}
		if (num2 > 250) {
				numeroGrandes = numeroGrandes + num2;
			}
		
		
		if (num3 < 0 ) {
			System.exit(0);
			}
		if (num3 > 0 && num3 <= 25) {
				numeroBajos = numeroBajos + num3;
			} 
		if (num3 >= 26 && num3 <= 250) {
				numeroMedios = numeroMedios + num3;
			}
		if (num3 > 250) {
				numeroGrandes = numeroGrandes + num3;
			}
		
		
		if (num4 < 0 ) {
			System.exit(0);
			}
		if (num4 > 0 && num4 <= 25) {
				numeroBajos = numeroBajos + num4;
			} 
		if (num4 >= 26 && num4 <= 250) {
				numeroMedios = numeroMedios + num4;
			}
		if (num4 > 250) {
				numeroGrandes = numeroGrandes + num4;
			}
		
		
		if (num5 < 0 ) {
			System.exit(0);
			}
		if (num5 > 0 && num5 <= 25) {
				numeroBajos = numeroBajos + num5;
			} 
		if (num5 >= 26 && num5 <= 250) {
				numeroMedios = numeroMedios + num5;
			}
		if (num5 > 250) {
				numeroGrandes = numeroGrandes + num5;
			}
		
		
		
		
		System.out.println("Numeros Bajos = " + numeroBajos +  '\n' + 
						   "Numeros Medios = " + numeroMedios +  '\n' + 
						   "Numeros Grandes = " + numeroGrandes +  '\n'
						   
				);
	}
	
	//Fin del segundo bloque
	
	
	public static void main(String[] args) {
		
	}

}
