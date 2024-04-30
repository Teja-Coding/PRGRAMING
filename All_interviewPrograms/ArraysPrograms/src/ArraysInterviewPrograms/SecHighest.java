package ArraysInterviewPrograms;

import java.util.Arrays;

public class SecHighest {
	public static void main(String[] args) {
		int []a= {1,3,7,9,5};
		
		Arrays.sort(a);
		System.out.println("secound highest "+a[a.length-2]);
	}
}
