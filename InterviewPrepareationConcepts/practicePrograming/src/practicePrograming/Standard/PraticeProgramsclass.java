package practicePrograming.Standard;

import java.util.Scanner;

public class PraticeProgramsclass {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(j==4&&i==3) {
					System.out.print("@");
				}
				else {
					System.out.println("*");
				}
			
			}
			System.out.println();
			
		}
	}
}