package ArrayInterviewPrograms;

import java.util.Arrays;

public class SortArray {
	public static void main(String[] args) {
		int arr[]= {1,8,6,9,4,5,8};
		
		Arrays.sort(arr);
		
		for(int i=0;i<=arr.length-1;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
