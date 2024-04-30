package MethodsOverloading;
/*1)Method name should be same and the argument should 
 * be different is called "METHOD OVERLOADING"*/
public class MethodOverload {
	public static void add() {
		int i=10;
		int j=20;
		int a=(i+j);
		System.out.println(a);
	}
	public int add(int x,int y) {
		int z=x+y;
		System.out.println(z);
		return z;	
	}
	public static void main(String[] args) {
		add();
		MethodOverload mo=new MethodOverload();
		mo.add(55, 65);
	}
}
