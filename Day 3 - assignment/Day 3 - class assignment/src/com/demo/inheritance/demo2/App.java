package com.demo.inheritance.demo2;

public class App {

	public static void main(String[] args) {
		TraineeEmployee te = new TraineeEmployee(80, "Suchit", 50000, 7.4);
		System.out.println(te.getDetails());
		Employee e = new Employee(81,"Shantanu",100000);
		//TraineeEmployee te2 = e;
		System.out.println(e.toString());
	}

}
