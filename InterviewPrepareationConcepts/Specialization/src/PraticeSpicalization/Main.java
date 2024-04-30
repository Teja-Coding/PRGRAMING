package PraticeSpicalization;

public class Main {
	public static void main(String[] args) {
		Main m=new Main();
		m.activity(new Student("manikata"));
		m.activity(new Student("teja"));
		m.activity(new Student("yuva"));
	}
	public  void activity(Student s) {
		s.read();
		s.write();
		s.test();
	}
}
