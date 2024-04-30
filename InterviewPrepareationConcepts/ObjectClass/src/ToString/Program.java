package ToString;

public class Program {
	private String car;

	public Program(String car) {
		// TODO Auto-generated constructor stub
		this.car=car;
	}
	public static void main(String[] args) {
		Program p=new Program("nano");
		System.out.println(p);
		System.out.println(p.toString());
	}
	public String toString(){
		return car;
	}
}
