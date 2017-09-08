package org.url.java;
import java.util.Scanner;

import org.url.java.RectangleLab3;
import org.url.java.ShapeLab3;
import org.url.java.TriangleLab3;
public class MainLab3 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
				System.out.println("     dBP  dBBBBBb    dBBBBb            dBBBBb  ");
				System.out.println("               BB       dBP                    ");
				System.out.println("   dBP     dBP BB   dBBBK'             dBBBP   ");
				System.out.println("  dBP     dBP  BB  dB' db               dBP    ");
				System.out.println(" dBBBBP  dBBBBBBB dBBBBP'           dBBBBP     ");
				System.out.println("");
				System.out.println("     ╔═╗┌─┐┬ ┬ ┬┌┬┐┌─┐┬─┐┌─┐┬ ┬┬┌─┐┌┬┐");
				System.out.println("     ╠═╝│ ││ └┬┘││││ │├┬┘├─┘├─┤│└─┐│││");
				System.out.println("     ╩  └─┘┴─┘┴ ┴ ┴└─┘┴└─┴  ┴ ┴┴└─┘┴ ┴");
				System.out.println("");
    		ShapeLab3 s11 = new RectangleLab3(6, 7); 
    		System.out.println("===========================================");
        System.out.println(s11);
        System.out.println("El area es " + s11.getArea()); 
        ShapeLab3 s2 = new TriangleLab3(4, 5);
        System.out.println("===========================================");
        System.out.println(s2);
        System.out.println("El Area es " + s2.getArea()); 
        System.out.println("===========================================");
	}
}
	


