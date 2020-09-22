package assignment.thread;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i <= 20; i++)
			System.out.println(i);
	}

	public void start() {
		Thread t1 = new Thread(this);
		t1.start();
	}

	public static void main(String[] args) {
		MyRunnable r1 = new MyRunnable();
		r1.start();
	}
}
