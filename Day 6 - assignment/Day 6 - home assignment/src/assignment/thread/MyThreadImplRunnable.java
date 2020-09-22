package assignment.thread;

public class MyThreadImplRunnable implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 10; i++)
			System.out.println("This is display method from " + Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		MyThreadImplRunnable r1 = new MyThreadImplRunnable();
		MyThreadImplRunnable r2 = new MyThreadImplRunnable();
		MyThreadImplRunnable r3 = new MyThreadImplRunnable();

		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		Thread t3 = new Thread(r3);

		t1.start();
		t2.start();
		t3.start();
	}
}
