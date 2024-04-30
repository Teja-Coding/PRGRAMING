package SpringPrograms;

import java.util.Scanner;

/*to check the string is a palindrome or not*/
public class Palindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string: ");
		String s=sc.nextLine();
		String rev="";
		
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		if(rev.equals(s)) {
			System.out.println(s+" is a palindrome");
		}
		else {
			System.out.println(s+" is not palindrome");
		}
	}
}