package paqueteAlmudena.capitulo04.bloque01_primerosObjetos.poker;

public class Baraja {
	Carta cartas[] = new Carta[52];

	public Baraja() {
	}

	public void rellenoBaraja() {

		int j = 0;
		for (int i = 0; i < 13; i++) {
			cartas[j] = new Carta(i + 1, "Picas", j);
			j++;
		}

		for (int i = 0; i < 13; i++) {
			cartas[j] = new Carta(i + 1, "Diamantes", j);
			j++;
		}

		for (int i = 0; i < 13; i++) {
			cartas[j] = new Carta(i + 1, "Treboles", j);
			j++;
		}

		for (int i = 0; i < 13; i++) {
			cartas[j] = new Carta(i + 1, "Corazones", j);
			j++;
		}

		
		
	}

	public  void abajoArriba() {

		// Guardo el primer valor del array en la aux

		Carta aux = cartas[0];

		// desplazamos los valores a la izquierda
		for (int i = 1; i < cartas.length; i++) {
			cartas[i - 1] = cartas[i];
		}
		// Cuando acaba el bucle, pongo mi aux en la posicion 0
		cartas[cartas.length - 1] = aux;
	}

	public  void arribaAbajo() {
		// Guardo el ultimo valor del array en la aux

		Carta aux = cartas[cartas.length - 1];

		// desplazamos los valores a la derecha
		for (int i = cartas.length - 1; i > 0; i--) {
			cartas[i] = cartas[i - 1];
		}
		// Cuando acaba el bucle, pongo mi aux en la posicion 0
		cartas[0] = aux;
	}

	public void barajar() { // no es estatico porque sino no coge las cartas
		for (int i = 0; i < 200; i++) { // se van ha hacer 200 movimientos para barajar

			int indice1 = (int) Math.round(Math.random() * (cartas.length - 1));
			int indice2 = (int) Math.round(Math.random() * (cartas.length - 1));

			Carta aux = cartas[indice1];
			cartas[indice1] = cartas[indice2];
			cartas[indice2] = aux;

		}
	}

	public void ordenaBaraja() {

		for (int i = cartas.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {

				// Si el número almacenado en la posición j es mayor que el de la posición j+1
				if (cartas[j].getId() > cartas[j + 1].getId()) {

					// guardamos el número de la posicion j+1 en una variable (el menor)

					Carta aux = cartas[j + 1];

					// Lo intercambiamos de posición

					cartas[j + 1] = cartas[j];
					cartas[j] = aux;

				}
			}
		}

	}
	
	
	

}
