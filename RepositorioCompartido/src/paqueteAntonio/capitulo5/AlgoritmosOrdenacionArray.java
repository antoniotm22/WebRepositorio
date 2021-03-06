package paqueteAntonio.capitulo5;

public class AlgoritmosOrdenacionArray {

	/**
	 * 1º.- Realiza un ejercicio que inicialice un array de 150 elementos enteros al
	 * azar entre 0 y 1.000. Una vez que lo hayas conseguido debes realizar
	 * implementar el algoritmo de ordenación llamado "Burbuja", con el objetivo de
	 * ordenar el array completamente. Puedes consultar el siguiente
	 * 
	 */
	private static void burbuja() {

		int array[] = new int[150];

		// Inicializamos el array y mostramos el contenido en horizontal + un espaciado
		for (int i = 0; i < array.length; i++) {

			array[i] = (int) Math.round(Math.random() * 1000);
			System.out.print(array[i] + " ");

		}

		System.out.println();

		// Bucle donde trabajo el algoritmo, array.length -1 para evitar error
		// outofbounds
		for (int i = 0; i < array.length - 1; i++) {

			for (int j = 0; j < array.length - 1; j++) {

				// Si encuentra un número que cumpla dicha condicion entra en if e intercambia
				// valores
				if (array[j] > array[j + 1]) {

					// Intercambio de valores
					int aux = array[j];
					array[j] = array[j + 1];
					array[j + 1] = aux;

				}
			}
		}

		// Salto de línea
		System.out.println();

		// Imprimo array ordenado
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

	}

	/**
	 * 2º.- Realiza un ejercicio que inicialice un array de 150 elementos enteros al
	 * azar entre 0 y 1.000. Una vez que lo hayas conseguido debes realizar
	 * implementar el algoritmo de ordenación llamado "Inserción directa", con el
	 * objetivo de ordenar el array completamente.
	 * 
	 */
	private static void insercion() {

		int j;
		int array[] = new int[150];
		int aux;

		// Inicializamos array e imprimo en pantalla valores
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random() * 1000);

			// Imprimo array
			System.out.print(array[i] + " ");
		}

		// Salto de linea
		System.out.println();

		// Bucle donde trabajaré el algoritmo
		for (int i = 0; i < array.length; i++) {

			// Asigno a la variable auxiliar el valor array[i], para no perder el valor.
			aux = array[i];

			// Bucle con decremento que empieza en el valor de la i, y que para se ejecute
			// debe de pasar las condiciones adecuadas
			// Este bucle va a estar buscando
			for (j = i; j > 0 && array[j - 1] > aux; j--) {

				// Asigno al valor actual el siguiente, porque estoy en un bucle con decremento.
				array[j] = array[j - 1];
			}

			/*
			 * Al sustituir array de j sino tengo la aux, pierdo un valor. Le asigno el
			 * valor de la aux que ha sido el numero sustituido
			 */
			array[j] = aux;
		}

		// Salto de linea
		System.out.println();

		// Imprimo array ya ordenado
		for (int i = 0; i < array.length; i++) {

			// Uso print para que salga en horizontal, para que no se junten numeros uso " "
			// .
			System.out.print(array[i] + " ");
		}

	}

	/**
	 * 3º.- Realiza un ejercicio que inicialice un array de 150 elementos enteros al
	 * azar entre 0 y 1.000. Una vez que lo hayas conseguido debes realizar
	 * implementar el algoritmo de ordenación llamado "Shell", con el objetivo de
	 * ordenar el array completamente.
	 * 
	 */
	private static void shell() {

		int array[] = new int[100];

		// Inicializamos array e imprimo en pantalla valores
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random() * 100);
		}

		for (int i = 0; i < array.length; i++) {

			System.out.print(array[i] + " ");
		}

		System.out.println();
		System.out.println();

		int salto;
		int aux;
		int i;
		boolean hayCambios = true;

		// Bucle for donde salto es la mitad del array, de esta forma comparo el primer
		// valor con la mitad,
		// mientras que el salto no sea 0 y que el incremento sea que salto sea la mitad
		// => por lo tanto ahora en una nueva
		// iteración comprobará y comparará los numeros entre valores de i mas
		// cercanos,dentro de este tengo otros bucles que me comprobarán
		// si las condiciones son las adecuadas
		for (salto = array.length / 2; salto != 0; salto = salto / 2) {

			// Pongo el valor a true porque por cada iteracion, estoy trabajando sobre el
			// boolean.
			// Es decir si el siguiente bucle no hay cambios el boolean se quedara en false
			hayCambios = true;

			// Bucle para comprobar valores y cambiar valores
			// Hasta que el bucle no sea verdad, no saldrá.
			do {

				hayCambios = false;

				// Bucle que cambia valor del salto con la i
				for (i = salto; i < array.length; i++) {

					// Condicion para que ordene.
					if (array[i - salto] > array[i]) {

						// Intercambio de valores con una variable aux
						aux = array[i];

						array[i] = array[i - salto];

						array[i - salto] = aux;

						//
						hayCambios = true;
					}

				}

			} while (hayCambios);

		}

		System.out.println("Array ordenado.");
		// Recorro array ordenado
		for (i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

	}

	/**
	 * 4º.- Realiza un ejercicio que inicialice un array de 150 elementos enteros al
	 * azar entre 0 y 1.000. Una vez que lo hayas conseguido debes realizar
	 * implementar el algoritmo de ordenación llamado "Selección", con el objetivo
	 * de ordenar el array completamente.
	 * 
	 */
	private static void seleccion() {

		int array[] = new int[10];

		for (int i = 0; i < array.length; i++) {

			array[i] = (int) Math.round(Math.random() * 100);

			System.out.print(array[i] + " ");
		}

		int i;
		int aux;
		int j = 0;

		// Recorre array con el que trabajamos
		// Creo dos variables, una con el valor actual y otra

		System.out.println();

		// Bucle principal
		for (i = 0; i < array.length; i++) {

			// Declaración variable que lo usaré para salvar valores
			int actual = array[i];

			// Bucle for donde trabajo el algoritmo
			for (j = i + 1; j < array.length; j++) {

				// La variable creada anteriormente le asigno el valor i
				actual = i;

				// Si se cumple que el array[j] sea menor que el valor i =>
				// Entonces el actual o el minimo será j
				if (array[j] < array[actual]) {
					actual = j;
				}

				// Intercambio de valores con una variable aux
				aux = array[i];
				array[i] = array[actual];
				array[actual] = aux;
			}
		}

		System.out.println();

		// Impresion de array ordenado
		for (i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");

		}

	}

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// burbuja();
		// insercion();
		// shell();
		// seleccion();
	}

}
