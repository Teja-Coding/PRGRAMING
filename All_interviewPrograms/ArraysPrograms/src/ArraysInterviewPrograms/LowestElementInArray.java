  package ArraysInterviewPrograms;

public class LowestElementInArray {
	public static void main(String[] args) {
		int[]x= {54,85,65,45,25,65};
		int lowest=x[0];
		
		for(int z:x) {
			if(z<lowest) {
				lowest=z;
			}
		}
		System.out.println("lowest elements are "+lowest);
		
	}
}
