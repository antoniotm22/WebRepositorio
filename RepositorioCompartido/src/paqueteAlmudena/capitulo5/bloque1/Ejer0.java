package paqueteAlmudena.capitulo5.bloque1;


public class Ejer0 {

	public static void main(String[] args) {
		// Realiza un ejercicio que inicialice un array de 150 elementos enteros al azar entre 0 y 100. 
		// Debes mostrar el array en pantalla y obtener la suma, la media, el menor y el mayor de todos 
		// los números que aparecen en el array
		
		int suma = 0;
		float media; 
		
		int array [] = new int [105]; 
		for (int i = 0; i < array.length; i++) {
			array[i] = Utils.obtenerNumeroAzar();
			
		}
		//añadimos los valores 
		for (int i = 0; i < array.length; i++) {
			System.out.println("El array es : " + array[i]);
		}
		
		//hacemos la suma
		for (int i = 0; i < array.length; i++) {
			suma += array[i];
			
		}
		
		//hacemos la media
		media = suma / array.length;
		
		
		System.out.println("La suma de los valores es : " + suma);
		System.out.println("Media : " + media);
	}

}
