package assignment.thread.app;

public class PrintGreeting extends Thread {
	private Greet greet;
	private String name;

	public PrintGreeting(Greet greet, String name) {
		this.greet = greet;
		this.name = name;
	}

	public void run() {
		greet.print(name);
	}

}
