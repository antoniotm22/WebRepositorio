package paqueteAlmudena.capitulo05.bloque04;

public class Ejer3 {

	public static void main(String[] args) {
		// Crea un array de 20 números decimales creados al azar entre 0 y 100. Para crear el número decimal debes generar al azar la parte entera 
		//y la parte decimal por separado para después unir las dos partes.
		//A continuación debes examinar la cantidad de números cuya parte decimal está comprendida entre .00 y .49
		
		int entera[] = new int [20];
		int decimal[] = new int [20];
		int cont = 0;
		   
		//damos valores al array para la parte entera
		for (int i = 0; i < entera.length; i++) {
			entera[i] = Utils.obtenerNumeroAzar100();
			
		}
		
		// damos valores al array para la parde decimal
		for (int i = 0; i < decimal.length; i++) {
			decimal[i] =Utils.obtenerNumeroAzar100();
		}
		
		//unimos los dos array para componer los numeros decimales
		for (int i = 0; i < decimal.length; i++) {
			System.out.println(entera[i] + "." + decimal[i]);
		}
		
		// comprobamos cuantos numero tiene la parte decimal <=49
		for (int i = 0; i < decimal.length; i++) {
			if (decimal[i]<=49) {
				cont++;
			}
		}
		System.out.println("Hay " + cont + " números con la parte decimal menor o igual de 49");
		
	}

}
