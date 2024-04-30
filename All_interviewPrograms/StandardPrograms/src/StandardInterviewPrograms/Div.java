package StandardInterviewPrograms;

import java.util.Scanner;

public class Div {
	public static void main(String[] args) {
		odd();
		even();
	}
	public static void odd() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter in Interger");
		int n=sc.nextInt();
		if(n%2!=0) {
			System.out.println("odd");
		}
	}
		public static void even() {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter in Interger");
			int n2=sc.nextInt();
			if(n2%2==0) {
				System.out.println("even");
			}
	}
}