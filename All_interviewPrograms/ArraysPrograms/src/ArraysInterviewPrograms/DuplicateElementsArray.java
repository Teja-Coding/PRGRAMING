  package ArraysInterviewPrograms;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElementsArray {
	public static void main(String[] args) {
		int arr[]= {5,4,2,1,7,7,5};
		
		
		Set<Integer>uniqueNumber=new HashSet<>();
		boolean isDuplicate=false;
		for(int i=0;i<arr.length;i++) {
			if(uniqueNumber.contains(arr[i])) {
				isDuplicate=true;
				
				System.out.println("duplicate elements "+arr[i]);
			}
			else {
				uniqueNumber.add(arr[i]);
			}
		}
		if(!isDuplicate) {
			System.out.println("no duplicates presented");
		}
	}
}
