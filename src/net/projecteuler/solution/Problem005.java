package net.projecteuler.solution;

import static net.projecteuler.util.ProblemUtil.isDividedBy;


public class Problem005 implements Problem {

	@Override
	public String getName() {
		return "Smallest multiple.Smallest multiple.";
	}

	@Override
	public String getDescription() {
		StringBuilder description = new StringBuilder();
		description.append("2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder. \n");
		description.append("What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?");
		
		return description.toString();
	}

	@Override
	public long solve() {
		int smallestNumber = 9;
		boolean found = false;
		
		while (!found) {
			smallestNumber++;
			found = true;
			for (int i=1; i<=20; i++) {
				if (!isDividedBy(smallestNumber, i)) {
					found = false;
					break;
				}
			}
		}
		
		return smallestNumber;
	}
}