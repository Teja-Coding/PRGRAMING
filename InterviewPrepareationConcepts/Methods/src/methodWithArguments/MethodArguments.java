package methodWithArguments;
/*1)Arguments are the part of the method signature
 * 2)Arguments are created inside()
 * 3)Arguments are nothing but variable declaration(dataType variableName)
 * 4)multiple arguments cab be created
 * 5)arguments are intialized when we call the method
 * Syntax for method with arguments:-
 * AccessSpeicfier AccessModifier void methodName(dataType argName){
 *    PERFORM OPERATION
 * }
 * 
 * */
public class MethodArguments {
		public static void main(String[] args) {
			Test(50, 90);
			MethodArguments ma=new MethodArguments();
			ma.Demo(800, 600);
			
		}
		public static void Test(int a ,int b){
			
			System.out.println(a+b);
		}
		public  void Demo(int a,int b) {
			System.out.println(a-b);
		}
}
  