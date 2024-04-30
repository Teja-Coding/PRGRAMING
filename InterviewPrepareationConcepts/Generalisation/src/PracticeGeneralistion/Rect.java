package PracticeGeneralistion;

public class Rect extends Shape{
	public int l;
	public int b;
	public Rect(int l,int b) {
		this.l=l;
		this.b=b;
	}
	@Override
	public void getArea() {
		// TODO Auto-generated method stub
		System.out.println("area of rect");
		System.out.println(l*b);
	}
	public void rotate() {
		System.out.println("anti clock wise");
	}
}
