package SpringPrograms;

import java.util.Scanner;

/*write a program to count the total no of occurences of a 
 * given character in a string without using any loop*/
public class Occurences {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the string:" );
		String s=sc.nextLine();
		String s1=sc.nextLine();
		//total lenght - total length after removing
		int count=s.length()-s.replace(s1,"").length();
		System.out.println("number occurances of "+s1+" string is: "+count);
		
	}
}
