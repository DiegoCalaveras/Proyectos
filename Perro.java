package clases1;

import java.util.Scanner;

public class Perro {

	String nombre, raza;
	int edad, gramos;

	void ladrar() {
		System.out.println("Guau");
	}

	void envejecer() {
		edad++;

	}

	void comer() {
		int peso;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la cantidad de comida en gramos");
		int gramos = sc.nextInt();
		comer(gramos);

	}

	void comer(int gramos) {
		double adecuada;
		adecuada = (gramos * 100 / this.gramos);
		int kilos = this.gramos / 1000;
		if (adecuada < 2.5) {
			System.out.println(nombre + " pesa " + kilos + " kilos y esto representa el " + adecuada + " % de su peso"
					+ " la cantidad es adecuada ");
		} else {
			System.out.println("Estás cebando a " + nombre + " pesa " + kilos + " kilos y esto supone un " + adecuada
					+ "% de su peso");
		}
	}

}
