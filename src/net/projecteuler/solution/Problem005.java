package net.projecteuler.solution;

/**
 * Smallest multiple.
 * 
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20? 
 */
public class Problem005 {

	public static void main(String[] args) {
		calculate();
	}

	private static void calculate() {
		int smallestNumber = 9;
		boolean found = false;
		
		while (!found) {
			smallestNumber++;
			found = true;
			for (int i=1; i<=20; i++) {
				if (smallestNumber % i != 0) {
					found = false;
					break;
				}
			}
		}
		
		System.out.println(smallestNumber);
	}
}