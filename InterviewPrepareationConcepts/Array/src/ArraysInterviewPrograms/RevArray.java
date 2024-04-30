package ArraysInterviewPrograms;

public class RevArray {
	public static void main(String[] args) {
		int[]x= {43,64,34,56,54};
		int[]rev=new int[x.length];
		
		for(int i=x.length-1;i>0;i--) {
			rev[i]=x[i];
			System.out.print(rev[i]+" ");
		}
	}
}
