package CreatingThread;

public class MyThread extends Thread {
	private String name;
	
	public MyThread(String name) {
		this.name=name;
	}
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(name+" is runing....");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		MyThread t1=new MyThread("Thread1");
		MyThread t2=new MyThread("Thread2");
		t1.start();
		t2.start();
	}

}
