package paqueteAntonio.capitulo2;

import javax.swing.JOptionPane;

public class Bloque3 {
	

	private static void ejercicio1Bloque3() {
		
		String str= JOptionPane.showInputDialog("Introduce nota");
		int nota= Integer.parseInt(str);
		
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
		default:
			System.out.println("Error, la nota no se ha introducido bien");
		}
		
	}
	
	
	private static void ejercicio3Bloque3() {
		//Voy a hacer un menu, con switch, para que cuando diga la opcion se ejecute esa parte.
//
//	MENU EN CONSOLA:		
//		System.out.println("Menú:"+"\n"+
//						"1- Calculo de Hipotenusa"+"\n"+
//						"2- Calculo de la superficie de una circunferencia"+"\n"+
//						"3- Cálculo del perímetro de una circunferencia."+"\n"+
//						"4- Cálculo del área de un rectángulo."+"\n"+
//						"5- Cálculo del área de un triángulo."+"\n"+
//						"6- Salir de aplicación"
//						  );
		
		String str= JOptionPane.showInputDialog("Menú:"+"\n"+
				"1- Calculo de Hipotenusa"+"\n"+
				"2- Calculo de la superficie de una circunferencia"+"\n"+
				"3- Cálculo del perímetro de una circunferencia."+"\n"+
				"4- Cálculo del área de un rectángulo."+"\n"+
				"5- Cálculo del área de un triángulo."+"\n"+
				"0- Salir de aplicación");
		int opcion= Integer.parseInt(str);
		
		
		 	if (opcion < 0 || opcion > 5) {
			System.out.println("Opci�n no v�lida. Vuelva a escoger");
		 	}else if (opcion !=0){
		 	
		 		switch(opcion) {
				
				case 1:
					float cateto1=Float.parseFloat(JOptionPane.showInputDialog("Introduce los datos de un cateto"));
					float cateto2=Float.parseFloat(JOptionPane.showInputDialog("Introduce los datos de un cateto"));
					float hipotenusa;
					
					hipotenusa= (float) Math.sqrt(Math.pow(cateto1,2) + Math.pow(cateto2, 2));
					System.out.println("La hipotenusa es: "+hipotenusa);
					
					break;
				case 2:
					float radio=Float.parseFloat(JOptionPane.showInputDialog("Introduce los datos del radio"));
					double superficie;
					
					superficie = (Math.PI*(Math.pow(radio, 2)));
					System.out.println("La superficie del circulo es: "+ superficie);
					
					break;
				case 3:
					
					float radioC=Float.parseFloat(JOptionPane.showInputDialog("Introduce los datos del radio"));
					double perimetro;
					
					perimetro=(2 * Math.PI * radioC);
					System.out.println("El perimetro es: "+ perimetro);
					
					break;
				case 4:
					
					break;
				case 5:
					
					break;
				case 6:
					
					break;
				
				default:
					System.exit(opcion);
				}
		 	}

	
	}
	
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		ejercicio3Bloque3();

	}

}
