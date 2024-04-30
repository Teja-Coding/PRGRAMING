package Pratice;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the string:");
		String s=sc.nextLine();
		
		for(char ch='a';ch<='z';ch++) {
			int count=0;
			for(int i=0;i<=s.length()-1;i++) {
				if(ch==s.charAt(i)) {
				count++;
				}
			}
			if(count==1) {
				System.out.println(ch+" is presented "+count+" times");
			}
		}
	}
}