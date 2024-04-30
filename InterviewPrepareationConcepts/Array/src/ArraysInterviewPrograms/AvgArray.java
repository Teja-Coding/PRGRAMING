package ArraysInterviewPrograms;

public class AvgArray {
	public static void main(String[] args) {
		int[]x= {50,62,85,95,15,45,65};
		int sum=0;
		
		for(int i=0;i<=x.length-1;i++) {
			sum=sum+x[i]/x.length;
		}
		System.out.println("avg of the element is "+ sum);
	}
}
