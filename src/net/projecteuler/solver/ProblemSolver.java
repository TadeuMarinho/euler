package net.projecteuler.solver;

import net.projecteuler.solution.Problem;

public class ProblemSolver {
	public static void main(String[] problems) {
		for (String problemClass : problems) {
			try {
				Problem problem = (Problem) Class.forName(problemClass).newInstance(); 
				System.out.println("Problem: " + problem.getName());
				System.out.println("Description: " + problem.getDescription());
				System.out.println("Result: " + problem.solve());
			} catch (InstantiationException e) {
				System.out.println("Object cannot be instantiated!");
			} catch (IllegalAccessException e) {
				System.out.println("Does not have access to the definition of the specified class!");
			} catch (ClassNotFoundException e) {
				System.out.println("No definition for the class with the specified name could be found!");
			}
		}
	}
}