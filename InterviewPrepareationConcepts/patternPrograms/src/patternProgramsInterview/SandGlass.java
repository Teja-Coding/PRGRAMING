package patternProgramsInterview;

public class SandGlass {
		public static void main(String[] args) {
			int star=9;
			int space=0;
			for(int a=1;a<=9;a++) {
				for(int i=1;i<=space;i++) {
					System.out.print(" ");
				}
				for(int j=1;j<=star;j++) {
					System.out.print("*");
				}
				if(a<=4) {
					star=star-2;
					space++;
				}
				else {
					star=star+2;
					space--;
				}
				System.out.println();
			}
		}
}
