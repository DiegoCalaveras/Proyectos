package clases1;

public class Persona {

	private String nombre;
	private int edad;
	private double estatura;
	private static String hoy;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getEstatura() {
		return estatura;
	}

	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}

	Persona() {
		this.nombre = "Desconocido";
		this.edad = 0;
		this.estatura = 0;
		hoy = "Desconocido";
	}

	Persona(String nombre) {
		this.nombre = nombre;
	}

	Persona(String nombre, int edad, double estatura) {
		this(nombre);
		this.edad = edad;
		this.estatura = estatura;
	}

	static void asignaDia(int diaNum) {
		hoy = switch (diaNum) {
		case 1 -> {
			yield "Lunes";
		}
		case 2 -> {
			yield "Martes";
		}
		case 3 -> {
			yield "Miercoles";
		}
		case 4 -> {
			yield "Jueves";
		}
		case 5 -> {
			yield "Viernes";
		}
		case 6 -> {
			yield "Sabado";
		}
		case 7 -> {
			yield "Domingo";
		}
		default -> {
			yield "Dia no existente";
		}
		};

	}
}
