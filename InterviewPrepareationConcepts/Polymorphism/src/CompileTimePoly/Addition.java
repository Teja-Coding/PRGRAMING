package CompileTimePoly;
/*Compile time polymorphsism
 * call to overloaded method is decided based
 * on arguments. This is called compile time 
 * polymorphism
 * 2)In order to achieve compile time polymorphism we
 *   have to use method overloading*/
public class Addition {
	public static void add(int i ,double j) {
		System.out.println(i+j);
	}
	public static void add(int i,int j,int k) {
		System.out.println(i+j+k);
	}

}
