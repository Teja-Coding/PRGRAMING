package SolidPatterns;
/*   A B C D E
 *   A B C D E
 *   A B C D E
 *   A B C D E
 *   A B C D E */
public class SolidPattern2 {
  public static void main(String[] args) {
	int n=5;
	for(int i=1;i<=n;i++) {
		int alpha=65;
		for(int j=1;j<=n;j++) {
			System.out.print((char)alpha);
			alpha++;
		}
		System.out.println(" ");
	}
}
}
