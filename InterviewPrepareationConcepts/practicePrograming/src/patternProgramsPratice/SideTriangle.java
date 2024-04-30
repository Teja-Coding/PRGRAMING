package patternProgramsPratice;

public class SideTriangle {
	public static void main(String[] args) {
		int star=1;
		for(int i=1;i<=9;i++) {
			for(int j=1;j<=star;j++) {
				System.out.print(" * ");
			}
			if(i<=4) {
				star++;
			}
			else {
				star--;
			}
			System.out.println();
		}
		sideTriangle2();
	}

	private static void sideTriangle2() {
		// TODO Auto-generated method stub
		int space=4;
		int star=1;
		for(int i=1;i<=9;i++) {
			for(int j=1;j<=space;j++) {
				System.out.print("   ");
	}
			for(int s=1;s<=star;s++) {
				System.out.print(" * ");
			}
			if(i<=4) {
				space--;
				star++;
			}
			else {
				space++;
				star--;
			}
			System.out.println();
		}
	}
	
}
