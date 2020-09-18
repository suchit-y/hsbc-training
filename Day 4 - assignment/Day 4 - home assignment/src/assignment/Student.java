package assignment;

import assignment.exception.MyNullPointerException;

public class Student {
	private int id;
	private String name;

	Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "id: " + id + " name: " + name;
	}

	public static void main(String[] args) throws MyNullPointerException {
		Student std = null;
		try {
			std.toString();
		} catch (NullPointerException e) {
			throw new MyNullPointerException();
		}
	}

}
