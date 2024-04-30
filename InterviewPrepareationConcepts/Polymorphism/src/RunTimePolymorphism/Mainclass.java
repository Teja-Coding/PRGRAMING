package RunTimePolymorphism;
/*Polymorphism:-
 * single entity having multiple forms is called
 * polymorphism
 * 
 * There are two types
 * 1)run time polymorphism
 * 2)compile time polymorphism*/
public class Mainclass {
	/*run time polymorphism*/
	public static void sound(Animal A) {
		A.noise();
	}
	public static void main(String[] args) {
		sound(new Loin());
		sound(new Tiger());
		sound(new Cheetah());
	}
	
}
