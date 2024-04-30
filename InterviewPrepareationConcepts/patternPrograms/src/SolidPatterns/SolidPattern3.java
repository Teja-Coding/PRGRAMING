package SolidPatterns;
/*  A A A A A
 * 	B B B B B
 *  C C C C C
 *  D D D D D
 *  E E E E E               */
public class SolidPattern3 {
		public static void main(String[] args) {
			int n=5;
			int alpha=65;
			for(int i=1;i<=n;i++) {
				for(int j=1;j<=n;j++) {
					System.out.print((char)alpha);
				}
				alpha++;
				System.out.println(" ");
			}
		}
}
