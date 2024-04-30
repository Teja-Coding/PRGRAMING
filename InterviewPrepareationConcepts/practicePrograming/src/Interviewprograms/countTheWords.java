package Interviewprograms;

import java.util.Scanner;

public class countTheWords {
	public static void main(String[] args) {
		Scanner sc=new Scanner( System.in);
		System.out.println("enter the string:");
		String s=sc.nextLine();
		
		int count=countNoOfwords(s);
		System.out.println("noof words in string="+count);
	}

	private static int countNoOfwords(String s) {
		// TODO Auto-generated method stub
		int count=0;
		if(s.charAt(0)!=' ') {
			count++;
		}
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==' '&&s.charAt(i+1)!=' ') {
				count++;
			}
		}
		return count;
	}
}
