package paqueteAlmudena.Capitulo2.Bloque3;

import javax.swing.JOptionPane;

public class Ejer3 {

	public static void main(String[] args) {
		
		
		int opcion;
		String srt;
		
		do {
			srt = JOptionPane.showInputDialog("Inserta la opción que quiere realizar"
					+ "1. Cálculo de la hipotenusa de un triángulo.\r\n"
					+ "2. Cálculo de la superficie de una circunferencia.\r\n"
					+ "3. Cálculo del perímetro de una circunferencia.\r\n"
					+ "4. Cálculo del área de un rectángulo.\r\n"
					+ "5. Cálculo del área de un triángulo.\r\n"
					+ "0. Salir de la aplicación");
			opcion = Integer.parseInt(srt);
			
			switch (opcion) {
			case 0:
				System.exit(0);
				break;
			case 1:
				// h = V(c^2 + c^2)
				
				double cateto1;
				double cateto2;
				double hipotenusa;
				double suma;
				
				srt = JOptionPane.showInputDialog("Inserta un cateto");
				cateto1 = Double.parseDouble(srt);
				
				srt = JOptionPane.showInputDialog("Inserta un cateto");
				cateto2 = Double.parseDouble(srt);
				
				cateto1 = cateto1 * cateto1;
				cateto2 = cateto2 * cateto2;
				
				suma = cateto1 + cateto2;
				
				hipotenusa = Math.sqrt(suma);
				System.out.println("La hipotenusa es : " + hipotenusa);
				break;
				
			case 2:
				// area circunferencia PI * r^2
				
				double radio;
				double areaCir;
				srt = JOptionPane.showInputDialog("Inserta el radio");
				radio = Double.parseDouble(srt);
				
				radio = radio * radio;
				areaCir = Math.PI * radio;
				System.out.println("El area de la circunferencia es: " + areaCir);
				
				break;
			case 3:
				// perimetro de la circunferencia 2 PI r
				double radioPer;
				double perimetroCir;
				srt = JOptionPane.showInputDialog("Inserta el radio");
				radioPer = Double.parseDouble(srt);
				
				perimetroCir = 2 * Math.PI * radioPer;
				System.out.println("El perimetro de la circunferencia es: " + perimetroCir);
				
				break;
			case 4:
				//area rectangulo 
				double y;
				double x;
				double areaRect;
				
				srt = JOptionPane.showInputDialog("Inserta la base");
				x = Double.parseDouble(srt);
				
				srt = JOptionPane.showInputDialog("Inserta la altura");
				y = Double.parseDouble(srt);
				
				areaRect = y * x;
				System.out.println("Area del rectángulo: " + areaRect);
				
				break;
			case 5:
				//area triangulo
				double yt;
				double xt;
				double areaTri;
				
				srt = JOptionPane.showInputDialog("Inserta la base");
				xt = Double.parseDouble(srt);
				
				srt = JOptionPane.showInputDialog("Inserta la altura");
				yt = Double.parseDouble(srt);
				
				areaTri = ( xt * yt ) / 2;
				System.out.println("Área del triangulo: " + areaTri);
				
				break;

			default:
				System.out.println("Has introducido una opción erronea");
				break;
			}
		} while (opcion != 0);
	}

}
