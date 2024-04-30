package CreatingThread;

public class ThreadClass  implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("thread started");
	}
	
	public static void main(String[] args) {
		ThreadClass tc=new ThreadClass();
		Thread t=new Thread(tc);
		
		t.start();
	
	}

}
