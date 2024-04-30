  package InterviewPrograms;

import java.util.Scanner;

public class PalindromeOrnot {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string ");
		String s=sc.nextLine();
		
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		if(rev.equals(s)) {
			System.out.println("is palindrom");
		}
		else {
			System.out.println("is not a palindram");
		}
	}
}
