package ArraysInterviewPrograms;

public class SumOfArray {
	public static void main(String[] args) {
		int[]x= {10,50,60,85,45,85};
		 int sum=0;
		 
		 for(int i=0;i<=x.length-1;i++) {
			 sum=sum+x[i];
		 }
		 System.out.println("sum of array is "+sum);
	}
}
