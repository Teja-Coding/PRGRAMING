package GeneralisationPrograms;
/*Steps to create generalized method
 * create a static or non static method
 * create argument for the method 
 * argument should be referance variable type(dervied datatype)
 * reference variable type should be super class data type
 * call the generalize method and pass subclass object*/
public class Main2 {
	public static void race(Bike b) {
		b.start();
	}
	public static void main(String[] args) {
		System.out.println("output with help of generalized method case1 ");
		Main2 m2=new Main2();
		m2.race(new Herohonda());
		m2.race(new Duke());
		m2.race(new Bullet());
		
	}
}
