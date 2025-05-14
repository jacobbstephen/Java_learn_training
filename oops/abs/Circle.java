package oops.abs;

public class Circle extends Shape implements Drawable{
	double radius;
	
	Circle(double radius){
		this.radius = radius;
	}
	
	@Override
	public double  area() {
		return  Math.PI * radius * radius;
	}
	
	
	@Override
	
	public void drawing() {
		System.out.println("Take a compass and draw a circle");
	}
}
