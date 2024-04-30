package patternProgramsPratice;

public class Triangle {
	public static void main(String[] args) {
		Triangle1();
		System.out.println();
		Triangle2();
		System.out.println();
		Triangle3();
		System.out.println();
		Triangle4();
		System.out.println("full triangle");
		fullTriangle();
		System.out.println("rev triangle");
		revTriangel();
	}

	private static void revTriangel() {
		// TODO Auto-generated method stub
		int star=9;
		int space=0;
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=space;j++) {
				System.out.print("   ");
			}
			for(int s=1;s<=star;s++) {
				System.out.print(" * ");
			}
			System.out.println();
			space++;
			star=star-2;
		}
	}

	private static void fullTriangle() {
		// TODO Auto-generated method stub
		int space=4;
		int star=1;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=space;j++) {
				System.out.print("   ");
			}
			for(int s=1;s<=star;s++) {
				System.out.print(" * ");
			}
			System.out.println();
			star=star+2;
			space--;
		}
	}

	private static void Triangle4() {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(i>=j) {
					System.out.print("* ");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
 
	private static void Triangle3() {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++) {
			for(int j=5;j>=1;j--) {
				if(i>=j) {
					System.out.print(" *");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

	private static void Triangle2() {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(i<=j) {
					System.out.print(" *");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

	private static void Triangle1() {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++) {
			for(int j=5;j>=1;j--) {
				if(i<=j) {
				System.out.print("* ");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
		
		
		
		
				
