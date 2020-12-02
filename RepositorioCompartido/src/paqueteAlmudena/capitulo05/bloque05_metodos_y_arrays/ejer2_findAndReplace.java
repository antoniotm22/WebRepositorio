package paqueteAlmudena.capitulo05.bloque05_metodos_y_arrays;

import paqueteAlmudena.capitulo05.bloque04_arrayMatrices.Utils;

public class ejer2_findAndReplace {

	public static void main(String[] args) {
		//- Un método llamado "findAndReplace", que reciba: 
//		   - Un array de números enteros.
//		   - Un valor entero que debe buscarse en el array.
//		   - Un valor entero que debe servir para reemplazar.
//		El método buscará todas las ocasiones en las que el segundo parámetro aparezca dentro del array y 
//		reemplazará ese valor con el valor del tercer parámetro.El método main debe crear un array, imprimirlo 
//		en consola, llamar al método "findAndReplace" y volver a imprimir el array en consola.

		int [] borrar = new int [] {25, 85, 14 ,2};
		Utils.mostrarArrayInt(borrar);
		System.out.println("");
		findAndReplace(borrar, 25, 45);
		
	}
	
	public static void findAndReplace (int[] array, int buscar, int reemplazar) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == buscar) {
				array[i] = reemplazar;
			}
		}
		Utils.mostrarArrayInt(array);
	}

}
