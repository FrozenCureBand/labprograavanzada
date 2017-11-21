package Problema2;
import java.util.Scanner;

public class Cuadrilatero implements Poligono{
	Scanner sc = new Scanner(System.in);
	@Override
	public void area(int base, int altura) {
		
		System.out.println("Ingrese base");
		base = sc.nextInt();
		System.out.println("Ingrese altura");
		altura = sc.nextInt();
		System.out.println("El Area es : " + (base * altura));
		
	}

	@Override
	public void perimetro() {
		int base;
		int altura;
		System.out.println("Ingrese base");
		base = sc.nextInt();
		System.out.println("Ingrese altura");
		altura = sc.nextInt();
		System.out.println("El Perimetro es es : " + (2*base + 2*altura));
		
	}

	

}
