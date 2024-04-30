package MethodOveriding;
/*1)During inheritance process subclass can change the 
 * method implimentation of inherited method this process
 * is called Method overiding
  2)Method overiding depends on two factors
   a)inheritance is must
   b)Subclass should maintain same method signature Defined in superclass*/
public class Main {
	public static void main(String[] args) {
		Cirecle c1=new Cirecle();
		Rectangle r1=new Rectangle();
		Triangle t1=new Triangle();
		
		c1.rotate();
		r1.rotate();
		t1.rotate();
	}
}
/*we go for method overriding when we want to change method implimention of inherited 
 * method for a  particular subclass with effecting other soloclass
 * 
 * OTHER ADVENTAGES OF METHOD OVERRIDING
 * 1)method overriding plays a major role in
 * 1)abstract
 * 2)interface
 * 3)polymorphism
 * 
 * NOTE:=only non static methods can be overrided because it supportes inheritance
 * static methods cannot be overrided because it does not supports inheritace*/
 