package AlphabetPatterns;
/* A B C D E
 *  A B C D
 *   A B C
 *    A B
 *      A*/
public class AlphabetPattern4 {
	public static void main(String[] args) {
		int n=5;
		for(int i=n;i>=1;i--) {
			int alpha=65;
			
			for(int j=1;j<=n;j++) {
				if(j<=n-i) {
					System.out.print(" ");
				}
				else {
					System.out.print((char)alpha);
					alpha++;
				}
			}
			System.out.println(" ");
		}
	}
}
