package patternProgramsPratice;

public class Num11to {
	public static void main(String[] args) {
		int a=11;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				System.out.print(" "+a+" ");
				a++;
			}
			System.out.println();
		}
		System.out.println("with string");
		alpha();
	}

	private static void alpha() {
		// TODO Auto-generated method stub
		char a='A';
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				System.out.print(" "+a+" ");
				a++;
			}
			System.out.println();
		}
	}
}
