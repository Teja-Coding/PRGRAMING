package DesignAstraction;
/*Abstraction:-
 * process of hidding method implementation details and 
 * providing access only two method signature
 * is call "abstration"
 * in simple terms hidding unacessary details and providing
 * providing access only to naccessary details is called Abstraction
 * Abstraction is achived by using either interface or abstract class
 * 
 * Steps to design Abstraction program
 * 1)create an interface
 * 2)create method in interface
 * 3)create implementation class
 * 4)create an implementation method
 * 5)create helper class
 * 6)create an helper method(static or non static)
 * 7)helper method will create an object of implementation
 * 	 class and upcast the oject to interface and return the object*/
public interface A {
	void walk();

}
