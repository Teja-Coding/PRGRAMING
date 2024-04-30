package PracticeGeneralistion;

public class Circle extends Shape {
	public double r;
	public static double pi=3.14;
	public Circle(double r) {
		this.r=r;
	}
	
	@Override
	public void getArea() {
		// TODO Auto-generated method stub
		System.out.println("area of the circle");
		System.out.println(pi*r*r);
	}

}
