package StringPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string1: ");
		String s1=sc.nextLine();
		
		String s2=sc.nextLine();
		
		System.out.println("both strings are anagram "+anagram(s1,s2));
	}

	private static boolean anagram(String s1, String s2) {
		// TODO Auto-generated method stub
		char[] charArray1=s1.toCharArray();
		char[] charArray2=s2.toCharArray();
		
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		return Arrays.equals(charArray1, charArray2);
	}
}
