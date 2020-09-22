package com.demo.thread.app;

public class PrintWorker implements Runnable {
	private MessagePrinter printer;
	private String message;

	public PrintWorker(MessagePrinter printer, String message) {
		this.printer = printer;
		this.message = message;
	}

	public void run() {
		printer.print(message);
	}

}
