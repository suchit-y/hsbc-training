package com.demo.interfaces.writerApp;

import com.demo.interfaces.demo2.Writer;
import com.demo.impl.writer.*;

public class MyWriterFactory {
	public static Writer getWriter(String pickWriter) {
		if (pickWriter == "pw")
			return new PlainTextWriter();
		else if (pickWriter == "dw")
			return new DecoratedWriter();
		else if (pickWriter == "hw")
			return new HTMLWriter();
		else
			return null;
	}
}
