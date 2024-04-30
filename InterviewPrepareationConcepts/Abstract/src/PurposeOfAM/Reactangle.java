package PurposeOfAM;

public class Reactangle extends Shape{
	public int l;
	public int b;
	public Reactangle(int l,int b) {
		this.l=l;
		this.b=b;
	}

	@Override
	public void getArea() {
		// TODO Auto-generated method stub
		System.out.println("Area of reactangle");
		System.out.println(l*b);
	}
	public void rotate() {
		System.out.println("anti clock wise");
	}

}
