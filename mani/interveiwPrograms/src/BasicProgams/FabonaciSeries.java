package BasicProgams;

import java.util.Scanner;

public class FabonaciSeries {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		int n=sc.nextInt();
		int firstTerm=0,SecoundTerm=1;
		System.out.println("fibonacci series till "+n+" terms");
		for(int i=1;i<=n;++i) {
			int nextTerm=firstTerm+SecoundTerm;
			firstTerm=SecoundTerm;
			SecoundTerm=nextTerm;
			System.out.print(nextTerm+" ");
		}
	}
}
