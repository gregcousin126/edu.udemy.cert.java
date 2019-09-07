package academy.learnprogramming;

/**
 * @author goran on 21/07/2017.
 */
public class DealingWithExceptions {
	public static void main(String[] args) {
		int a = 10;
		int b = 0;

		try {
			int result = divide(a, b);
			System.out.println("result= " + result);
		} catch (ArithmeticException e) { System.out.println("Error dividing message= " + e.getMessage()); }
	}

	private static int divide(int a, int b) { return a / b; }
}
