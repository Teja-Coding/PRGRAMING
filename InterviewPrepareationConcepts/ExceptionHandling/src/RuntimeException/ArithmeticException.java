package RuntimeException;

public class ArithmeticException {
	public static void main(String[] args) {
		System.out.println("main Starts");
	try {
		int x=10;
		int y=0;
		int z=x/y;
		System.out.println(z);
		System.out.println("main ends");
	}
	catch (java.lang.ArithmeticException Exception  ) {
		// TODO: handle exception
		System.out.println("handal exception");
	}
	}
}