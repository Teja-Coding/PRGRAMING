package SpringPrograms;

import java.util.Scanner;

/*wap to revers a string*/
public class ReverseString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string: ");
		String s=sc.nextLine();
		String rev="";
		
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		System.out.println("before reverse "+s);
		System.out.println("after reverse "+rev);
	}
}
