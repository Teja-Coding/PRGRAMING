package Program;
/*Steps to create specialized method:-
 * create a static or non static method
 * create arguments for the method
 * arguments should be referece variable type(derived data type)
 * reference variabel should be same class datatype
 * call the specialized method and pass the same class object*/


public class Main2 {
	public static void activity(Student s) {
		s.read();
		s.write();
		s.test();
	}
	public static void main(String[] args) {
		activity(new Student("manikanta"));
		System.out.println("---------------------------");
		activity(new Student("teja"));
		System.out.println("----------------------------");
		activity(new Student("pavan"));
	}
}
