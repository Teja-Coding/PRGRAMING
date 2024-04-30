package NonStaticMethods;
/*non static method cannot be called directly rather 
 * we must create an object and call the non static method
 * Syntax for creating object:-
 * className objectName = new className();
 * 
 * Systax for calling nonStaticMethods:-
 * objectName.methodName();
 * */
public class nonStaticMethod {
	public static void main(String[] args) {
		nonStaticMethod nsm=new nonStaticMethod();
		nsm.addNum();
		nsm.subNum();
	}
	public void addNum() {
		int a=10; int b = 30;
		System.out.println(a+b);
	}
	public void subNum() {
		int a=100; int b=90;
		System.out.println(a-b);
	}

}
/*Always excution starts from main mehtod
 * we can compile the program with or without main mathod
 * we cannot excute the program without main method*/
