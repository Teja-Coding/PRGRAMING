package ArraysInterviewPrograms;

import java.util.Arrays;

public class SortElements {
	public static void main(String[] args) {
		int array[]={1,4,2,5,8};
		Arrays.sort(array);
		
		for(int i=0;i<=array.length-1;i++) {
			System.out.print(array[i]+" ");
		}
	}
}
