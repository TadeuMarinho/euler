package net.projecteuler.solution;

public class Problem006 implements Problem {

	@Override
	public String getName() {
		return "Sum square difference.";
	}

	@Override
	public String getDescription() {
		StringBuilder description = new StringBuilder();
		description.append("The sum of the squares of the first ten natural numbers is, 1^2 + 2^2 + ... + 102 = 385. \n");
		description.append("The square of the sum of the first ten natural numbers is, (1 + 2 + ... + 10)2 = 552 = 3025. \n");
		description.append("Hence the difference between the sum of the squares of the first ten natural numbers and \n");
		description.append("the square of the sum is 3025  385 = 2640. \n");
		description.append("Find the difference between the sum of the squares of the first one hundred natural \n");
		description.append("numbers and the square of the sum.");
		
		return description.toString();
	}

	@Override
	public String solve() {
		int sunOfsquares = 0;
		int squareOfSum = 0;
		
		for (int i=1; i<=100; i++) {
			sunOfsquares += i *i ;
			squareOfSum += i;
		}
		
		squareOfSum *= squareOfSum;
		return Integer.toString(squareOfSum - sunOfsquares);
	}
	
	@Override
	public String solveAsProposed() {
		return "To implement";
	}
}