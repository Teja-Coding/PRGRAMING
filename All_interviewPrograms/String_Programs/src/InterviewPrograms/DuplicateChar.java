package InterviewPrograms;
/*wap to print duplicate characters from string*/
import java.util.Scanner;

public class DuplicateChar {
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
			System.out.println(ch+" is presented "+count+" times");
			}
		}
	}
}
