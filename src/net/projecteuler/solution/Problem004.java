package net.projecteuler.solution;

import static net.projecteuler.util.ProblemUtil.isPalindrome;;

public class Problem004 implements Problem {

	@Override
	public String getName() {
		return "Largest palindrome product.";
	}

	@Override
	public String getDescription() {
		StringBuilder description = new StringBuilder();
		description.append("A palindromic number reads the same both ways. The largest palindrome made from the \n");
		description.append("product of two 2-digit numbers is 9009 = 91 99. \n");
		description.append("Find the largest palindrome made from the product of two 3-digit numbers.");
		
		return description.toString();
	}

	@Override
	public long solve() {
		long largestPalindrome = 0;
		
		for (int number1=100; number1<=999; number1++) {
			for (int number2=100; number2<=999; number2++) {
				String result = Long.toString(number1 * number2);
				if (isPalindrome(result)) {
					if (Long.valueOf(result) > largestPalindrome) {
						largestPalindrome = Long.valueOf(result);
					}
				}
			}
		}
		
		return largestPalindrome;
	}
}