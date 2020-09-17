public class Adder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number, result = 0;
		if (args.length < 2)
			System.out.println("Enter atleast 2 numbers.");
		for (int i = 0; i < args.length; ++i) {
			number = Integer.parseInt(args[i]);
			result += number;
		}

		System.out.println("Result: " + result);

	}

}
