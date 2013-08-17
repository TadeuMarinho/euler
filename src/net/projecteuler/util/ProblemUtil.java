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
	
	public static boolean isPythagoreanTriplet(int a, int b, int c) {
		return (isPythagorean(a, b, c) && (a + b + c == 1000));
	}
	
	public static boolean isPythagorean(int a, int b, int c) {
		return ((a * a) + (b * b)) == (c * c);
	}
	
	public static long quantityOfFactors(long number) {
		long quantity = 0;
		
		for (int i=1; i<=number; i++) {
			if (isDividedBy(number, i)) {
				quantity++;
			}
		}
		
		return quantity;
	}
	
	public static long triangleNumber(long position) {
		long triangleNumber = 0;
		
		for (int i=1; i<=position; i++) {
			triangleNumber += i;
		}
		
		return triangleNumber;
	}
}