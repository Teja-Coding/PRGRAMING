package Programs;
/*"Object Type Casting:-"
 * 1)Converting one object type to look like anthor object
 *   type is called object type casting
 * 2)There are two type of object typecasting
 *     a)Upcasting
 *     b)Downcasting
 * 3)Process of converting subclass object "to look like"
 *   super class object is called Upcasting
 * 4)Upcasting is passible because subclass object will
 *   have properties of superclass
 * 5)When object is upcasted subclass properties hidden
 * super class properties are "visible"
 * 6)Process of coverting superclass object to look like 
 *   subclass object is called Downcasting
 * 7)Downcasting is passible only after Upcasting
 * 8)during downcasting hidden subclass properties become
 *   Visable*/
public class Program1 {
	public static void main(String[] args) {
		System.out.println("upcasting");
		A a1=(A) new B();//upcasting
		a1.wings();
		System.out.println("downcasting");
		B b1=(B)a1;//downcasting
		b1.wings();
		b1.weels();
		
	}
}
