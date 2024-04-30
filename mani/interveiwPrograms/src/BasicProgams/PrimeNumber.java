package BasicProgams;

import java.util.Scanner;

public class PrimeNumber {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the number:");
			int n=sc.nextInt();
			int c=0;
			for(int i=1;i<=n;i++) {
				if(n%i==0) {
					c++;
				}
			}
			 if(c==1) {
				System.out.println("1 is neither prime nor composite");
			}
			 else if(c==2) {
				 System.out.println(n+" is a prime number");
			 }
			 else
				 System.out.println(n+" is not a prime number");
		}
}
