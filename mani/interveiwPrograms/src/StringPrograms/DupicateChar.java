package StringPrograms;

import java.util.Scanner;

public class DupicateChar {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string:");
		String input=sc.next();
		System.out.println("input:"+input);
		String outupt=removeDup(input);
		System.out.println("output mani"+outupt);
	}

	private static String removeDup(String input) {
		StringBuilder output=new StringBuilder();
		for(char ch:input.toCharArray()) {
			if(output.indexOf(String.valueOf(ch))<0)
				output.append(ch);
		}
				
		
		
		return output.toString();
	}

	
}