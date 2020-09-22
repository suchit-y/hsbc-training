package assignment.thread;

public class MyThread extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++)
			System.out.println("This is display method from " + Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		MyThread t3 = new MyThread();

		t1.start();
		t2.start();
		t3.start();
	}

}
