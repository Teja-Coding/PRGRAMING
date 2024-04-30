package ArratPrograms;
/*single dimensional primitive array with new keyword*/
public class Primitive {
   public static void main(String[] args) {
	int[]x=new int[5];
	
	x[0]=10;
	x[1]=20;
	x[2]=40;
	x[3]=80;
	x[4]=90;
	System.out.println("my elements in array are");
	
	for(int i:x) {
		System.out.print(" "+i);
	}
}
}
