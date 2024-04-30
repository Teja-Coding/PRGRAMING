package ContructorsProgram;
/*1)Contructors are special type of methods which gets
 * executed during object creation
 *2)Contructors are called by new operator
 *3)There are two types of constructors
 *a)Constructors with Arguments
 *b)Constructors without Arguments
 *4)Syntax of Constructor:-
 *  AccessSpecifier ConatuctorName(Args/no Args){
 *  
 *  }
 *5)Constructor name must be same as class name */
public class CircleProgram {
	
	public int r;
	public static double pi=3.14;
	public CircleProgram(int a) {
		r=a;
	}
	public void radiusCircle() {
		System.out.println("radius of the circle "+pi*r*r);
	}
	public static void main(String[] args) {
		CircleProgram c1=new CircleProgram(5);
		CircleProgram c2=new CircleProgram(6);
		
		c1.radiusCircle();
		c2.radiusCircle();
		
	}
}
