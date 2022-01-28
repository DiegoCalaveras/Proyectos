package fraccion;

import java.util.Scanner;

public class Operaciones {

	public static void main(String[] args) {

		int numerador, denominador;// variables para que el usuario introduzca el valor de numerador y denominador
		int eleccion;
		Scanner sc = new Scanner(System.in);

		System.out.print("Introduce el numerador de la primera fracci�n: ");
		numerador = sc.nextInt();

		System.out.print("Introduce el denominador de la primera fracci�n: ");
		denominador = sc.nextInt();

		Fraccion frac1 = new Fraccion(numerador, denominador);// primer objeto Fracci�n

		System.out.print("Introduce el numerador de la segunda fracci�n: ");
		numerador = sc.nextInt();

		System.out.print("Introduce el denominador de la segunda fracci�n: ");
		denominador = sc.nextInt();

		Fraccion frac2 = new Fraccion(numerador, denominador);// Segundo objeto Fracci�n

		System.out.println("La primera fracci�n es: " + frac1.toString());// Invocaciones e impresi�n por pantalla de
																			// las fracciones en forma de cadena
		System.out.println("La segunda fracci�n es: " + frac2.toString());
		System.out.println("Introduce 1 para suma, 2 para resta, 3 para multiplicaci�n y 4 para divisi�n");
		System.out.println();
		eleccion = sc.nextInt();
		// Invocaci�n a los diferentes m�todos del programa
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
		// No soy capaz de que funcionen todos los m�todos a la vez
		// Para ejecutarlos hay que hacerlo de uno en uno
		sc.close();
	}

}
