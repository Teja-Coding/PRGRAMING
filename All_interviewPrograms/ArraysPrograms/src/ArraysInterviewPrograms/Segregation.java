package ArraysInterviewPrograms;

import java.util.Arrays;
import java.util.LinkedList;

public class Segregation {
	public static void main(String[] args) {
		int[]a= {1,2,1,2,1,2,1,2};
		
		LinkedList ll=new LinkedList<>();
		
		for(int i=0;i<a.length;i++) {
			if(a[i]==1) {
				ll.addFirst(a[i]);
			}
			else {
				ll.addLast(a[i]);
			}
		}
		System.out.println(ll);
	}
}