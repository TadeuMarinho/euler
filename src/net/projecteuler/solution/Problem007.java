package net.projecteuler.solution;

import static net.projecteuler.util.ProblemUtil.nextPrime;

public class Problem007 implements Problem {

	@Override
	public String getName() {
		return "10001st prime.";
	}

	@Override
	public String getDescription() {
		StringBuilder description = new StringBuilder();
		description.append("By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13. \n");
		description.append("What is the 10 001st prime number?");
		
		return description.toString();
	}

	@Override
	public long solve() {
		long nextPrime = 0;
		for (int primeCounter = 1; primeCounter <=10001; primeCounter++) {
			nextPrime = nextPrime(nextPrime);
		}
		
		return nextPrime;
	}
	
	@Override
	public long solveAsProposed() {
		System.out.println("To implement");
		return 0;
	}
}