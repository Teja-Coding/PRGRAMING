package ArraysInterviewPrograms;

import java.util.Arrays;

public class RevArray {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6};
		
		int i=0;
		int j=a.length-1;
		int temp;
		
		while(i<j) {
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			i++;
			j--;
		}
		System.out.println(Arrays.toString(a));
		
	}
}
