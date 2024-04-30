package BasicProgams;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		int n=sc.nextInt();
		
		int temp=n;
		int r,sum=0;
		while(n>0) {
			r=n%10;
			n=n/10;
			sum=sum+r*r*r;
			
		}
		if(temp==sum) {
			System.out.println("it in an armstrong number");
		}
		else {
			System.out.println("not an armstrong number");
		}
	}
}
