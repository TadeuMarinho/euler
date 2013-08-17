package net.projecteuler.solution;

import static net.projecteuler.util.ProblemUtil.isDividedBy;
import static net.projecteuler.util.ProblemUtil.nextPrime;
import static net.projecteuler.util.ProblemUtil.firstPrime;;

public class Problem003 implements Problem {

	@Override
	public String getName() {
		return "Largest prime factor.";
	}

	@Override
	public String getDescription() {
		StringBuilder description = new StringBuilder();
		description.append("The prime factors of 13195 are 5, 7, 13 and 29. \n");
		description.append("What is the largest prime factor of the number 600851475143?");
		
		return description.toString();
	}
	
	@Override
	public String solve() {
		double primeFactorOf = 600851475143d;
		long prime = firstPrime();
		
		while (primeFactorOf / prime > 1) {
			if (isDividedBy(primeFactorOf, prime)) {
				primeFactorOf = primeFactorOf / prime;
			} else {
				prime = nextPrime(prime);
			}
		}

		return Double.toString(prime);
	}
	
	@Override
	public String solveAsProposed() {
		return "To implement";
	}
}