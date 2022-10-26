import java.util.Scanner;

public class tester {

	public static void main (String[] args) {
		main test = new main(); //creates the test object
		Scanner scanner = new Scanner(System.in); //creates Scanner
		System.out.println("What is the n value?: "); 
		int n = scanner.nextInt(); //takes input for n value.
		System.out.println("What is the r value?: ");
		int r = scanner.nextInt(); //takes input for r value
		System.out.println("Combinations Result: " + test.combinations(n, r)); //prints the combinations result
		System.out.println("\nPermutations Results: " + test.permutations(n, r)); //prints the permutation result
		}
}
