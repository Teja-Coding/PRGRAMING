package practicePrograming.Standard;

import java.util.Iterator;
import java.util.Scanner;

public class Duplicate {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the div num: ");
		String s=sc.next();
		
		for(char ch='a';ch<='z';ch++) {
			int count=0;
			for(int i=0;i<=s.length()-1;i++) {
				if(ch==s.charAt(i)) {
					count++;
				}
			}
			if(count>1) {
				System.out.println(ch+" is present "+ count+" times");
			}
		}
		
	}
}
