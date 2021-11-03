package masterofthesub;

import java.util.Scanner;

public class Master {

	public static int main(String[] args) {

		float  fren = 0, sep, sepbis=fren*1/4, vel = 0, car, carbis = 0, fire=sepbis/vel*1000, fon = 0; 
		// fren: frente de onda, 
		//sep: separacion 2/3,
		//sepbis separacion 1/4,
		//vel: velocidad del sonido
		//car: cardioide básico, 
		//carbis: tiempo total contando lo que tarda en llegar la onda
		//fire: end fire, 
		//fon: fondo del sub
		int lon = 0, temp, elec = 0; //  lon: longitud de onda, temp: temperatura ambiente, elec: elección switch
		
		Scanner sc=new Scanner(System.in);
			System.out.println("Introduce la temperatura ambiente ");
				int flag=0;
				while(flag==0) {
					try {
						temp=sc.nextInt();
						vel=331.4f+(0.6f*temp);
						flag=1;
					}catch(Exception e) {
						System.out.println("Introduce un número ");
						sc.nextLine();
					}finally {
						
					}
				}
			System.out.println("Introduce la frecuencia de corte ");
				int flag1=0;
				while(flag1==0) {
					try {
						lon=sc.nextInt();
						fren=vel/lon;
						flag1=1;
					}catch(Exception e) {
						System.out.println("Introduce un número ");
						sc.nextLine();
					}finally {
						
					}
				}
			System.out.println ("La longitud de onda de " +lon +"hz es " +fren +"m");
				
				int flag2=1;
				while(flag2==1){
					System.out.println("Selecciona 1 para arreglo en línea, 2 para cardioide y 3 para End Fire ");
					
					int flag4=0;
					while(flag4==0) {
						try {
							elec=sc.nextInt();
							flag4=1;
						}catch(Exception e) {
							System.out.println("Introduce un número ");
							sc.nextLine();
						}finally {
							
						}
					}
				
					switch (elec) {
				
					case 1:
						sep=fren*2/3;
						System.out.printf("Separa tus subs a %.3fm siquieres tenerlos a 2/3 de lambda",sep );
						sepbis=fren*1/4;
						System.out.printf("\nSepara tus subs a %.3fm  si quieres tenerlos a 1/4 de lambda", sepbis);
						System.out.println("\n¿Quieres seguir en el programa? (y/n) ");
						String yn=sc.nextLine();
						if (yn.equals("y")) {
							flag2=0;
						}else {
							flag2=1;
						}
						
						sc.nextLine();
						break;
				
					case 2:
						System.out.println("Introduce la medida de fondo de tu sub en metros");
						int flag11=0;
						while(flag11==0) {
							try {
								fon=sc.nextFloat();
								car=fon/vel*1000;
								carbis=car*2;
								flag11=1;
							}catch(Exception e) {
								System.out.println("Introduce un número ");
								sc.nextLine();
							}finally {
						
							}
						}
						System.out.printf("Este sería el tiempo de delay a insertar al cardioide: %.3fms ",carbis );
						System.out.println("\nNO TE OLVIDES DE CAMBIAR LA FASE AL QUE MIRA AL ESCENARIO ");
						System.out.println("¿Quieres seguir en el programa? (y/n) ");
						String yesn=sc.nextLine();
						if (yesn.equals("y")) {
							flag2=0;
						}else {
							flag2=1;
						}
						sc.nextLine();
				
						break;
				
					case 3:
						System.out.println("Introduce la medida de fondo de tu sub en metros");
						int flag12=0;
						while(flag12==0) {
							try {
								fon=sc.nextFloat();
								flag12=1;
							}catch(Exception e) {
								System.out.println("Introduce un número ");
								sc.nextLine();
							}finally {
						
							}
						}
						sepbis=fren*1/4;	
						fire=sepbis/vel*1000;
						System.out.printf("Separalos a %1$.3fm e introduce %2$.3fms al primero y ve sumándolo a cada elemento " ,sepbis,fire);
						System.out.println("\n¿Quieres seguir en el programa? (y/n) ");
						String yno=sc.nextLine();
						if (yno.equals("y")) {
							flag2=0;
						}else 
							if (yno.equals("n")) {
							
							flag2=1;
							
						}
						sc.nextLine();
						
						break;
						default: 
						System.out.println("Introduce un número del 1 al 3 para elegir el tipo de arreglo ");
						
						
					}
					
				}
					
				
	
				
			System.out.println("\nIntroduce nombre del recinto ");
			String nombre=sc.nextLine();
			System.out.print("Proyecto diseñado para " + nombre);
			System.out.println("\nAhora haz que " +nombre + " se venga a abajo" );
				
				sc.close();
	
	}

}
