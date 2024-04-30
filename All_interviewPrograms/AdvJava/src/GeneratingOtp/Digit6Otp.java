package GeneratingOtp;

import java.util.Random;
import java.util.Scanner;

public class Digit6Otp {
	public static void main(String[] args) {
		Random r1=new Random();
		int otp=r1.nextInt(100000);
		
		System.out.println("enter the otp:"+otp);
		
		if(otp<100000) {
			otp+=100000;
		}
		System.out.println("generated otp:"+otp);
		
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the otp:");
		int userOtp=sc.nextInt();
		
		if(otp==userOtp) {
			System.out.println("otp verifed!!!!");
		}
		
	}
}
