package SingleLevelAbstract;
/*1)Method has 2 parts
 *   a)Method signature
 *   b)Method Implimentation
 *2)There are two types of method
 *   a)Complete method/Concrete method
 *   b)Incomplete method/Abstract method
 *3)Method which has method signature as well as method implimentation is 
 *called complete method
 *4)Method which has only method signature without method implimentation is 
 *called incomplete method
 *5)STEPS TO CREATE ABSTRACT METHOD:-
 *  A)maintain only method signature
 *  B)end with semicolumn
 *  C)begain the method wiht abstract keyword
 *  D)if class contains abstract method, entire class
 *    is abstract class
 *    
 *6)STEPS TO USE ABSTRACT METHOD:-
 *  A)inherit the abstract method to subclass
 *  B)Complete the method by providing method implimenitation
 *  NOTE:-Abstract Methods are used after method overiding*/

public class SingleAbstract {
	public static void main(String[] args) {
		B b1=new B();
		b1.lion();
		b1.tiger();
	}
}
