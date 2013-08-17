package net.projecteuler.solution;

import static net.projecteuler.util.ProblemUtil.isPythagoreanTriplet;

public class Problem009 implements Problem {

	@Override
	public String getName() {
		return "Special Pythagorean triplet.";
	}

	@Override
	public String getDescription() {
		StringBuilder description = new StringBuilder();
		description.append("A Pythagorean triplet is a set of three natural numbers, a < b < c, for which, a^2 + b^2 = c^2 \n");
		description.append("For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2. \n");
		description.append("There exists exactly one Pythagorean triplet for which a + b + c = 1000. \n");
		description.append("Find the product abc. \n");
		
		return description.toString();
	}

	@Override
	public long solve() {
		long result = 0;
		
		int c = 1;
		while (result == 0) {
			for (int b=1; b<c; b++) {
				for (int a=1; a<b; a++) {
					if (isPythagoreanTriplet(a, b, c)) {
						result = a * b * c;
					}
				}
			}
			c++;
		}
		
		return result;
	}
	
	@Override
	public long solveAsProposed() {
		System.out.println("To implement");
		return 0;
	}
}