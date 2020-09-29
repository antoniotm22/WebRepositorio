package paqueteAntonio.capitulo2;

import javax.swing.JOptionPane;

public class Bloque3 {
	
	/**
	 * Metodo que contiene el ejercicio 1 bloque 3 capitulo 2
	 */
	private static void ejercicio1Bloque3() {
		
		//Pido al usuario la nota
		String str= JOptionPane.showInputDialog("Introduce nota");
		int nota= Integer.parseInt(str);
		
		//depende de la nota que el usuario de se ejecutara una opciÛn u otra.
		switch(nota) {
		
		case 1:
			System.out.println("El alumno ha sacado un suspenso");
			break;
		case 2:
			System.out.println("El alumno ha sacado un supenso");
			break;
		case 3:
			System.out.println("El alumno ha sacado un suspenso");
			break;
		case 4:
			System.out.println("El alumno ha sacado un suspenso");
			break;
		case 5:
			System.out.println("El alumno ha sacado un aprobado");
			break;
		case 6:
			System.out.println("El alumno ha sacado un bien");
			break;
		case 7:
			System.out.println("El alumno ha sacado un notable");
			break;
		case 8:
			System.out.println("El alumno ha sacado un notable");
			break;
		case 9:
			System.out.println("El alumno ha sacado un sobresaliente");
			break;
		case 10:
			System.out.println("El alumno ha sacado un sobresaliente");
			break;
			//Por defecto el programa tendra la opcion 0, para salir del programa a no ser que pongamos bien la nota.
		default:
			System.out.println("Error, la nota no se ha introducido bien");
		}
		
	}
	
	/**
	 * Metodo que contiene el ejercicio 3 del bloque 3 capitulo 2.
	 */
	private static void ejercicio3Bloque3() {
		

//	MENU EN CONSOLA:		
//		System.out.println("Men√∫:"+"\n"+
//						"1- Calculo de Hipotenusa"+"\n"+
//						"2- Calculo de la superficie de una circunferencia"+"\n"+
//						"3- C√°lculo del per√≠metro de una circunferencia."+"\n"+
//						"4- C√°lculo del √°rea de un rect√°ngulo."+"\n"+
//						"5- C√°lculo del √°rea de un tri√°ngulo."+"\n"+
//						"6- Salir de aplicaci√≥n"
//						  );
		int opcion;
			//Bucle para mostrar menu continuamente hasta que el usuario marque 0 en cuyo caso terminaria el programa
		 		do {
		 			
		 			String str= JOptionPane.showInputDialog("Men√∫:"+"\n"+
		 					"1- Calculo de Hipotenusa"+"\n"+
		 					"2- Calculo de la superficie de una circunferencia"+"\n"+
		 					"3- C√°lculo del per√≠metro de una circunferencia."+"\n"+
		 					"4- C√°lculo del √°rea de un rect√°ngulo."+"\n"+
		 					"5- C√°lculo del √°rea de un tri√°ngulo."+"\n"+
		 					"0- Salir de aplicaci√≥n");
		 			 opcion= Integer.parseInt(str);
		 			
		 			 	//Condicion para determinar si la opcion del usuario es valida. Una condicion u otra
		 			 
		 			 	if (opcion < 0 || opcion > 5) {
		 				System.out.println("OpciÛn no v·lida. Vuelva a escoger");
		 			 	}
		 			 	//Si la opcion es 0 el programa terminara.
				 		if (opcion ==0){
				 			
				 			System.exit(opcion);
				 		//Si no es 0, se ejecutara el switch.	
				 		}else {
				 			
					 		switch(opcion) {
							//Calculo hipotenusa
							case 1:
								float cateto1= Float.parseFloat(JOptionPane.showInputDialog("Introduce los datos de un cateto"));
								float cateto2= Float.parseFloat(JOptionPane.showInputDialog("Introduce los datos de un cateto"));
								float hipotenusa;
								
								hipotenusa= (float) Math.sqrt(Math.pow(cateto1,2) + Math.pow(cateto2, 2));
								System.out.println("La hipotenusa es: "+hipotenusa);
								
								break;
							//Calculo superficie circunferencia	
							case 2:
								float radio= Float.parseFloat(JOptionPane.showInputDialog("Introduce los datos del radio"));
								double superficie;
								
								superficie = (Math.PI*(Math.pow(radio, 2)));
								System.out.println("La superficie del circulo es: "+ superficie);
								
								break;
							//Calculo perimetro circulo	
							case 3:
								
								float radioC= Float.parseFloat(JOptionPane.showInputDialog("Introduce los datos del radio"));
								double perimetro;
								
								perimetro=(2 * Math.PI * radioC);
								System.out.println("El perimetro es: "+ perimetro);
								
								break;
							//Calculo area rectangulo	
							case 4:
								float base= Float.parseFloat(JOptionPane.showInputDialog("Introduce los datos de la base"));
								float altura= Float.parseFloat(JOptionPane.showInputDialog("Introduce los datos de la altura"));
								float total= base*altura;
								
								System.out.println("El area del rectangulo es: "+total);
																								
								break;
							//Calculo area triangulo	
							case 5:
								float baseT= Float.parseFloat(JOptionPane.showInputDialog("Introduce los datos de la base"));
								float alturaT= Float.parseFloat(JOptionPane.showInputDialog("Introduce los datos de la altura"));
								float totalT= (baseT*alturaT)/2;
								
								break;
							
							
						
							}
			 	    }
		 		//CondiciÛn salida bucle, si no se escoje 0 no saldr· del bucle.
		 		}while(opcion!=0);	

	
	}
	
	/**
	 * Metodo que contiene el ejercicio 4 bloque 3 capitulo 2
	 */
	private static void ejercicio4() {
			
			//El resultado del ejercicio mostrar· en consola el numero de monedas y billetes.
		
		
			//Variables para declarar cuanto es el precio y cuanto pagamos 
			int precioPagar = 8521; // xx,xxÄ
			int pago = 10000; // 100,00 Ä pagamos con un billete de 100Ä
			
			int dineroDevolver = pago - precioPagar;
			
			// C·lculo la cantidad de billetes de 100,00 Ä
			System.out.println("Devuelvo " + (dineroDevolver / 10000)  + " billetes de 100.00 Ä");
			//Aplico el modulo para saber el resto de la division, porque el cambio no puede tener decimales
			dineroDevolver %= 10000;

			// C·lculo la cantidad de billetes de 50,00 Ä
			System.out.println("Devuelvo " + (dineroDevolver / 5000)  + " billetes de 50.00 Ä");
			dineroDevolver %= 5000;

			// C·lculo la cantidad de billetes de 20,00 Ä
			System.out.println("Devuelvo " + (dineroDevolver / 2000)  + " billetes de 20.00 Ä");
			dineroDevolver %= 2000;

			// C·lculo la cantidad de billetes de 10,00 Ä
			System.out.println("Devuelvo " + (dineroDevolver / 1000)  + " billetes de 10.00 Ä");
			dineroDevolver = dineroDevolver % 1000;

			// C·lculo la cantidad de billetes de 5,00 Ä
			System.out.println("Devuelvo " + (dineroDevolver / 500)  + " billetes de 5.00 Ä");
			dineroDevolver = dineroDevolver % 500;

			// Calculo la cantidad de monedas de 2,00 Ä
			System.out.println("Devuelvo " + (dineroDevolver / 200)  + " monedas de 2.00 Ä");
			dineroDevolver = dineroDevolver % 200;

			// Calculo la cantidad de monedas de 1,00 Ä
			System.out.println("Devuelvo " + (dineroDevolver / 100)  + " monedas de 1.00 Ä");
			dineroDevolver = dineroDevolver % 100;

			// Calculo la cantidad de monedas de 0,50 Ä
			System.out.println("Devuelvo " + (dineroDevolver / 50)  + " monedas de 0.50 Ä");
			dineroDevolver = dineroDevolver % 50;

			// Calculo la cantidad de monedas de 0,20 Ä
			System.out.println("Devuelvo " + (dineroDevolver / 20)  + " monedas de 0.20 Ä");
			dineroDevolver = dineroDevolver % 20;

			// Calculo la cantidad de monedas de 0,10 Ä
			System.out.println("Devuelvo " + (dineroDevolver / 10)  + " monedas de 0.10 Ä");
			dineroDevolver = dineroDevolver % 10;

			// Calculo la cantidad de monedas de 0,05 Ä
			System.out.println("Devuelvo " + (dineroDevolver / 5)  + " monedas de 0.05 Ä");
			dineroDevolver = dineroDevolver % 5;

			// Calculo la cantidad de monedas de 0,02 Ä
			System.out.println("Devuelvo " + (dineroDevolver / 2)  + " monedas de 0.02 Ä");
			dineroDevolver = dineroDevolver % 2;

			// Calculo la cantidad de monedas de 0,01 Ä
			System.out.println("Devuelvo " + (dineroDevolver / 1)  + " monedas de 0.01 Ä");
			dineroDevolver = dineroDevolver % 1;
		
	}
	
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		ejercicio4();
		//ejercicio3Bloque3();

	}

}
