package SpringPrograms;

import java.util.Scanner;

/*write a program each word of a given string*/
public class ReverseEachWord {
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
