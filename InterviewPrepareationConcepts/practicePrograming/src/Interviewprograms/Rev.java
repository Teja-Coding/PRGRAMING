package Interviewprograms;

import java.util.Scanner;

public class Rev {
	public static void main(String[] args) {
		Scanner sc=new 
				Scanner(System.in);
		System.out.println("enter the string: ");
		String s=sc.nextLine();
		
		String rev="";
		
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
			System.out.println(s);
			System.out.println(rev);
	}
}
