package OtpGenerat;
/*Random:-
 * class is used for random manner
 * it is inbuild class which is present in
 * java.util package and it is used to generate 
 * random numbers
 * 
 * nextInt():-is a polymorphism method which is working
 * with random class as well as scanner class.*/
import java.util.Random;

public class OtpProgram1 {
	public static void main(String[] args) {
		Random r1=new Random();
		int number=r1.nextInt(100);
		System.out.println(number);
	}
}
