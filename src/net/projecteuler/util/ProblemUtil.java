package net.projecteuler.util;

public class ProblemUtil {

	public static boolean isEven(int number) {
		return (number % 2 == 0);
	}
	
	public static boolean isDividedBy(double dividend, double divisor) {
		return (dividend % divisor == 0);
	}
	
	public static boolean isPalindrome(String number) {
		String invertion = "";
		for (int i=number.length()-1; i>=0; i--) {
			invertion += number.charAt(i);
		}
		
		return invertion.equals(number);
	}
	
	public static boolean isPrime(long number) {
		boolean isPrime = true;
		
		if (number <2) {
			isPrime = false;
		} else {
			for (long i=2; i<number; i++) {
				if (number % i == 0) {
					isPrime = false;
				}
			}
		}
		
		return isPrime;
	}
	
	public static long firstPrime() {
		return nextPrime(0);
	}
	
	public static long nextPrime(long number) {
		do {
			number++;
		} while (!ProblemUtil.isPrime(number));
		
		return number;
	}
}
