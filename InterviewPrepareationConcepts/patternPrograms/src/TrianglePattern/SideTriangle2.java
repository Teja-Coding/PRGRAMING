package TrianglePattern;

public class SideTriangle2 {
		public static void main(String[] args) {
			int space=4;
			int star=1;
			for(int i=1;i<=9;i++) {
				for(int j=1;j<=space;j++) {
					System.out.print(" ");
				}
				for(int s=1;s<=star;s++) {
					System.out.print("*");
				}
				if(i<=4) {
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
