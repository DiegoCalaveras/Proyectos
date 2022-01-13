package clases1;

public class CuentaCorriente {

	String DNI, nombreTitular;
	double saldo;

	CuentaCorriente(String nombreTitular, String DNI) {
		this.DNI = DNI;
		this.nombreTitular = nombreTitular;
		this.saldo = 0;
	}

	CuentaCorriente(String DNI, double saldo) {
		this.DNI = DNI;
		this.saldo = saldo;
	}

	CuentaCorriente(String nombre, String DNI, double saldo) {
		this(nombre, saldo);
		this.nombreTitular = nombre;
	}

	void retiradaEfectivo(double cantidad) {
		double cant = cantidad;
		System.out.println("Está usted retirando " + cantidad + " euros");
		if (cant > saldo) {
			System.out.println("Saldo insuficiente");
		} else {
			saldo -= cant;
		}

	}

	void ingreso(double ingreso) {
		double in = ingreso;
		saldo += in;
		System.out.println("Usted quiere  ingresar " + ingreso);
	}

	void informacion() {
		System.out.println("La cuenta del cliente " + this.nombreTitular + " con DNI " + this.DNI + " tiene "
				+ this.saldo + " euros de saldo ");

	}

	public static void main(String[] args) {
		CuentaCorriente cuenta1 = new CuentaCorriente("123456789W", "Pepito Pérez");
		cuenta1.ingreso(500);
		cuenta1.retiradaEfectivo(50);
		cuenta1.informacion();

	}

}
