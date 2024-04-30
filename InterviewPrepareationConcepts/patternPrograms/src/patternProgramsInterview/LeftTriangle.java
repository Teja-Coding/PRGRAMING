package patternProgramsInterview;

public class LeftTriangle {
		public static void main(String[] args) {
			int star=1;
			int space=4;
			
			for(int a=1;a<=9;a++) {
				for(int i=1;i<=space;i++) {
					System.out.print(" ");
				}
				for(int i=1;i<=star;i++) {
					System.out.print("*");
				}
				if(a<=4) {
					star++;
					space--;
				}
				else {
					star--;
					space++;
				}
				System.out.println();
			}
			
		}
}
