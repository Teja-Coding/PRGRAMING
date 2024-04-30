package MethodWithReturnType;

public class ReturnTypeWithArg {
	public static void main(String[] args) {
		System.out.println("main starts");
		//int dis=giveDistance(210, 4);
		System.out.println(giveDistance(20,10));
		int dis2=giveDistance(90, 3);
		System.out.println("distance2: "+dis2);
		System.out.println(giveDistance(50, 100));
		System.out.println("main ends");
	}
	public static int giveDistance(int speed, int time) {
		return speed*time;
		
	}
}
