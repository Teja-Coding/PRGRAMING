package TrianglePattern;

public class Butterfly {
	public static void main(String[] args) {
		int star=1;
		int space=8;
		
		for(int i=1;i<=9;i++) {
			for(int j=1;j<=star;j++) {
				System.out.print("*");
			}
			for(int a=1;a<=space;a++) {
				System.out.print(" ");
			}
			for(int b=1;b<=star;b++) {
				System.out.print("*");
			}
			if(i<=4) {
				star++;
				space=space-2;
			}
			else {
				star--;
				space=space+2;
			}
			System.out.println();
		}
	}
}
