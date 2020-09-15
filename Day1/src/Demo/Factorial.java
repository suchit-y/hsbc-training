package Demo;

public class Factorial {
	public static void main(String[] args) {
		int number = 6;
		long factorial = 1;
		for(int i = number; i>1; --i)
			factorial = i * factorial;
		System.out.println(factorial);
	}
}
