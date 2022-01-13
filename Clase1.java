package clases1;

import java.util.Scanner;

public class Clase1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Perro perro1 = new Perro();
		perro1.nombre = "Satán";
		perro1.raza = "Salchicha";
		perro1.edad = 11;
		perro1.gramos = 10000;
		Perro perro2 = new Perro();
		perro2.nombre = "Belcebú";
		perro2.raza = "Golden";
		perro2.edad = 8;
		perro2.gramos = 8000;
		Perro perro3 = new Perro();
		perro3.nombre = "Mefistófeles";
		perro3.raza = "Westie";
		perro3.edad = 6;
		perro3.gramos = 9000;
		System.out.println(perro1.nombre + " es un " + perro1.raza + " y tiene " + perro1.edad + " años");
		System.out.print(perro2.nombre + " dice ");
		perro2.ladrar();
		perro1.envejecer();
		System.out.println("Ahora " + perro1.nombre + " tiene " + perro1.edad + " años");
		perro3.comer();
		perro2.comer();
		perro1.comer();

		sc.close();
		Persona.asignaDia(5);
		System.out.println(Persona.hoy);

	}

}
