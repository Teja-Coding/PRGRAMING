package Program3;
/*write a program below requirements
 *create abstract class with abstract method
 *create a subclass for complete the method
 *perfrom upcasting and call the method perform
 *down casting and call the method*/
public class Main {
	public static void main(String[] args) {
		A a1=(A) new B();
		a1.chair();
		
		B b1=(B) a1;
		b1.chair();
	}
}
