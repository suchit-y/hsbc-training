package com.demo.interfaces.writerApp;

import com.demo.impl.writer.*;
import com.demo.interfaces.demo2.*;

public class MyWriterApp {

	public static void main(String[] args) {
		String pickWriter = "pw";
		Writer w = MyWriterFactory.getWriter(pickWriter);

		w.write("Hi. This is Suchit.");
	}

}
