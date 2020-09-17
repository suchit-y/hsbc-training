package assignment;
/*
 * @author Y. Suchit
*/
public class Factorial {
	
	public int factorialWhile(int num) {
		int factorial = 1;
		while(num!=0) {
			factorial = factorial*num--;
		}
		return factorial;
	}
	
	public int factorialFor(int num) {
		int factorial =1;
		for(int i=num;i>1;--i) {
			factorial = factorial*i;
		}
		return factorial;
	}

	public static void main(String[] args) {
		Factorial f = new Factorial();
		System.out.println(f.factorialFor(5));	//using for loop
		System.out.println(f.factorialWhile(5));	//using while loop
		
	}

}
