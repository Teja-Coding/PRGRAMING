package patternProgramsPratice;

public class Num1 {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				System.out.print(" "+i+" ");
			}
			System.out.println();
		}
		System.out.println("next one");
		num1();
		System.out.println("next Pattern");
		num2();
		System.out.println("final pattern");
		num3();
	}

	private static void num3() {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++) {
			for(int j=5;j>=1;j--) {
				System.out.print(" "+j+" ");
			}
			System.out.println();
		}
	}

	private static void num2() {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				System.out.print(" "+j+" ");
			}
			System.out.println();
		}
	}

	private static void num1() {
		// TODO Auto-generated method stub
		for(int i=5;i>=1;i--) {
			for(int j=1;j<=5;j++) {
				System.out.print(" "+i+" ");
			}
			System.out.println();
		}
	}
}
