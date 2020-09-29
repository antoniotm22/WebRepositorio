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
				"6- Salir de aplicación");
		int opcion= Integer.parseInt(str);
		
	

		switch(opcion) {
		
		case 1:
			
			
			
			break;
		case 2:
			
			break;
		case 3:
			
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
	
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		ejercicio3Bloque3();

	}

}
