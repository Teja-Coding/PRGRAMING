package AlphabetPatterns;
/*  A B C D E 
 *  F G H I G
 *  K L M N O
 *  P Q R S T
 *  U V W X Y              */
public class AtoY {
	public static void main(String[] args) {
		char a='A';
	for(int i=1;i<=5;i++) {
		for(int j=1;j<=5;j++) {
			System.out.print(" "+a+" ");
			a++;
		}
		System.out.println();
	}
}
}
