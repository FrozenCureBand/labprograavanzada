package org.url.java;

public class TriangleLab3 implements ShapeLab3{

	private int Base;
	   private int height;
	   
	   public TriangleLab3(int base, int height) {
	      super();
	      this.Base = base;
	      this.height = height;
	   }
	   
	   public String toString() {
	      return "Triangulo Base : " + Base + " , Altura : " + height;
	   }
	   
	   public double getArea() {
	      return 0.5*Base*height;
	   }

	@Override
	public double getArea1() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String toString1() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
