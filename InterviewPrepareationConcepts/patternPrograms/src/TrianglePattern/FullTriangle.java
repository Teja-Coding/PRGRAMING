package TrianglePattern;
/*           *
 *         * * *
 *       * * * * *
 *     * * * * * * *
 *    * * * * * * * *     */
public class FullTriangle {
	public static void main(String[] args) {
		int space=4;
		int star=1;
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=space;j++) {
				System.out.print(" ");
			}
			for(int b=1;b<=star;b++) {
				System.out.print("*");
			}
			System.out.println();
			space--;
			star=star+2;
		}
	}
}
