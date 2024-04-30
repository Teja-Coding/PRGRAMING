package StaticMethods;
/*1)methods are used for performing operation
 *2)along with the main method we can create our own method
 *3)inorder to execute the method it must me called
 *4)syntax of method:-
 *Access specifer access modifier void methodname(){
 *
 *}
 *there are 2 types of methods a)static method and non static method
 *
 *a)static method 
 *1)static mehtod can be call directly 
 *2)syntex of calling static method is:-
 *  methodName();
 *
 * */
public class CreateStaticMethod {
		public static void main(String[] args) {
			addNum(); subNum();
			
		}
		public static void addNum() {
			int a=20,b=60;
			System.out.println(a+b);
		}
		public static void subNum() {
			int a=20,b=60;
			System.out.println(a-b);
		}
}
