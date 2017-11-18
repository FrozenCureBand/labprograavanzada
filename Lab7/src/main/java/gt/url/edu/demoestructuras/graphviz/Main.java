package gt.url.edu.demoestructuras.graphviz;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DemoGraphviz objDemo = new DemoGraphviz();
		String s;
		System.out.print("Introduzca la ruta, ej. example/ex1.png");
		s = sc.nextLine();
	    try {
			objDemo.createDemoGraph(s);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
	
}
