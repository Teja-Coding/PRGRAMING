package Program2;
/*wap for the below req
 * program for hireacrchical inheritance
 * perform upcasting and downcasting*/
public class Hirearchical {
	public static void main(String[] args) {
		A a=(A)new B();//upcasting
		a.bag();
		A a2=(A)new C();
		a2.bag();//upcasting
		System.out.println("upcasting is done");
		System.out.println("--------------------------------");
		B b1 = (B) a;
		b1.bag();
		b1.books();
		System.out.println("Class B down casting is done");
		System.out.println("----------------------------------");
		C c1=(C) a2;
		c1.bag();
		c1.pen();
		System.out.println("class C down casitng is done ");
	}
}
