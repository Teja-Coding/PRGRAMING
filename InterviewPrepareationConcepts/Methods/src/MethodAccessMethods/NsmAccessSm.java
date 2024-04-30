package MethodAccessMethods;

/*non static method access static method directly 
 * because all static method are stored in static pool area
 * and their is only one static pool area in heap area
 * Nsm----->sm*/
public class NsmAccessSm {
	public static void main(String[] args) {
		System.out.println("main starts");
		NsmAccessSm nsm=new NsmAccessSm();
		nsm.code();
		System.out.println("main ends");

	}
	public void code() {
		System.out.println("code starts");
		execution();
		System.out.println("code ends");
	}
	public static void execution() {
		System.out.println("execution starts");
		System.out.println("execution ends");
	}
}
