package AnotherClass;
/*When their are multiple classed in the program
 * file name must be same as a className which contains
 * MianMethod*/
public class B {
	 public static void main(String[] args) {
		System.out.println("main starts");
		System.out.println(A.i);
		A a1=new A();
		System.out.println(a1.j);
		System.out.println("main ends");
		
	}
}
