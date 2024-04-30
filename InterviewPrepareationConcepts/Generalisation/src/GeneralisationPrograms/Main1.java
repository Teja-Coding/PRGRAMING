package GeneralisationPrograms;
/*Generalisation:-
 * process of developing a method which can handle multiple
 * object of different type these methods are called generalise
 * method and the process is called generalisation*/
public class Main1 {
	public static void main(String[] args) {
		
		//in these program we have code repeatative code 
		//with help of generlisation we can avoid code
		//repeatative
		System.out.println("main starts");
		Herohonda h1=new Herohonda();
		Duke d1=new Duke();
		Bullet b1=new Bullet();
		
		h1.start();
		d1.start();
		b1.start();
	}
}
