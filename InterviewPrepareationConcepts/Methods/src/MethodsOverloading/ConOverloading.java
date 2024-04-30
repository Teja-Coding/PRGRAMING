package MethodsOverloading;
/*1)process of developing multiple constructors with
 * different arguments is called constructor overloading
 *2)we go for constructor overloading to create
 * "SAME CLASS OBJECT IN MULTIPLE WAYS"*/
public class ConOverloading {
	public ConOverloading(int i,int j) {
		System.out.println("i "+i);
		System.out.println("j "+j);
	}
	public ConOverloading(char i,Boolean j) {
		System.out.println("i "+i);
		System.out.println("j "+j);
	}
	public ConOverloading(int i,double j,double k) {
		System.out.println("i "+i);
		System.out.println("j "+j);
		System.out.println("k "+k);
	}
	public static void main(String[] args) {
		ConOverloading co=new ConOverloading(50, 90);
		ConOverloading c1=new ConOverloading('a',true);
		ConOverloading c2=new ConOverloading(5,5.5,5);
	}
}
