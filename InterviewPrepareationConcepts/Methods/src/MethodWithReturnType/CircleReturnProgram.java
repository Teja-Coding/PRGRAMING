package MethodWithReturnType;
/*1)Methods with return type specks about the output given by the method
 *2)If method with return type is void it means method return no output
 *3)if method retrun the output by using a keyword return
 *4)syntax for method with retun type:-
 * AccessSpecifer AcessModifier returnType methodName(){
 *   return output;
 * }
 **/
public class CircleReturnProgram {
	public static void main(String[] args) {
		System.out.println("main starts");
		//double result=ArerOfCircle();
		System.out.println("Result "+ArerOfCircle());
		System.out.println("main ends");
	}
	public static double ArerOfCircle() {
		double pi=3.14;
		int radius=8;
		return pi*radius*radius;
	}
}
