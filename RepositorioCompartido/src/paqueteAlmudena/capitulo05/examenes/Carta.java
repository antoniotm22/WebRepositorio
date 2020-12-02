package paqueteAlmudena.capitulo05.examenes;

public class Carta {
	
	private int valorCarta;
	private String paloCarta;
	private int id;
	
	public Carta(int valor, String palo, int id) {
		this.paloCarta= palo;
		this.valorCarta= valor;
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
		return valorCarta;
	}

	public void setValorCarta(int valorCarta) {
		this.valorCarta = valorCarta;
	}

	public String getPaloCarta() {
		return paloCarta;
	}

	public void setPaloCarta(String paloCarta) {
		this.paloCarta = paloCarta;
	}

	//toString

	@Override
	public String toString() {
		return "Carta [valorCarta=" + valorCarta + ", paloCarta=" + paloCarta + ", id=" + id + "]";
	}

	


}
