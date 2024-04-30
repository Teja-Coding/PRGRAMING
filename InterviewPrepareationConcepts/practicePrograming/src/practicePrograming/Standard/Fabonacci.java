package practicePrograming.Standard;

import java.util.Scanner;

public class Fabonacci {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the number ");
		int n=sc.nextInt();
		int firstTerm=0,secoundTerm=1;
		
		for(int i=0;i<=n;++i) {
			int nextTerm=firstTerm+secoundTerm;
			firstTerm=secoundTerm;
			secoundTerm=nextTerm;
			
			System.out.print(nextTerm+" ");
		}
	}
}
