package net.projecteuler.solution;

/**
 * Multiples of 3 and 5
 *
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. 
 * The sum of these multiples is 23.
 *
 * Find the sum of all the multiples of 3 or 5 below 1000.
 */
public class Problem001 {
	
	public static void main(String[] args) {
		System.out.println(calculate());
	}
	
	private static int calculate() {
		int sum = 0;
		
		for (int number=1; number<1000; number++) {
			if (number % 3 == 0 || number % 5 == 0) {
				sum += number;
			}
		}
		
		return sum;
	}
}