package WhyIneritance;
/*inheritance will help us to avoid code repeatation
 * and impliments code reuseability 
 * in case their is code change we need not change the code
 * multiple times rather we have to change the code 1 time 
 * in superclass will automatically update to all the subclass*/
public class Main {
	public static void main(String[] args) {
		Cirecle c1=new Cirecle();
		Rectangle r1=new Rectangle();
		Triangle t1=new Triangle();
		
		c1.rotate();
		r1.rotate();
		t1.rotate();
	}
}
