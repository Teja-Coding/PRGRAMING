package ArrayInterviewPrograms;

public class Highest {
	public static void main(String[] args) {
		int[]x= {20,85,95,62,75,100};
		
		int highest=x[0];
		
		for(int z:x) {
			if(z>highest) {
				highest=z;
			}
		}
		System.out.println("highest element is: "+highest);
	}
}
