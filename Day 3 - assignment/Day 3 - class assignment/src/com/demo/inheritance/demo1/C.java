package com.demo.inheritance.demo1;

public class C extends B{
	C() {
		super("Suchit");
		System.out.println("constructor C");
	}

	public static void main(String[] args) {
		C c = new C();
	}

}
