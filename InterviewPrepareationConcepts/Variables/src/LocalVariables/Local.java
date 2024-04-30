package LocalVariables;
/*There are two types of variables
 * a)local variables
 * b)global variables
 * LOCAL VARIABLES:-
 * If variables are created inside the scope of the method these variables are called LOCAL VARIABLES
 * local variables can be used only with the same method
 * local variables cannot be access by other method
 * local variables must be initialized before using
 * error will get if we not instial a variables*/
public class Local {
	public static void main(String[] args) {
		int a=10;
		int b=20;
		System.out.println("add to local variables ");
		System.out.println(a+b);
	}
}
