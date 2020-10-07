package paqueteAlmudena.Capitulo1;

import javax.swing.JOptionPane;

public class Ejer6 {

	public static void main(String[] args) {
		// Realiza un ejercicio en C para el cálculo de la cuota mensual de una hipóteca 
		//(tema tan importante hoy día ;-)). La formula para la cuota mensual es:
		//Cuota Mensual = Capital * (((im*(1+im)^n))/(((1+im)^n)-1))
		
		//im= inan / 12/100
		//interes anual =  Euribor + Diferencial
		
		//declaramos las variables
		
		float diferencial;
		float capital;
		float euribol;
		int n; //plazos mensuales
		
		 
		
		//pedimos valores
		String srt;
		srt= JOptionPane.showInputDialog("Inserta el capital");
		capital = Float.parseFloat(srt);
		
		srt= JOptionPane.showInputDialog("Inserta el euribol");
		euribol = Float.parseFloat(srt);
		
		srt= JOptionPane.showInputDialog("Inserta el diferencial(La ganancia del banco)");
		diferencial = Float.parseFloat(srt);
		
		srt= JOptionPane.showInputDialog("Inserta el numero de plazos mensuales");
		n = Integer.parseInt(srt);
		
		//CALCULAMOS EL INTERES ANUAL
		 
		float interesAnual;
		interesAnual= euribol+diferencial;
		
		//CALCULAMOS EL IM= intereAnual / 12/100
		float im;
		im= interesAnual/12;
		im= im/100;
		
		//CALCULAMOS CUOTA MENSUAL
		float total;
		
		//calculamos el numerador
		float numerador;
		float exp1;
		float exp2=(float) 1;//le hacemos un castin para convertirlo en flotante
		
		exp1= 1+im;
		
		while ( n>0) {
			  exp2=exp2*exp1;
			  n--;
			}
		
		
				
		numerador= im*exp2;
		
		
		//calculamos el denominador
		float denominador;
		denominador=  exp2-1;
		
		
		//hacemos la division 
		float div;
		div= numerador/denominador;
		
		//calculamos el total 
		
		total= capital*div;
		
		//Mostramos por pantalla
		System.out.println(total);
	}

}
