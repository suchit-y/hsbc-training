package com.demo.lambda;

import java.util.ArrayList;
import java.util.List;

public class Numbers {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		for (int i = 10; i <= 40; i++)
			numbers.add(i);

		// all odd numbers
		numbers.stream().filter(num -> num % 2 != 0).forEach(System.out::println);

		// sum all even numbers
		System.out.println(numbers.stream().filter(num -> num % 2 == 0).reduce(0,Integer::sum));
		
		// max value for odd numbers
		System.out.println(numbers.stream().filter(num -> num % 2 != 0).reduce(-1,Integer::max));
	}
}
