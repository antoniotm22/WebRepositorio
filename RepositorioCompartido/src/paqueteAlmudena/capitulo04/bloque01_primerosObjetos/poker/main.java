package paqueteAlmudena.capitulo04.bloque01_primerosObjetos.poker;

public class main {

	public static void main(String[] args) {
		Baraja baraja = new Baraja();
		

		Baraja.rellenoBaraja();

		for (int i = 0; i < baraja.length; i++) {
			System.out.println(baraja[i].toString());

		}
		

	}
	
	

}
