package ArraysInterviewPrograms;

public class MissingNumInArray {
	public static void main(String[] args) {
		int[] input= {2,8,6,7,9,44,8,100};
		int[] copy=new int[101];
		
		for(int iter:input) {
			copy[iter]=1;
		}
		for(int i=1;i<copy.length;i++) {
			if(copy[i]==0) {
				System.out.println(i+" ");
			}
		}
	}
}
  