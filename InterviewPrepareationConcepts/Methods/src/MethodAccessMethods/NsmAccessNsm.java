package MethodAccessMethods;
/*non static methods calling nonstatic methods directly because 
 * both are in same heap area
 * Nsm ------>Nsm   */
public class NsmAccessNsm {
	public static void main(String[] args) {
		System.out.println("main starts");
		NsmAccessNsm nsm=new NsmAccessNsm();
		nsm.sun();
		System.out.println("main ends");
	}
	public void sun() {
		System.out.println("sun raises");
		rain();
		System.out.println("sun sets");
	}
	public void rain() {
		System.out.println("rain starts");
		System.out.println("rain ends");
		
	}
}
