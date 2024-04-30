package ArrayInterviewPrograms;

public class EvenOdd {
	public static void main(String[] args) {
		int x[]= {5,6,9,5,6,8,7,2};
		
		for(int value:x) {
			
			if(value%2==0) {
				
				System.out.println("even number are:"+value);
			}
		}
		for(int val:x) {
			
			if(val%2!=0) {
				
				System.out.println("odd numbers:"+val);
			}
		}
	}
}
