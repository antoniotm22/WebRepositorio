package paqueteAlmudena.capitulo05.bloque07_Listas;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.event.SwingPropertyChangeSupport;

public class editorDeTextos {

	public static void main(String[] args) {
		/*
		 * Para hacer esto utilizarás una lista de elementos de tipo String. Cada línea
		 * del texto será representada como un String. Debes mostrar un menú en
		 * pantalla, que contenga todas las opciones siguientes, y que funcionen
		 * adecuadamente: a) "Agregar una línea al texto". Pediras al usuario un String
		 * y lo agregarás al final de la lista que representa tu fichero ficticio. b)
		 * "Insertar una línea en cualquier posición del texto". Pedirás al usuario un
		 * String y un número. Insertarás el String en la línea pedida. c)
		 * "Editar una línea (reescribir su contenido)". Pedirás al usuario un número de
		 * línea para sobrescribir, mostrarás al usuario la línea actual que desea
		 * sobrescribir. Pedirás un nuevo String. Eliminarás el String actual y
		 * cambiarás con el nuevo d) "Borrar una línea". Pedirás un número de línea y la
		 * eliminarás de la lista. e) "Cortar un conjunto de líneas", (marcadas por su
		 * posición inicial y final). Pedirás un número de línea inicial y uno final.
		 * "Transportarás todas las líneas del intervalo a una nueva lista y las
		 * borrarás de la lista original. f)
		 * "Pegar un conjunto de líneas cortadas en una determinada posición". Pedirás
		 * un número de línea en la que insertar lo que tienes cortado con la opción
		 * anterior. g) "Imprimir el fichero". Mostrarás cada línea del fichero
		 * ficticio, aparecerá numerada en la consola.
		 */
		List<String> archivo = new ArrayList<String>();
		List<String> archivo2 = new ArrayList<String>();
		List<String> portaPapelesfull = new ArrayList<String>();
		int opcion;

		do {
			opcion = Integer.parseInt(JOptionPane.showInputDialog("Inserte la acción que quiere realizar:\n"
					+ "0 Salir\n" + "1 Agregar una línea al texto\n"
					+ "2 Insertar una línea en cualquier posición del texto\n" + "3 Editar una línea\n"
					+ "4 Borrar una línea\n" + "5 Cortar un conjunto de líneas\n"
					+ "6 Pegar un conjunto de líneas cortadas en una determinada posición\n" + "7 Imprimir el fichero")

			);

			switch (opcion) {

				case 0: System.exit(0);
				case 1: agregarLinea(archivo);
					break;
				case 2: insertarLinea(archivo);
					break;
				case 3: editarLinea(archivo);
					break;
				case 4: borrarLinea(archivo);
					break;
				case 5: portaPapelesfull = cortarConjuntoLineas(archivo);
					break;
				case 6: pegarConjuntoLineasCortadas(archivo2,portaPapelesfull);
					break;
				case 7: {
					int opcionLista = Integer.parseInt(JOptionPane.showInputDialog("Inserte que Lista quiere Imprimir\n"
							+ "1 Archivo\n" + "2 Archivo 2 ( es donde se pegan los elementos copiados)"));
	
					switch (opcionLista) {
					case 1: imprimirFichero(archivo);
						break;
					case 2: imprimirFichero(archivo2);
						break;
	
					}
	
				}

			}
		} while (opcion != 0);

	}

	
	public static void agregarLinea(List<String> list) {
		// Pediras al usuario un String y lo agregarás al final de la lista que
		// representa tu fichero ficticio.
		String srt;
		srt = JOptionPane.showInputDialog("Inserte la linea que quieres añadir");

		list.add(list.size(), srt); // añado lo que ha dado el usuario a la ultima linea

	}

	public static void insertarLinea(List<String> list) {
		// Pedirás al usuario un String y un número.Insertarás el String en la línea
		// pedida.
		
		int numLinea = Integer.parseInt(JOptionPane.showInputDialog("¿En qué linea quieres insertar la linea?"));
		String	srt = JOptionPane.showInputDialog("Inserte la linea que quieres añadir");

		list.add(numLinea, srt);
	}

	public static void editarLinea(List<String> list) {
		// Pedirás al usuario un número de línea para sobrescribir,mostrarás al usuario
		// la línea actual que desea
		// sobrescribir. Pedirás un nuevo String. Eliminarás el String actual y
		// cambiarás con el nuevo.
		String srt;
		int numLinea;
		numLinea = Integer.parseInt(JOptionPane.showInputDialog("¿En qué linea quieres editar texto?"));
		srt = JOptionPane.showInputDialog("Escriba que quieres poner");

		list.remove(numLinea); // borro la linea que habia antes
		list.add(numLinea, srt); // escribo en la misma linea con el texto correcto

	}

	public static void borrarLinea(List<String> list) {
		// Pedirás un número de línea y la eliminarás de la lista.
		int numLinea;
		numLinea = Integer.parseInt(JOptionPane.showInputDialog("¿Qué linea desea borrar?"));

		list.remove(numLinea);
	}
	
	/**
	 * 
	 * @param original
	 * @return
	 */
	public static List cortarConjuntoLineas(List<String> original) {

		// Pedirás un número de línea inicial y uno final. "Transportarás todas las
		// líneas del intervalo a una nueva lista
		// y las borrarás de la lista original.
		int numInicial;
		int numFinal;

		List<String> portaPapeles = new ArrayList<String>();

		numInicial = Integer.parseInt(
				JOptionPane.showInputDialog("Escriba la linea inicial de la selección de lineas que vas a cortar"));
		numFinal = Integer.parseInt(
				JOptionPane.showInputDialog("Escriba la linea final de la selección de lineas que vas a cortar"));
		int i = numInicial;
		for ( ; i <= numFinal; i++) {
				portaPapeles.add(original.get(numInicial));
				original.remove(numInicial);
		}

		return portaPapeles;

	}

	public static void pegarConjuntoLineasCortadas(List<String> list2, List<String> portaPapeles) {
		// Pedirás un número de línea en la que insertar lo que tienes cortado con la
		// opción anterior.

		int numLinea;
		numLinea = Integer.parseInt(JOptionPane.showInputDialog("¿Qué linea lo desea pegar?"));
		
		list2.addAll(numLinea, portaPapeles);
		

	}

	public static void imprimirFichero(List<String> list) {

		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + ": " + list.get(i));
		}
		System.out.println("----------------------------------------------------------------------------------------");

	}
}
