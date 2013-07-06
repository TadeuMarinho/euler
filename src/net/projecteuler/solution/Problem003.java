package net.projecteuler.solution;

/**
 * Largest prime factor.
 * 
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 */
public class Problem003 {

	public static void main(String[] args) {
		System.out.println(calculate());
	}

	private static int calculate() {
		double primeFactorOf = 600851475143d;
		int prime = 2;
		
		while (primeFactorOf / prime > 1) {
			if (primeFactorOf % prime == 0) {
				primeFactorOf = primeFactorOf / prime;
			}
			prime++;
		}

		return prime;
	}
}