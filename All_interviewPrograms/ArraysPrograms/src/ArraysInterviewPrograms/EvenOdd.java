package ArraysInterviewPrograms;

public class EvenOdd {
	public static void main(String[] args) {
		int a[]= {1,5,4,6,8,9,2};
		
		System.out.println("even number");
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				System.out.println(a[i]);
			}
		}
		System.out.println("odd numbers");
		for(int i=0;i<a.length;i++) {
			if(a[i]%2!=0) {
				System.out.println(a[i]);
			}
		}
	}
}
