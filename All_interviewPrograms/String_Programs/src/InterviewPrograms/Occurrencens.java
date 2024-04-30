
package InterviewPrograms;

import java.util.Scanner;

/*write program count the total no of 
 * occurrences of a given character in 
 * string without using any loop*/
public class Occurrencens {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string: ");
		String s=sc.nextLine();
		String s1=sc.nextLine();
		
		 int count=s.length()-s.replace( s1, "").length();
		 System.out.println("number occurances of "+s1+" string is: "+count);
	}
}
