package HirearchiealInheritance;
/*Hirearchieal inheritance means when super class
 * contains multiple sub class*/
public class Hirearchieal {
	public static void main(String[] args) {
		Son1 s1=new Son1();
		s1.house();
		s1.FatherHouse1();
		
		Son2 s2=new Son2();
		s2.house();
		s2.houseFather();
	}
}
