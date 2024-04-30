package MethodWithReturnType;

public class nonStaticReturntype {
	public static void main(String[] args) {
		nonStaticReturntype rsr=new nonStaticReturntype();
		int timeInMinutes=rsr.hourToMinute(4);
		System.out.println(timeInMinutes);
	}
	public int hourToMinute(int timeInHour) {
		return timeInHour*60;
	}
}
