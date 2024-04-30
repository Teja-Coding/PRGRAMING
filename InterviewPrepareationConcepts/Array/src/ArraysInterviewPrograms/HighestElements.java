package ArraysInterviewPrograms;

public class HighestElements {
	public static void main(String[] args) {
		lowest();
		int[]x= {10,85,65,45,95,85};
		
		int highest=x[0];
		for(int z:x) {
			if(z>highest) {
				highest=z;
			}
		}
		System.out.println("highest element is: "+highest);
	}

	private static void lowest() {
		// TODO Auto-generated method stub
		int []x= {10,55,65,95,85};
		int lowest=x[0];
		for(int z:x) {
			if(z<lowest) {
				lowest=z;
			}
		}
		System.out.println("lowest element is");
	}

}
