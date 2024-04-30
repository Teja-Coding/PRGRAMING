package MethodAccessMethods;
/*Static method calling static method directly because 
 * both are in same static pool area
 * StaticMethods------->StaticMetheds
 * */
public class SmAccessSm {
	public static void main(String[] args) {
		System.out.println("deatials");
		name();
	}
	public static void name() {
		System.out.println("Hi my name is manikanta");
		age();
	}
	public static void age() {
		System.out.println("age is 24");
	}
	

}
