package Problema2;
import java.util.Scanner;

public class Triangulo implements Poligono{
	Scanner sc = new Scanner(System.in);
	@Override
	public void area(int base, int altura) {
		
		System.out.println("Ingrese base");
		base = sc.nextInt();
		System.out.println("Ingrese altura");
		altura = sc.nextInt();
		System.out.println("El Area es : " + (base * altura/2));
	}

	@Override
	public void perimetro() {
		System.out.println("Ingrese lado 1");
		int lado1 = sc.nextInt();
		System.out.println("Ingrese lado 2");
		int lado2 = sc.nextInt();
		System.out.println("Ingrese lado 3");
		int lado3 = sc.nextInt();
		int perimetrotriangulo = lado1 + lado2 + lado3;
		System.out.println("El perimetro es: " + perimetrotriangulo);
	}

}
