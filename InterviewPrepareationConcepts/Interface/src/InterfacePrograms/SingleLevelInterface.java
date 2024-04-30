package InterfacePrograms;
/*1)interface is one of the type "definition block"
 * 2)interface does not allow complete method
 * 3)interface allows only in complete method
 * 4)within interface all the methods are by default
 * "public" and "abstract"
 * 5)inorder to use methods of interface it must be "implemented"
 * 6)methods of interface is "impilmented" in "implementation class"
 * 7)class "implements" interface*/
public class SingleLevelInterface {
	public static void main(String[] args) {
		ImplementClass imp=new ImplementClass();
		imp.test1();
		imp.test2();
	}
}
