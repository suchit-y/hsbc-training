package assignment.thread.app;

public class SynchornizedDemo extends Thread {

	public static void main(String[] args) throws InterruptedException {
		Greet greet = new Greet();

		Thread t1 = new Thread(new PrintGreeting(greet, "Suchit"));
		Thread t2 = new Thread(new PrintGreeting(greet, "Sagar"));
		Thread t3 = new Thread(new PrintGreeting(greet, "Sanjay"));

		t1.start();
		t2.start();
		t3.start();

		t1.join();
		t2.join();
		t3.join();
	}
}
