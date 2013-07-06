package net.projecteuler.solution;

/**
 * A palindromic number reads the same both ways. The largest palindrome made from the 
 * product of two 2-digit numbers is 9009 = 91 99.
 * 
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */
public class Problem004 {
	public static void main(String[] args) {
		calcular();
	}
	
	private static void calcular() {
		long largestPalindrome = 0;
		for (int number1=100; number1<=999; number1++) {
			for (int number2=100; number2<=999; number2++) {
				String result = Long.toString(number1 * number2);
				String invertion = "";
				for (int i=result.length()-1; i>=0; i--) {
					invertion += result.charAt(i);
				}
				
				if (Long.valueOf(result).equals(Long.valueOf(invertion))) {
					if (Long.valueOf(result) > largestPalindrome) {
						largestPalindrome = Long.valueOf(result);
					}
				}
			}
		}
		
		System.out.println(largestPalindrome);
	}
}
