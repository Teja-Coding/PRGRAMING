package InterviewPrograms;


import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string1 ");
		String s1=sc.nextLine();
		System.out.println("enter the string 2 ");
		String s2=sc.nextLine();
		
		s1=s1.replaceAll(" ", "").toLowerCase();
		s2=s2.replaceAll(" ", "").toLowerCase();
		
		if(isAnagram(s1, s2)) {
			System.out.println("String: "+s1+" and "+s2+" are anagrams");
		}
		else {
			System.out.println("String: "+s1+" and"+s2+" are not anagrams");
		}
	}
	public static boolean isAnagram(String s1,String s2) {
		
		if(s1.length()!=s2.length())
		return false;
		else {
			char[] str1Array=s1.toCharArray();
			char[] str2Array=s2.toCharArray();
			
			Arrays.sort(str1Array);
			Arrays.sort(str2Array);
			return Arrays.equals(str1Array,str2Array );
		}
		
		
	}
}
