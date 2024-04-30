package Interviewprograms;

import java.util.Scanner;

public class Lenght {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string: ");
		String s=sc.nextLine();
		int count=0;
		for(int i=0;i<=s.length()-1;i++) {
			count++;
		}
		System.out.println("lenght is: "+count);
	}
}
