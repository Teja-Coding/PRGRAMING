package PurposeOfAM;

public class Triangle extends Shape{
	public int h;
	public int b;
	public Triangle(int h,int b) {
		this.h=h;
		this.b=b;
	}
	@Override
	public void getArea() {
		// TODO Auto-generated method stub
		System.out.println("the area of triangle");
		System.out.println(0.8*h*b);
	}

}
