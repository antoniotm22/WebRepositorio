package paqueteRuben.Ejercicios;

import javax.swing.JOptionPane;

public class Cap02Bloque03Ejercicio01 {

	public static void main(String[] args) {
		String cad;
		cad = JOptionPane.showInputDialog("Introduce un número: ");
		int nota = Integer.parseInt(cad);
		
		switch (nota) {
			case 1: 
				System.out.println("La nota es un " + nota + ": Muy deficiente");
			break;
			
			case 2: 
				System.out.println("La nota es un " + nota + ": Muy deficiente");
			break;
			
			case 3: 
				System.out.println("La nota es un " + nota + ": Insuficiente");
			break;
			
			case 4: 
				System.out.println("La nota es un " + nota + ": Insuficiente");
			break;
			
			case 5: 
				System.out.println("La nota es un " + nota + ": Suficiente");
			break;
			
			case 6: 
				System.out.println("La nota es un " + nota + ": Bien");
			break;
			
			case 7: 
				System.out.println("La nota es un " + nota + ": Notable");
			break;
			
			case 8: 
				System.out.println("La nota es un " + nota + ": Notable");
			break;
			
			case 9: 
				System.out.println("La nota es un " + nota + ": Sobresaliente");
			break;
			
			case 10: 
				System.out.println("La nota es un " + nota + ": Sobresaliente");
			break;
		}

	}

}
