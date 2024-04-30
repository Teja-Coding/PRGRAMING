package GeneralisationPrograms;

public class Main3 {
	public void race(Bike b) {
		b.start();
	}
	public static void main(String[] args) {
		System.out.println("generalisation method case 2 process");
		Main3 m3 = new Main3();
		Herohonda h1=new Herohonda();
		Duke d1=new Duke();
		Bullet b1=new Bullet();
		
		m3.race(h1);
		m3.race(d1);
		m3.race(b1);
	}

}
