package ArrayInterview;
//how to find the missing numbers in integer array of 1 to 100//
public class MissNumbers {
	public static void main(String[] args) {
		int[]arr= {1,6,8,9,20};
		int sum1=0;
	    int sum2=0;
	    for(int i=0;i<arr.length;i++) {
	    	sum1=sum1+arr[i];
	    }
	    System.out.println("sum of elements in array: "+sum1);
	    for(int i=1;i<=20;i++) {
	    	sum2=sum2+i;
	    }
	    System.out.println("sum of range of element: "+sum2);
	    System.out.println("missing number is: "+(sum2-sum1));
	}
}
	