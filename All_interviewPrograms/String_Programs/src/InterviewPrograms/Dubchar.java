package InterviewPrograms;

import java.util.Scanner;

public class Dubchar {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string ");
		String sn=sc.next();
		
		String str=new String(sn);
		
		int count=0;
		char[] ch=str.toCharArray();
		
		for(int i=0;i<=ch.length-1;i++) {
			for(int j=i+1;j<ch.length-1;j++) {
				if(ch[i]==ch[j]) {
					System.out.println("duplicate characters presented in string "+ch[j]);
					count++;
				}
			}
		}
		System.out.println("dulicate characters count "+count);
	}
}
