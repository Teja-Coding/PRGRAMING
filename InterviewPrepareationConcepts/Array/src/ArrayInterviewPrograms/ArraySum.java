package ArrayInterviewPrograms;

public class ArraySum {
	public static void main(String[] args) {
		int[]x= {10,50,96,85,72,50};
		
		int sum=0;
		
		for(int i=0;i<=x.length-1;i++) {
			sum=sum+x[i];
		}
		System.out.println("sum of the element is: "+sum);
	}
}
