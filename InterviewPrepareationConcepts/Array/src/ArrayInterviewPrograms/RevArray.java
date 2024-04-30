package ArrayInterviewPrograms;

import java.util.Arrays;

public class RevArray {
	public static void main(String[] args) {
		int[]a= {65,75,25,65,95};
		int i=0,temp,j=a.length-1;
		
		while(i<j) {
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			
			i++;
			j--;
		}
		System.out.println(Arrays.toString(a)) ;
	}
}