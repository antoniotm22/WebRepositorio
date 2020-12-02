package paqueteAlmudena.capitulo05.examenes;

import paqueteAlmudena.capitulo04.bloque01_primerosObjetos.CromoBaloncesto;

public class Baraja {
	public static void main(String[] args) {
	
	Carta [] baraja = new Carta[52];
	
	rellenoBaraja(baraja);
	
	}
	
	public static void rellenoBaraja(Carta[] array) {
		
		for (int i = 0; i < array.length; i++) {
			
			Carta c = new Carta(5, "Diamantes", i);
		}
		
	}
	
}


