package Program4;
/*write a program an interface 
 *create a method in interface
 *create implemention class
 *perform upcasting and call the method
 *and downcasting and call the method*/
public class Main {
	public static void main(String[] args) {
		A a1=(A) new B();
		a1.bottle();
		
		B b1=(B)a1;
		b1.bottle();
	}
}
