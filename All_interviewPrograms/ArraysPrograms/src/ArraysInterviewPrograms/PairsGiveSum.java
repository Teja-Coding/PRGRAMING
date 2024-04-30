package ArraysInterviewPrograms;

public class PairsGiveSum {
	public static void main(String[] args) {
		int[]a= {1,2,3,4,5,6,7};
		int sum=9;
		
		int low=0;
		int hight=a.length-1;
		
		while(low<hight) {
			if(a[low]+a[hight]>sum) {
				hight--;
			}
			else if(a[low]+a[hight]<sum) {
				low++;
			}
			else if(a[low]+a[hight]==sum) {
				System.err.print("pair("+a[low]+","+a[hight]+")");
				low++;
				hight--;			
			}
		}
	}
}