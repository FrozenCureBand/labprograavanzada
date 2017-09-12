package EjemploColas;

import java.util.Scanner;

import EjemploColas.Colas.Queue;
public class Main {
	static Scanner sc = new Scanner(System.in);
	//private static Scanner sc;

	public static void main(String[] args) {
		 int n;
		Queue<Integer> newQueue = new Queue<Integer>(5);
        newQueue.enQueue(10);
        newQueue.enQueue(20);
        newQueue.enQueue(30);
        newQueue.enQueue(40);
        newQueue.enQueue(50);
        System.out.println(newQueue.toString());
//        System.out.println("Ingrese numero a iniciar");
//        n = sc.nextInt();
//        int h;
//        Recursivo objrecursivo = new Recursivo();
//        h = objrecursivo.factorial(n);
//        System.out.println(h);
        //System.out.println((T) newQueue.deQueue().toString());
        //System.out.println((T) newQueue.toString());
        //newQueue.enQueue(60);
        //newQueue.enQueue(70);
        //System.out.println((T) newQueue.toString());
        //System.out.println((T) newQueue.deQueue().toString());
        //System.out.println((T) newQueue.deQueue().toString());
        //System.out.println((T) newQueue.deQueue().toString());
        //System.out.println((T) newQueue.deQueue().toString());
        //System.out.println((T) newQueue.deQueue().toString());
        //System.out.println((T) newQueue.toString());

		
		}
	
	}