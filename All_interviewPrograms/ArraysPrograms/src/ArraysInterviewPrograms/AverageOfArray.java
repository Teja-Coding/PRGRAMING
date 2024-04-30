package ArraysInterviewPrograms;

public class AverageOfArray {
	public static void main(String[] args) {
		int[]x= {10,65,95,45,85};
		
		int sum=0;
		for(int i=0;i<=x.length-1;i++) {
			sum=sum+x[i]/x.length;
		}
		System.out.println("average of the elements "+sum);
	}
}
