package thread;

class MyThread extends Thread{
	public void run() {
		int i;
		
		for(i=0; i<=200; i++) {
			System.out.print(i +"\t");
			try {
				sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class TreadTest {

	public static void main(String[] args) {

		System.out.println("start");
		MyThread th1 = new MyThread();
		MyThread th2 = new MyThread();
		
		th1.start();
		th2.start();
		
		System.out.println("end");
		
	}

}
