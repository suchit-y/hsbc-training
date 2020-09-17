package assignment;

import assignment.interfaces.HumanBeing;
import assignment.interfaces.LivingOrganism;

public class Artist implements LivingOrganism, HumanBeing {
	
	public void draw() {
		System.out.println("Artist is drawing...");
	}
	
	@Override
	public void walk() {
		System.out.println("He is walking...");
	}

	@Override
	public void eat() {
		System.out.println("He is eating...");
	}

	@Override
	public void move() {
		System.out.println("It is moving");
	}

	public static void main(String[] args) {
		Artist a = new Artist();
		a.move();
		a.eat();
		a.walk();
		a.draw();
	}
}
