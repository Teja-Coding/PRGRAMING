package FriendsPatters;
/*   * * * * * *
 *   * * * * # * 
 *   * @ * * * *
 *   * * * * * *       */
public class Star2 {
	public static void main(String[] args) {
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=6;j++) {
				if(i==2 && j==5 ) {
					System.out.print("# ");
				}
				else if(i==3 && j==2) {
					System.out.print("@ ");
				}
				else
				{
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}
}
