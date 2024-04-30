package DesignAstraction;
/*Steps to useing Abstration Program
 *1)know the interface
 *2)know the methods of interface
 *3)it is unaccessary to know the implementation class
 *4)it is uneccesary to know implementation method
 *5)know the helper class
 *6)know the helper method
 *7)call the helper method by using helper class
 *8)recive the object given by helper method in refernce veriable of interface
 *9)use the interface reference varibale and call interface method*/

public class UsingAbstraction{
	public static void main(String[] args) {
		A rv=Run.getOject();
		rv.walk();
	}
}
