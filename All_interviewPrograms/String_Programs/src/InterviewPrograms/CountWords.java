package InterviewPrograms;

import java.util.Scanner;

/*count the words in a string*/
public class CountWords {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string ");
		String s=sc.nextLine();
		
		int count=wordsCount(s);
		System.out.println("total words presented is "+count);
	
	}

	private static int wordsCount(String s) {
		int count=0;
		if(s.charAt(0)!=' '){
			count++;
		}
		for(int i=0;i<s.length()-1;i++) {
			if(s.charAt(i)==' ' && s.charAt(i+1)!=' ') {
				count++;
			}
		}
		return count;
	}
}
