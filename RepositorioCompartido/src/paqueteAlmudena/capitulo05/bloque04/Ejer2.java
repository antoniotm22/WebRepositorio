package paqueteAlmudena.capitulo05.bloque04;

public class Ejer2 {

	public static void main(String[] args) {
		// Crea un array de 20 números enteros generados al azar entre 0 y 10. 
		//Analiza el array y calcula el porcentaje (con decimales) de notas aprobadas ( >= 5 ) y de notas suspensas.
		
		int array[] = new int [20];
		int contApro = 0;
		float porceApro = 0;
		float porceSus = 0;
		int contSus = 0;
		   
		for (int i = 0; i < array.length; i++) {
			array[i] = Utils.obtenerNumeroAzar10();
			
		}
		
		for (int i = 0; i < array.length; i++) {
			// comprobamos si la nota esta aprobada o no 
			if (array[i] >= 5) {
				contApro++;
				
			}
			else {
				contSus++;
				
			}
		}
		
		porceApro = (float) contApro / 20 * 100;  // le hago el castin para que coja los decimales
		porceSus = (float) contSus / 20 * 100;
		
		System.out.println("Aprobadas: " + porceApro + "%");
		System.out.println("Suspensas: " + porceSus + "%");
		
	}

}
