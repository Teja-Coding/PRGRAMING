package ArraysInterviewPrograms;

public class HighestElementInArray {
	public static void main(String[] args) {
		int[]x= {55,65,85,45,25,65};
		int highest=x[0];
		for(int z:x) {
			if(z>highest) {
				highest=z;
			}
		}
		System.out.println("highest element is :"+highest);
		
		int low=x[0];
		for(int z:x) {
			if(z<low) {
				low=z;
			}
		}
		System.out.println("lowest element is: "+low );
	}
}
