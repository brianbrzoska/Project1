
public class main {
	int n = 0;

	public int combinations(int n, int r) { //n! / (n-r)!
		int result = ((factorial(n)) / (factorial(r) * factorial(n-r))); //formula for combinations
		
		return result;
	}

	public int permutations(int n, int r) { //n! / r!(n-r)!
		int result = factorial(n) / (factorial(n-r)); //formula for permutations

		return result;
	}

	public int factorial(int n) { //method for a number to be factored. There is no MATH function to get the factorial.
		
		int f = 1, j = 1;
		while (j <= n) {
			f = f * j;
			j++;
		}
		return f;
	}

}

