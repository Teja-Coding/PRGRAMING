package InterviewPrograms;

import java.util.Scanner;

/*rev every words in string*/
public class RevWords {
 public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
		System.out.println("enter the string ");
		String s=sc.nextLine();
		
		String splitArray[]=s.split(" ");
		for(int i=splitArray.length-1;i>=0;i--) {
			System.out.print(splitArray[i]+" ");
		}
 }     
}