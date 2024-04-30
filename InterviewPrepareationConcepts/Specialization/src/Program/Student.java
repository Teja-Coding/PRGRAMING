package Program;
/*process of developing a method which can handle
 * multiple objects of same type these method are 
 * called specialized method and the process is called
 * speciliztion*/

public class Student {
	public String sname;
	public Student(String sname) {
		this.sname=sname;
	}
	public void read() {
		System.out.println(sname+" read notes");
	}
	public void write() {
		System.out.println(sname+" writing the notes");
	}
	public void test() {
		System.out.println(sname+" take the test");
	}

}
