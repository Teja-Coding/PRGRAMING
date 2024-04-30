package ArrayInterviewPrograms;

public class Lowest {
	public static void main(String[] args) {
		int[]x= {55,95,85,45,85,75,22};
		
		int lowest=x[0];
		
		for(int z:x) {
			if(z<lowest) {
				lowest=z;
			}
		}
		System.out.println("lowest element is: "+lowest);
	}
}
