package fraccion;

import java.util.Scanner;

public class Operaciones {

	public static void main(String[] args) {

		int numerador, denominador;// variables para que el usuario introduzca el valor de numerador y denominador
		int eleccion;
		Scanner sc = new Scanner(System.in);

		System.out.print("Introduce el numerador de la primera fracción: ");
		numerador = sc.nextInt();

		System.out.print("Introduce el denominador de la primera fracción: ");
		denominador = sc.nextInt();

		Fraccion frac1 = new Fraccion(numerador, denominador);// primer objeto Fracción

		System.out.print("Introduce el numerador de la segunda fracción: ");
		numerador = sc.nextInt();

		System.out.print("Introduce el denominador de la segunda fracción: ");
		denominador = sc.nextInt();

		Fraccion frac2 = new Fraccion(numerador, denominador);// Segundo objeto Fracción

		System.out.println("La primera fracción es: " + frac1.toString());// Invocaciones e impresión por pantalla de
																			// las fracciones en forma de cadena
		System.out.println("La segunda fracción es: " + frac2.toString());
		System.out.println("Introduce 1 para suma, 2 para resta, 3 para multiplicación y 4 para división");
		System.out.println();
		eleccion = sc.nextInt();
		// Invocación a los diferentes métodos del programa
		switch (eleccion) {
		case 1:
			frac1.sumar(frac2);
			break;
		case 2:
			frac1.restar(frac2);
			break;
		case 3:
			frac1.multiplicar(frac2);
			break;
		case 4:
			frac1.dividir(frac2);
			break;
		default:
			System.out.println("Reinicia si lo deseas ");

		}
//		frac1.sumar(frac2);
//		frac1.restar(frac2);
//		frac1.multiplicar(frac2);
//		frac1.dividir(frac2);
		// No soy capaz de que funcionen todos los métodos a la vez
		// Para ejecutarlos hay que hacerlo de uno en uno
		sc.close();
	}

}
