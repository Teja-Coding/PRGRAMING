package AlphabetPatterns;
/*  A 
 *  A B
 *  A B C
 *  A B C D
 *  A B C D E*/
public class AlphabetPattern1 {
	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++) {
			int alpha=65;
			for(int j=1;j<=i;j++) {
				System.out.print((char)alpha+" ");
				alpha++;
			}
			System.out.println(" ");
		}
	}
}
