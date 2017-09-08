package org.url.java;

public class RectangleLab3 implements ShapeLab3{
	
	private double length;
	   private double  width;
	   
	   public RectangleLab3 (double length, double width) {
	      
	      this.length = length;
	      this.width = width;
	   }
	   
	   public String toString() {
	      return "Rectangulo Base: " + length + ", Ancho : " + width;
	   }
	   
	   public double getArea() {
	      return length*width;
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
