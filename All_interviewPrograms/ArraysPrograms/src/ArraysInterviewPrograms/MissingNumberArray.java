package ArraysInterviewPrograms;

public class MissingNumberArray {
	 public static void main(String[] args) throws InterruptedException {
		 int [] a= {1,2,3,5};
		 int n=a.length;
		 int sum=0;
		 for(int i=0;i<n;i++) {
			 sum=sum+a[i];
		 }
		 System.out.println("sum of the give array ="+sum);
		 
		 int sum1=0;
		 for(int i=1;i<=5;i++) {
			 sum1=sum1+i;
		 }
		 System.out.println("total sum of range="+sum1);
		 System.out.println("missing number is "+(sum1-sum));
		 
		 
	 }
}