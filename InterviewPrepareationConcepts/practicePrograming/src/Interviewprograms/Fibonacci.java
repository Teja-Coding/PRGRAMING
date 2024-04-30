package Interviewprograms;

public class Fibonacci {
	public static void main(String[] args) {
		int n=10;
		int firstTerm=0;
		int SecTerm=1;
		
		System.out.println("fibonacci series still "+n+" terms: ");
		for(int i=0;i<=n;++i) {
			int nextTerm=firstTerm+SecTerm;
			firstTerm=SecTerm;
			SecTerm=nextTerm;
			System.out.println(nextTerm);
		}
	}
}
