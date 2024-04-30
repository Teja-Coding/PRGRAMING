package MethodAccessMethods;
/*Static method calling non static method by using refernce variable
 * because static method are in static pool area and non static methods are in 
 * heap area with ref variable
 * sm---->nsm*/
public class SmAccessNsm {
	public static void main(String[] args) {
		System.out.println("main starts");
		walk();
		System.out.println("main ends");
	}
	public static void walk() {
		System.out.println("walk starts");
		SmAccessNsm sms=new SmAccessNsm();
		sms.jog();
		System.out.println("walk ends");
	}
	public void jog() {
		System.out.println("jod Starts");
		System.out.println("joog ends");
	}
}
