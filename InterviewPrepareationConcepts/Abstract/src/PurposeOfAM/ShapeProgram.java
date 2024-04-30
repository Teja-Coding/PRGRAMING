package PurposeOfAM;
/*PURPOSE OF ABSTACT METHOD
 * 1)by creating abstract method we have get standard method signature 
 * to all the subclass
 * 
 * BY POINT SELING STANDARD METHOD SIGNATURE PROGRAM IS MORE USER
 * FRIENDLY
 * 
 * OTHER ADVANTAGES OF ABSTRAT
 * USING ABSTRACT WE CAN ACHEIVE:-
 * 1)Interface
 * 2)Polymorphism
 * 3)abstraction*/
public class ShapeProgram {
	public static void main(String[] args) {
		Circle c1=new Circle(3.6);
		c1.rotate();
		c1.getArea();
		
		Reactangle r=new Reactangle(10, 20);
		r.rotate();
		r.getArea();
		
		Triangle t=new Triangle(2, 15);
		t.rotate();
		t.getArea();
	}
}
