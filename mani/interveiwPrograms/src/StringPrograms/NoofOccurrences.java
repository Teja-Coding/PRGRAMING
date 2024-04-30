package StringPrograms;

public class NoofOccurrences {
	public static void main(String[] args) {
		String s="hi all how are yoou";
		int count=s.length()-s.replace("o", "").length();
		System.out.println("number of occurence of a is:"+count);
	}
}
