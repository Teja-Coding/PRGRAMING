package PracticeGeneralistion;

public class MainShape {
	public static void main(String[] args) {
		MainShape ms=new MainShape();
		ms.result(new Circle(5.6));
		ms.result(new Rect(55, 66));
		ms.result(new Tri(12, 8));
	}
	public void result(Shape s) {
		s.rotate();
	
		s.getArea();
	}
}
	