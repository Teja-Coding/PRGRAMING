package PracticeGeneralistion;

public class Tri extends Shape {
	public int h;
	public int b;
	public Tri(int h,int b) {
		this.h=h;
		this.b=b;
	}
	@Override
	public void getArea() {
		// TODO Auto-generated method stub
		System.out.println("the area of the triangle");
		System.out.println(0.5*h*b);
	}
	

}
