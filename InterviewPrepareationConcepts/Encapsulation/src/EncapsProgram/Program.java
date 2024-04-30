package EncapsProgram;
/*Encapsulation:-
 * binding variales with memeber function into 
 * a single unit called class. this process is called
 * Encapsulation
 * 
 * Steps to create ecapsalated program:-
 * 1)declar variales as private
 * 2)provide access to the variable through public
 *   methods
 * 3)If program is not encapsulated date variable will
 *   be miss used by assigning invalid data
 *   
 * Pupose of encapsulation:-
 * we go for encapsulation to protech variables from invalid data*/
public class Program {
	private int monthNum;
	public void assign(int monthNum) {
		if(monthNum >=1 && monthNum <=12) {
			this.monthNum=monthNum;
			System.out.println("is valid monthnumber");
		}
		else {
			System.out.println("monthnumber is invalid number");
		}
	}
	public static void main(String[] args) {
		Program p=new Program();
		p.assign(15);
	}
}
