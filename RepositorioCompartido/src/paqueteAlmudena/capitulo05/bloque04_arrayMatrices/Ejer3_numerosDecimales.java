package paqueteAlmudena.capitulo05.bloque04_arrayMatrices;

public class Ejer3_numerosDecimales {

	public static void main(String[] args) {
		
		// Crea un array de 20 números decimales creados al azar entre 0 y 100. Para crear el número decimal debes generar al azar la parte entera 
		//y la parte decimal por separado para después unir las dos partes.
		//A continuación debes examinar la cantidad de números cuya parte decimal está comprendida entre .00 y .49
		
		float array[] = new float [20];
		int cont = 0;
		float decimal;
		
		
		// damos valores al array para la parde decimal
		for (int i = 0; i < array.length; i++) {
			decimal = Utils.obtenerNumeroAzarDecimal();
			array[i] =Utils.obtenerNumeroAzar100() + decimal;
			System.out.println(array[i]);
			
			// comprobamos cuantos numero tiene la parte decimal <=49
			if (decimal <= 0.49) {
				cont++;
			}
		}
		
		System.out.println("Hay " + cont + " números con la parte decimal menor o igual de 49");
		
	}

}
