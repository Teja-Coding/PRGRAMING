package InterviewPrograms;

import java.util.Scanner;

/*print those alphabets which are not present
 * in out given string*/
public class NotPresentAlpha {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string ");
		String s=sc.next();
		
		for(char ch='a';ch<='z';ch++) {
			int count=0;
			for(int i=0;i<=s.length()-1;i++) {
				if(ch==s.charAt(i)) {
					count++;
				}
			}
			if(count==0) {
				System.out.print(ch );
			}
		}
	}
}
  //not working