package ArrayInterviewPrograms;

import java.util.Scanner;

public class PresentElements {
	public static void main(String[] args) {
		int[]x= {38,65,96,85,75,45,85};
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the number: ");
		int num=sc.nextInt();
		
		
		int count=0;
		for(int i:x) {
			
			if(num==i) {
				count++;
			}
		}
		if(count>0) {
			System.out.println(num+" element is present");
		}
		else {
			System.out.println(num+" given number is not present");
		}
	}
}
