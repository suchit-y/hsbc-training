package com.demo.impl.writer;

import com.demo.interfaces.demo2.Writer;

public class DecoratedWriter implements Writer {

	@Override
	public void write(String message) {
		System.out.println("from decorated text writer: " + message);
	}

}
