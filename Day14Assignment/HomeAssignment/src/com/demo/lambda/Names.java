package com.demo.lambda;

import java.util.ArrayList;
import java.util.List;

public class Names {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();

		names.add("Suchit");
		names.add("Chaitanya");
		names.add("Sagar");
		names.add("Saketh");
		names.add("Raghu");
		names.add("Rajalakshmi");
		names.add("Chitra");
		names.add("Sai");
		names.add("Sriniketh");
		names.add("Rahul");

		// length of each name
		names.stream().map(name -> name + " has length " + name.length()).forEach(System.out::println);

	}

}
