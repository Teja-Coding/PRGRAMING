package practicePrograming.Standard;

public class RevWords {
	public static void main(String[] args) {
		String s="hi all how are and iam good";
		
		String[]s1=s.split(" ");
		for(int i=s1.length-1;i>=0;i--) {
			System.out.print(s1[i]+" ");
		}
	}
}
