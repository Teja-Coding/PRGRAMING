package Program;
/*in these program we have repeatative code */
public class Main1 {
	public static void main(String[] args) {
		Student s1=new Student("manikanta");
		
		s1.read();
		s1.write();
		s1.test();
		System.out.println("---------------------");
		Student s2=new Student("kiran");
		s2.read();
		s2.write();
		s2.test();
	}
}
