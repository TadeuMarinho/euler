package net.projecteuler.solution;

public interface Problem {
	
	String getName();
	
	String getDescription();
	
	String solve();
	
	String solveAsProposed();
}
