package ArrayInterview;
//how to print even and odd from given array
public class EvenOddArray {
	public static void main(String[] args) {
		int a[]= {1,4,6,4,7,4,5};
		System.out.println("even number in given array");
		for(int value:a) {
			if(value%2==0) {
				System.out.println(value);
			}
		}
		System.out.println();
		System.out.println("odd number in given array");
		for(int value:a) {
			if(value%2!=0) {
				System.out.println(value);
			}
		}
	}
}
			
		