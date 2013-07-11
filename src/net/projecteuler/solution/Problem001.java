package net.projecteuler.solution;

import static net.projecteuler.util.ProblemUtil.isDividedBy;;

public class Problem001 implements Problem {
	
	@Override
	public String getName() {
		return "Multiples of 3 and 5.";
	}
	
	@Override
	public String getDescription() {
		StringBuilder description = new StringBuilder();
		description.append("If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. \n");
		description.append("The sum of these multiples is 23. \n");
		description.append("Find the sum of all the multiples of 3 or 5 below 1000.");
		
		return description.toString();
	}

	@Override
	public long solve() {
		int sum = 0;
		int below = 1000;
		
		for (int number=1; number<below; number++) {
			if (isDividedBy(number, 3) || isDividedBy(number, 5)) {
				sum += number;
			}
		}
		
		return sum;
	}
}