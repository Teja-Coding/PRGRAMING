package GeneratingOtp;

import java.util.Random;

public class OtpGenerate {
	public static void main(String[] args) {
		Random r1=new Random();
		int number=r1.nextInt(100);
		System.out.println(number);
	}
}
