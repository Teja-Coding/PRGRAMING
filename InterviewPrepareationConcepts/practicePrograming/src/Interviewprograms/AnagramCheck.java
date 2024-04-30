package Interviewprograms;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string1: ");
		String s1=sc.nextLine();
		
		System.out.println("enter the string2: ");
		String s2=sc.nextLine();
		
		s1=s1.replaceAll(" ","").toLowerCase();
		s2=s2.replaceAll(" ", "").toLowerCase();
		
		if(isAnagram(s1,s2)) {
			System.out.println("string "+s1+" and "+s2+" are Anagrams ");
		}
		else {
			System.out.println("string "+s1+" and "+s2+" are not Anagrams ");
		}
	}

	private static boolean isAnagram(String s1, String s2) {
		// TODO Auto-generated method stub
		if(s1.length()!=s2.length()) {
			return false;
		}
		else {
			char[] s1arr=s1.toCharArray();
			char[] s2arr=s2.toCharArray();
			Arrays.sort(s1arr);
			Arrays.sort(s2arr);
			return Arrays.equals(s1arr, s2arr);
		}
	
	
	}
}
