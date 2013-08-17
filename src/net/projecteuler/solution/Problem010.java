package net.projecteuler.solution;

import static net.projecteuler.util.ProblemUtil.nextPrime;

public class Problem010 implements Problem {

	@Override
	public String getName() {
		return "Summation of primes.";
	}

	@Override
	public String getDescription() {
		StringBuilder description = new StringBuilder();
		description.append("The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17. \n");
		description.append("Find the sum of all the primes below two million. \n");
		
		return description.toString();
	}

	@Override
	public String solve() {
		long sum = 0;
		long nextPrime = 0;
		
		while (true) {
			nextPrime = nextPrime(nextPrime);
			if (nextPrime < 2000000) {
				System.out.println(nextPrime);
				sum += nextPrime;
			} else {
				break;
			}
		}
		
		return Long.toString(sum);
	}
	
	@Override
	public String solveAsProposed() {
		return "To implement";
	}
}