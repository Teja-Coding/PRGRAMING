package ArraysInterviewPrograms;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int[] a={1,9,5,4,6,5,7};
		
		System.out.println("array before sorting: "+Arrays.toString(a));
		
		int n=a.length;
		
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-1;j++) {
				if(a[j]> a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1] ;
					a[j+1]=temp;
				}
			}
		}
		System.out.println("array after sorting: "+Arrays.toString(a));
	}
}