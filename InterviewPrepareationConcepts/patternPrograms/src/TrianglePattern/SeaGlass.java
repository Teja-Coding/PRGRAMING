package TrianglePattern;

public class SeaGlass {
	public static void main(String[] args) {
		int star=9;
		int space=0;
		for(int i=1;i<=9;i++) {
			for(int j=1;j<=space;j++) {
				System.out.print(" ");
			}
			for(int s=1;s<=star;s++) {
				System.out.print("*");
			}
			if(i<=4) {
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
