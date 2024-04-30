package patternProgramsPratice;

public class StringPatterns {
	public static void main(String[] args) {
		for(char ch='A';ch<='E';ch++) {
			for(char j='A';j<='E';j++) {
				System.out.print(" "+ch+" ");
			}
			System.out.println();
		}
		System.out.println("string patterns 1");
		string1();
		System.out.println("string patterns 2");
		string2();
		System.out.println("string patterns 3 ");
		string3();
	}


	private static void string3() {
		// TODO Auto-generated method stub
		for(char ch='A';ch<='E';ch++) {
			for(char j='E';j>='A';j--) {
				System.out.print(" "+j+" ");
			}
			System.out.println();
	}
	}


	private static void string2() {
		// TODO Auto-generated method stub
		for(char ch='A';ch<='E';ch++) {
			for(char j='A';j<='E';j++) {
				System.out.print(" "+j+" ");
			}
			System.out.println();
		}
	}


	private static void string1() {
		// TODO Auto-generated method stub
		for(char ch='E';ch>='A';ch--) {
			for(char j='A';j<='E';j++) {
				System.out.print(" "+ch+" ");
			}
			System.out.println();
		}
	}
}
