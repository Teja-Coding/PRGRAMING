package ArraysInterviewPrograms;

public class PairsOfsum {
	public static void main(String[] args) {
		int a[]= {1,5,7,-1,5};
		int sum=6;
		
		int low=0;
		int high=a.length-1;
		
		while(low<high) {
			if(a[low]+a[high]>sum) {
				high--;
			}
			else if(a[low]+a[high]<sum) {
				low++;
			}
			else if(a[low]+a[high]==sum) {
				System.out.println("pair("+a[low]+","+a[high]+")" );
				low++;
				high--;
			}
		}
	}
}
