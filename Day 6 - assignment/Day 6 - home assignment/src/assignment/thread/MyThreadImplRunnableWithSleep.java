package assignment.thread;

public class MyThreadImplRunnableWithSleep implements Runnable {

	@Override
	public void run() {
		try {
			for (int i = 0; i < 10; i++) {
				System.out.println("This is display method from " + Thread.currentThread().getName());
				Thread.sleep(2000);
			}
		} catch (InterruptedException e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		MyThreadImplRunnableWithSleep r1 = new MyThreadImplRunnableWithSleep();
		MyThreadImplRunnableWithSleep r2 = new MyThreadImplRunnableWithSleep();
		MyThreadImplRunnableWithSleep r3 = new MyThreadImplRunnableWithSleep();

		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		Thread t3 = new Thread(r3);

		t1.start();
		t2.start();
		t3.start();
	}
}
