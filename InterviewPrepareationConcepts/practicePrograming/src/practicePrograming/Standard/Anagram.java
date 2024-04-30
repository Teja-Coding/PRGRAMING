package practicePrograming.Standard;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string 1: ");
		String str1=sc.nextLine();
		
		System.out.println("enter the String2: ");
		String str2=sc.next();
		System.out.println("both string are Anagrams "+ check(str1,str2));
		
	}
		//create method and method is return type boolean
	private static boolean check(String str1, String str2) {
		
		
		//convert strings to toCharArray();
		char[] charArray1=str1.toCharArray();
		char[] charArray2=str2.toCharArray();
		
		
		//sort the both the arrays 
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		
		//and return both the string are equal or not 
		return Arrays.equals(charArray1, charArray2);
	}
}

