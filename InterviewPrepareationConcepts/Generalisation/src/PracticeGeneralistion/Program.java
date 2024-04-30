package PracticeGeneralistion;

public class Program {
	public static void main(String[] args) {
		Program p1=new Program();
		p1.race(new Hero());
		p1.race(new duke());
		p1.race(new Bullet());
	}
	public void race(Bike b) {
		b.start();
	}
}