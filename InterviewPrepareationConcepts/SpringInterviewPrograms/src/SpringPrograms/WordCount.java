package SpringPrograms;
/*write a program to count the noof words
 * in a string*/
import java.util.Scanner;

public class WordCount {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string: ");
		String s=sc.nextLine();
		
		int count=countNumOfWords(s);
		System.out.println("no of words in a string="+count);
	}

	private static int countNumOfWords(String s) {
		// TODO Auto-generated method stub
		int count=0;
		if(s.charAt(0)!=' ') {
			count++;
		}
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==' '&&s.charAt(i+1)!=' ') {
				count++;
			}
		}
		return count;
	}
}
