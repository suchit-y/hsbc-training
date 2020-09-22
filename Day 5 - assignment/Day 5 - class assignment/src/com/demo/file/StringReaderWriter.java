package com.demo.file;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class StringReaderWriter {

	public static void main(String[] args) throws Exception {
		String str[] = new String[20];
		FileWriter fw = null;
		BufferedWriter bw = null;

		str[0] = "This is Suchit.";
		str[1] = "I'm in java class.";
		str[2] = "My instructor is Shantanu.";

		fw = new FileWriter("OutputFile.txt");
		bw = new BufferedWriter(fw);

		int i = 0;
		while (str[i] != null) {
			bw.write(str[i]);
			bw.newLine();
			i++;
		}
		bw.flush();
	}

}
