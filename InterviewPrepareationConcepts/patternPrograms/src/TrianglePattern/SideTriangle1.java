package TrianglePattern;
/*  *
 *  * *
 *  * * *
 *  * * * *
 *  * * * * *
 *  * * * *  
 *  * * *
 *  * *
 *  *
                        */
public class SideTriangle1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int star=1;
		for(int i=1;i<=9;i++) {
			for(int j=1;j<=star;j++) {
				System.out.print("* ");
			}
			if(i<=4) {
				star++;
			}
			else {
				star--;
			}
			System.out.println();
		}
	}

}
