package fraccion;

import java.util.Scanner;

public class Fraccion {

	private Integer numerador;
	private Integer denominador;
	
	private enum PositivoNegativo{
		POSITIVA, NEGATIVA;
	}
	Scanner sc = new Scanner(System.in);

	public Integer getNumerador() {
		return numerador;
	}							//getters para consultar los valores de los atributos
	public Integer getDenominador() {
		return denominador;
	}
	public Fraccion(Integer numerador, Integer denominador) {//Constructor de objeto Fracci�n
		this.numerador = numerador;
		this.denominador = denominador;
		while (denominador.equals(0)) {//bucle para comprobar que el denominador no sea 0
			System.out.println("el denominador tiene que ser distinto a 0");
			denominador = sc.nextInt();
			
		}
	
		if(numerador<0&&denominador<0||numerador>0&&denominador>0) {//Si se cumplen estos casos la fracci�n es positiva
			System.out.println("La fracci�n es: "+PositivoNegativo.POSITIVA);
		}else {
			System.out.println("La fracci�n es: "+PositivoNegativo.NEGATIVA);//Si se cumplen estos casos la fracii�n es negativa
		}
	}
	//m�todos para las operaciones con las fracciones, reciben un objeto Fracci�n
	public void sumar(Fraccion frac2) {
		if (this.denominador!=frac2.denominador) {
			System.out.println("No se puede realizar la operaci�n, los denominadores no son iguales");
		}else {
			this.numerador=this.numerador+frac2.numerador;
			System.out.println("El resultado de la suma de ambas fracciones es: " +toString());
		}
		
		
	}
	public void restar(Fraccion  frac2) {
		if (this.denominador!=frac2.denominador) {
			System.out.println("No se puede realizar la operaci�n, los denominadores no son iguales");
		}else {
			this.numerador=this.numerador-frac2.numerador;
			System.out.println("El resultado de la resta de ambas fracciones es: " +toString());
			
		}
	}
	public void multiplicar(Fraccion frac2) {
		this.numerador=this.numerador*frac2.numerador;
		this.denominador=this.denominador*frac2.denominador;
		System.out.println("El resultado de la multiplicaci�n de ambas fracciones es: "+toString());
	}

	public void dividir(Fraccion frac2) {
		this.numerador=this.numerador*frac2.denominador;
		this.denominador=this.denominador*frac2.numerador;
		System.out.println("El resultado de la divisi�n de ambas fracciones es: "+toString());
	}
	public String toString() {//m�todo para devolver el valor de los atributos en forma de cadena
		String numerador = String.valueOf(this.numerador);
		String denominador = String.valueOf(this.denominador);
		String fracstring = numerador + "/" + denominador;
		return fracstring;

	}

}
