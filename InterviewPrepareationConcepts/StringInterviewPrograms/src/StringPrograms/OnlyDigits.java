package StringPrograms;

import java.util.Scanner;

/*how to check if a string contains only digits*/
public class OnlyDigits {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string ");
		String s=sc.nextLine();
		
		boolean result=s.matches("[0-9]+");
		System.out.println("original string:"+s);
		System.out.println("does string catain only digits? "+result);
	}
}
