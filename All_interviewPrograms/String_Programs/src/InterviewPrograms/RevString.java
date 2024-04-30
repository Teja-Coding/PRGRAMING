package InterviewPrograms;

import java.util.Scanner;

/*reverse a given string */
public class RevString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string ");
		String s=sc.next();
		
		String rev="";
		
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		System.out.println("orginal string is "+s);
		System.out.println("reverse string "+rev);
	}
}
