package paqueteAlmudena.capitulo05.bloque07_Listas;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import paqueteAlmudena.capitulo05.bloque04_arrayMatrices.Utils;

public class listaInteger {

	public static void main(String[] args) {
		/*
		 *   a) "Abandonar el programa".
		     b) "Crear aleatoriamente la lista de valores". Pedirás al usuario los siguientes datos: longitud de la 
		     	lista, valor mínimo y valor máximo. A continuación limpiarás la lista (por si contenía valores), y 
		     	agregarás tantos elementos enteros como se haya indicado, con valores que deben oscilar entre el mínimo y el 
		     	máximo señalado.
		     c) "Calcular suma, media, mayor y menor". Mostrarás en pantalla esos cuatro valores.
		     d) "Agregar una cantidad de nuevos valores". Pedirás al usuario los siguientes datos: cuántos datos nuevos 
			     quiere agregar, posición a partir de la que se deben introducir, valor mínimo y valor máximo. Incluirás tantos 
			     valores como indique el usuario, en la posición indicada, con valores entre mínimo y máximo.
		     e) "Eliminar elementos cuyo valor esté en un intervalo". Pedirás dos valores al usuario (mínimo y máximo), que 
		     	conforman un intervalo. Eliminarás los valores de la lista de elementos que se encuentren dentro de ese
				intervalo (incluyendo los límites) e informarás de cuantos elementos has eliminado de la lista.
		     f) "Imprimir la lista". Mostrarás la lista en pantalla.
		 */
		
		List<Integer> archivo = new ArrayList<Integer>();
		int opcion;

		do {
			opcion = Integer.parseInt(JOptionPane.showInputDialog("Inserte la acción que quiere realizar:\n"
					+ "0 Abandonar el programa\n" + "1 Crear aleatoriamente la lista de valores\n"
					+ "2 Calcular suma, media, mayor y menor\n" + "3 Agregar una cantidad de nuevos valores\n"
					+ "4 Eliminar elementos cuyo valor esté en un intervalo\n" + "5 Imprimir lista")

			);

			switch (opcion) {

				case 0: System.exit(0);
				case 1: numAletoriosLista(archivo);
					break;
				case 2: sumaMediaMayorMenor(archivo);
					break;
				case 3: valoresNuevos(archivo);
					break;
				case 4: borrarIntervalo(archivo);
					break;
				case 5: imprimirFichero(archivo);
	
					
	
				

			}
		} while (opcion != 0);

	}
	
	public static void numAletoriosLista(List<Integer> list) {
		//  Pedirás al usuario los siguientes datos: longitud de la lista, valor mínimo y valor máximo. A continuación 
		//  limpiarás la lista (por si contenía valores), y agregarás tantos elementos enteros como se haya indicado, 
		//  con valores que deben oscilar entre el mínimo y el máximo señalado.
		
		int longitud = Integer.parseInt(JOptionPane.showInputDialog("Inserte la longitud de la lista"));
		int minimo = Integer.parseInt(JOptionPane.showInputDialog("Inserte el valor minimo de la ista"));
		int maximo = Integer.parseInt(JOptionPane.showInputDialog("Inserte el valor máximo de la ista"));
		list.clear();
		for (int i = 0; i < longitud; i++) {
			list.add( Utils.numAleatorioLimSupInf(minimo, maximo));
		}

	}
	
	
	public static void sumaMediaMayorMenor (List<Integer> list) {
		int suma = 0;
		float media = 0f;
		int mayor = list.get(0);
		int menor = list.get(0);
		
		for (int i = 0; i < list.size(); i++) {
			suma += list.get(i);
		}
		media = (float)suma/list.size();
		
		
		
		System.out.println("Suma: " + suma);
		System.out.println("Media: " + media);
	
		
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) > mayor) mayor = list.get(i);
			
			if (list.get(i) < menor) menor = list.get(i);
		}
		
		System.out.println("menor: " + menor);
		System.out.println("mayor: " + mayor);
		
		
	}
	
	
	
	public static void imprimirFichero(List<Integer> list) {

		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + ": " + list.get(i));
		}
		System.out.println("----------------------------------------------------------------------------------------");

	}
	
	public static void valoresNuevos (List<Integer> list) {
		List<Integer> nuevo = new ArrayList<Integer>();
		numAletoriosLista(nuevo);
		list.addAll(nuevo);
		
	}
	
	public static void borrarIntervalo (List<Integer> list) {

		int numInicial;
		int numFinal;

		List<String> portaPapeles = new ArrayList<String>();

		numInicial = Integer.parseInt(
				JOptionPane.showInputDialog("Escriba la linea inicial de la selección de lineas que vas a cortar"));
		numFinal = Integer.parseInt(
				JOptionPane.showInputDialog("Escriba la linea final de la selección de lineas que vas a cortar"));
		int i = numInicial;
		for ( ; i <= numFinal; i++) {
				list.remove(numInicial);
		}
	
	}

}
