package com.demo.impl.writer;

import com.demo.interfaces.demo2.Writer;

public class HTMLWriter implements Writer {

	@Override
	public void write(String message) {
		System.out.println("from HTML text writer: " + message);
	}

}
