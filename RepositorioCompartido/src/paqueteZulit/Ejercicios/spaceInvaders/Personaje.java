package paqueteZulit.Ejercicios.spaceInvaders;

public class Personaje {

	int puntosVida;
	String nombre;
	boolean estaVivo;
	
	
	
	public Personaje(int puntosVida, String nombre, boolean estaVivo) {
		super();
		this.puntosVida = puntosVida;
		this.nombre = nombre;
		this.estaVivo = estaVivo;
	}



	public int getPuntosVida() {
		return puntosVida;
	}



	public void setPuntosVida(int puntosVida) {
		this.puntosVida = puntosVida;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public boolean isEstaVivo() {
		return estaVivo;
	}



	public void setEstaVivo(boolean estaVivo) {
		this.estaVivo = estaVivo;
	}



	@Override
	public String toString() {
		return "Personaje [puntosVida=" + puntosVida + ", nombre=" + nombre + ", estaVivo=" + estaVivo + "]";
	}
	
	
	
	
	
}
