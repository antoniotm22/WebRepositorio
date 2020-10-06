package paqueteAntonio.capitulo5;

public class ejerciciosBloque3 {

	
	/**
	 * 1º.- Realiza un ejercicio que inicialice un array de 150 elementos enteros al azar entre 0 y 1.000.
	 *  Una vez que lo hayas conseguido debes realizar implementar el algoritmo de ordenación llamado "Burbuja",
	 *   con el objetivo de ordenar el array completamente. Puedes consultar el siguiente
	 * 
	 */
	private static void burbuja() {
		
		
		int array [] = new int[150];
	
		//Inicializamos el array y mostramos el contenido en horizontal + un espaciado
		for (int i = 0; i < array.length; i++) {
			
			array[i] = (int) Math.round(Math.random()*1000);
			System.out.print(array[i] + " ");
			
		}
		
		System.out.println();
	

		//Bucle donde trabajo el algoritmo, array.length -1 para evitar error outofbounds
		for (int i = 0; i < array.length - 1  ; i++){

			
			for (int j = 0; j < array. length - 1; j++){
				
				//Si encuentra un número que cumpla dicha condicion entra en if e intercambia valores
				if (array[j] > array[j+1]){
					
					
					//Intercambio de valores
					int aux = array[j];
					array[j] = array[j+1];
					array[j+1] = aux;
					
				
				}
			}
		}
		
		//Salto de línea
		System.out.println();
		
		//Imprimo array ordenado
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}		
	
		
	}
	
	/**
	 * 2º.- Realiza un ejercicio que inicialice un array de 150 elementos enteros al azar entre 0 y 1.000.
	 *  Una vez que lo hayas conseguido debes realizar implementar el algoritmo de ordenación llamado "Inserción directa",
	 *   con el objetivo de ordenar el array completamente. 
	 * 
	 */
	private static void insercion() {
		
		int j;
		int array [] = new int[150];
		int aux;
		
		//Inicializamos array e imprimo en pantalla valores
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random()*1000);
			
			//Imprimo array
			System.out.print(array[i] + " ");
		}
		
		//Salto de linea
		System.out.println();
		
		//Bucle donde trabajaré el algoritmo
		for (int i = 0; i < array.length; i++) {
			
			//Asigno a la variable auxiliar el valor array[i], para no perder el valor.
			aux = array[i];
			
			//Bucle con decremento que empieza en el valor de la i, y que para se ejecute debe de pasar las condiciones adecuadas
			//Este bucle va a estar buscando 
			for ( j = i ; j > 0 && array[j - 1] > aux; j--) {
			
				
				//Asigno al valor actual el siguiente, porque estoy en un bucle con decremento.
				array[j] = array[j -1];
			}
			
			/*Al sustituir array de j sino tengo la aux, pierdo un valor.
			 * Le asigno el valor de la aux que ha sido el numero sustituido
			*/
			array[j] = aux;
		}
		
		//Salto de linea 
		System.out.println();
		
		//Imprimo array ya ordenado
		for (int i = 0; i < array.length; i++) {
			
			//Uso print para que salga en horizontal, para que no se junten numeros uso " " .
			System.out.print(array[i] + " ");
		}
		
		
		
	}
	
	
	
	
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		//burbuja();
		//insercion();

	}

}
