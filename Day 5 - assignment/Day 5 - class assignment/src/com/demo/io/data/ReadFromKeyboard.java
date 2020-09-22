package com.demo.io.data;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadFromKeyboard {
	
	public static String input(){
		try {
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			String line="";
			while(!(line=br.readLine()).equals("exit")) {
				return line;
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		return null;
	}
}