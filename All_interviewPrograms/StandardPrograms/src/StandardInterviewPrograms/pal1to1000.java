package StandardInterviewPrograms;

public class pal1to1000 {
	public static void main(String[] args) {
		for(int num=1;num<=1000;num++) {
			int ld=0;
			int rev=0;
			int temp=num;
			while(num!=0) {
				ld=num%10;
				rev=rev*10+ld;
				num=num/10;
			}
			if(rev==num) {
				System.out.println(rev+" is a pal numbers");
			}
		}
	}
}
