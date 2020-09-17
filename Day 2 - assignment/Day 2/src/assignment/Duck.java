package assignment;

public class Duck {
	static int duckCount = 0;

	Duck() {
		duckCount++;
	}
	
	void nonStaticMethod() {
		System.out.println(duckCount);
	}
	
	public static void staticMethod(){
		System.out.println(duckCount);
	}
	
	public static void main(String[] args) {
		Duck d1 = new Duck();
		Duck d2 = new Duck();
		d1.nonStaticMethod();
		Duck.staticMethod();
		d2.nonStaticMethod();
		Duck.staticMethod();
	}
}
