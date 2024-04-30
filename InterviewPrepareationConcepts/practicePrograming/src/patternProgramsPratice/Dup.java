package patternProgramsPratice;

public class Dup {
	public static void main(String[] args) {
		String s1=new String("hello");
		char[]charArray=s1.toCharArray();
		int count=0;
		
		for(int i=0;i<=charArray.length;i++) {
			for(int j=i+1;j<charArray.length;j++) {
				if(charArray[i]==charArray[j]) {
					System.out.println("dub are "+charArray[j]);
					count++;
				}
			}
			
		}
		System.out.println("it present "+count);
	}
}
	