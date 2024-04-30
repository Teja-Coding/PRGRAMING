package practicePrograming.Standard;

public class CountWords {
	public static void main(String[] args) {
		String s="enter the string";
		
		int count=count(s);
		System.out.println("no of words in a string "+count);
	}

	private static int count(String s) {
		int count=0;
		if(s.charAt(0)!=' ') {
			count++;
		}
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==' ' && s.charAt(i+1)!=' ') {
				count++;
			}
		}
		return count;
	}
}
