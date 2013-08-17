package net.projecteuler.solution;

public class Problem008 implements Problem {
	
	private String consecutiveDigits;;
	
	public Problem008() {
		this.consecutiveDigits = createConsecutiveDigits();
	}

	@Override
	public String getName() {
		return "Largest product in a series.";
	}

	@Override
	public String getDescription() {
		StringBuilder description = new StringBuilder();
		description.append("Find the greatest product of five consecutive digits in the 1000-digit number. \n");
		for (int i=50; i<1000; i+=50) {
			description.append(this.consecutiveDigits.substring(i-50, i)).append(" \n");
		}
		
		return description.toString();
	}

	@Override
	public String solve() {
		long greatestProduct = 0;
		
		for (int i=0; i<this.consecutiveDigits.length()-4; i++) {
			String fiveConsecutiveDigits = this.consecutiveDigits.substring(i, i + 5);
			long product = 1;
			for (int j=0; j<fiveConsecutiveDigits.length(); j++) {
				product *= Long.valueOf(fiveConsecutiveDigits.substring(j, j+1));
			}
			
			if (product > greatestProduct) {
				greatestProduct = product;
			}
		}
		
		return Long.toString(greatestProduct);
	}
	
	@Override
	public String solveAsProposed() {
		return "To implement";
	}
	
	private static String createConsecutiveDigits() {
		StringBuilder consecutiveDigits = new StringBuilder();
		consecutiveDigits.append("73167176531330624919225119674426574742355349194934");
		consecutiveDigits.append("96983520312774506326239578318016984801869478851843");
		consecutiveDigits.append("85861560789112949495459501737958331952853208805511");
		consecutiveDigits.append("12540698747158523863050715693290963295227443043557");
		consecutiveDigits.append("66896648950445244523161731856403098711121722383113");
		consecutiveDigits.append("62229893423380308135336276614282806444486645238749");
		consecutiveDigits.append("30358907296290491560440772390713810515859307960866");
		consecutiveDigits.append("70172427121883998797908792274921901699720888093776");
		consecutiveDigits.append("65727333001053367881220235421809751254540594752243");
		consecutiveDigits.append("52584907711670556013604839586446706324415722155397");
		consecutiveDigits.append("53697817977846174064955149290862569321978468622482");
		consecutiveDigits.append("83972241375657056057490261407972968652414535100474");
		consecutiveDigits.append("82166370484403199890008895243450658541227588666881");
		consecutiveDigits.append("16427171479924442928230863465674813919123162824586");
		consecutiveDigits.append("17866458359124566529476545682848912883142607690042");
		consecutiveDigits.append("24219022671055626321111109370544217506941658960408");
		consecutiveDigits.append("07198403850962455444362981230987879927244284909188");
		consecutiveDigits.append("84580156166097919133875499200524063689912560717606");
		consecutiveDigits.append("05886116467109405077541002256983155200055935729725");
		consecutiveDigits.append("71636269561882670428252483600823257530420752963450");
		
		return consecutiveDigits.toString();
	}
}