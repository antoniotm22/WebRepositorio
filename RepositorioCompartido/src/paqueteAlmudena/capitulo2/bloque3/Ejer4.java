package paqueteAlmudena.capitulo2.bloque3;

import javax.swing.JOptionPane;

public class Ejer4 {

	public static void main(String[] args) {
		// Escribe un programa que lea el importe de una compra y la cantidad recibida
		// y calcule el cambio a devolver, teniendo en cuenta que el número de monedas 
		// que se devuelven debe ser mínimo. Suponer que el sistema monetario utilizado 
		// consta de monedas de 100, 50, 25, 5, y 1 unidad. El precio viene dado en 
		//unidades monetarias enteras.
		// Ejemplo: Pagamos con 2000 unidades monetarias un articulo que nos cuesta 
		// 375 unidades monetarias, la vuelta (1625 u) debería de ser de la siguiente 
		// forma:
		//	- 16 monedas de 100 = 1600
		//	- 1 moneda de 25 = 25
		
		int precio;
		int recibido;
		int cambio;
		String srt;
		
		
		srt = JOptionPane.showInputDialog("Ingrese el precio de la compra");
		precio = Integer.parseInt(srt);
		
		srt = JOptionPane.showInputDialog("Ingrese el dinero dado para pagar");
		recibido = Integer.parseInt(srt);
		
		cambio = recibido - precio;
		
		if (cambio == 0) {
			System.out.println("No tiene cambio");
		}
		else {
			if ((cambio / 100) > 0) {
				int coci100 = 0;
				int sum100;
				coci100 = cambio / 100;
				sum100 = coci100 * 100;
				System.out.println("- " + coci100 + " monedas de 100 = " + sum100);
				cambio = cambio - sum100;
			}
			if ((cambio / 50) > 0) {
				int coci50 = 0;
				int sum50;
				coci50 = cambio / 50;
				sum50 = coci50 * 50;
				System.out.println("- " + coci50 + " monedas de 50 = " + sum50);
				cambio = cambio - sum50;
			}
			if ((cambio / 25) > 0) {
				int coci25 = 0;
				int sum25;
				coci25 = cambio / 25;
				sum25 = coci25 * 25;
				System.out.println("- " + coci25 + " monedas de 25 = " + sum25);
				cambio = cambio - sum25;
			}
			if ((cambio / 5) > 0) {
				int coci5 = 0;
				int sum5;
				coci5 = cambio / 5;
				sum5 = coci5 * 5;
				System.out.println("- " + coci5 + " monedas de 5 = " + sum5);
				cambio = cambio - sum5;
			}
			if ((cambio / 1) > 0) {
				int coci1 = 0;
				int sum1;
				coci1 = cambio / 1;
				sum1 = coci1 * 1;
				System.out.println("- " + coci1 + " monedas de 1 = " + sum1);
			}
		}

	}

}
