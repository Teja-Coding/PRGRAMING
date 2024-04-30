package PurposeOfAM;

public class Circle extends Shape{
	public double r;
	public static double pi=3.14;
	@Override
	public void getArea() {
		// TODO Auto-generated method stub
		System.out.println("Area of the cicle");
		System.out.println(pi*r*r);
	}
	public Circle(double r) {
		this.r=r;
	}
	

}
