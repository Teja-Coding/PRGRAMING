package GlobalVariables;
/*1)there  are 2 types of global variable 
 * a)Static variable
 * b)Non static variable
 * 2)Global variable area created inside the scope of the class
 * 3)Global variable syntax:-
 * AccessSpecifier AccessModifier dataType variabeName=data;
 *4)Global variable can be used in any method
 *5)Static variable is accessed through "DIRECTLY"
 *6)NonStatic variable is accessed through "OBJECT"
 *7)Intialization of global variable is not mandatory
 *8)If developer does not intialize global variable then complier will
 *initalize global variable to default value.
 * 
 * */
public class Global {
	public static int i=45;
	public int j=34;
	public static void main(String[] args) {
		System.out.println("accessing global variables");
		System.out.println(i);
		Global g=new Global();
		System.out.println(g.j);
	}
}
