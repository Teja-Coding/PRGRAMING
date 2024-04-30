package Inheritance;

import java.util.Scanner;

/* 1)process of aquering properites from super class to subclass
 *   class is called "INHERITANCE"
 * 2)super class is also called as parent class or base class
 * 3)subclass is also called as child class or derived class
 * 4)Inheritance is acheived by using a keyword "extends"
 * 5)when subclass object is created 1st super class non static memebers 
 *   loaded,next sub class non static members loaded
 *   we have four types of inheritance
 *   a)single level inheritance
 *   b)multi level inheritance
 *   c)hirearchieal inheritance*/
public class SingleLevel {
	public static void main(String[] args) {
	
		B b=new B();
		b.play();
		b.eat();
		
	}
}