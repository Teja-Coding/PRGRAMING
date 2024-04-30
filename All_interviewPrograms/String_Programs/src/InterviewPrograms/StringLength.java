package InterviewPrograms;

import java.util.Scanner;

/*length of string */
public class StringLength {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string ");
		String s=sc.next();
		
		int count=0;
		for(int i=0;i<=s.length()-1;i++) {
			count++;
		}
		System.out.println("length of the string is "+count);
	}
}
