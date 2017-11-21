package Problema2;
import java.util.Scanner;

public class Pentagono implements Poligono{
	Scanner sc = new Scanner(System.in);
	@Override
	public void area(int base, int altura) {
		
		System.out.println("Ingrese base");
		base = sc.nextInt();
		System.out.println("Ingrese apotema");
		altura = sc.nextInt();
		System.out.println("El Area es : " + (5*base*altura/2));
		
	}

	@Override
	public void perimetro() {
		
		System.out.println("Ingrese lado 1");
		int lado1 = sc.nextInt();
		System.out.println("Ingrese lado 2");
		int lado2 = sc.nextInt();
		System.out.println("Ingrese lado 3");
		int lado3 = sc.nextInt();
		System.out.println("Ingrese lado 4");
		int lado4 = sc.nextInt();
		System.out.println("Ingrese lado 5");
		int lado5 = sc.nextInt();
		int perimetropenta = lado1 + lado2 + lado3 + lado4 + lado5;
		System.out.println("El perimetro es: " + perimetropenta);
		
	}

	

}
