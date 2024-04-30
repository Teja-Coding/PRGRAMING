package StringPrograms;

import java.util.Scanner;

/*print the length of a given stirng without print length
 * method
 *  */
public class LengthOfString {
	 public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the string: ");
		String s=sc.nextLine();
		int count=0;
		
		for(int i=0;i<=s.length()-1;i++) {
			count++;
		}
		System.out.println("length is: "+count);
	 }
}
