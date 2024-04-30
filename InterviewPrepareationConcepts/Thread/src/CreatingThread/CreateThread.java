package CreatingThread;

public class CreateThread extends Thread {
	public void run() {
		System.out.println("thread started");
	}
	
	public static void main(String[] args) {
		CreateThread ct=new CreateThread();
		ct.start();
		
	}
}
