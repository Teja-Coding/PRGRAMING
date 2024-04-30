package OtpGenerat;

import java.util.Random;
import java.util.Scanner;

public class Digit6OtpGen {
	public static void main(String[] args) {
		Random r1=new Random();
		int otp=r1.nextInt(100000);
		System.out.println("otp "+otp);
		if(otp < 100000) {
			otp+=100000;
		}
		System.out.println("generated otp "+otp);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the otp");
		int Userotp=sc.nextInt();
		if(otp == Userotp) {
			System.out.println("otp verified!!!");
		}
		else {
			System.out.println("invalid otp....");
		}
	}
}
