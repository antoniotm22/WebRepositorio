package paqueteAlmudena.capitulo04.bloque01_primerosObjetos.poker;

public class Carta {
	
	private int valor;
	private String palo;
	private int id;
	
	
	
	
	
	public Carta() {
		
	}



	public Carta(int valor, String palo, int id) {
		this.palo= palo;
		this.valor= valor;
		this.id = id;
		
	}
	
	
	
	//getter and setter

	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public int getValorCarta() {
		return valor;
	}

	public void setValorCarta(int valorCarta) {
		this.valor = valorCarta;
	}

	public String getPaloCarta() {
		return palo;
	}

	public void setPaloCarta(String paloCarta) {
		this.palo = paloCarta;
	}

	//toString

	@Override
	public String toString() {
		return "Carta [valorCarta=" + valor + ", paloCarta=" + palo + ", id=" + id + "]";
	}

	


}
