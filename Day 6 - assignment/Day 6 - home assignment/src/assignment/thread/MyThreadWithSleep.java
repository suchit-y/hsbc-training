package assignment.thread;

public class MyThreadWithSleep extends Thread {

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
		MyThreadWithSleep t1 = new MyThreadWithSleep();
		MyThreadWithSleep t2 = new MyThreadWithSleep();
		MyThreadWithSleep t3 = new MyThreadWithSleep();

		t1.start();
		t2.start();
		t3.start();
	}

}
