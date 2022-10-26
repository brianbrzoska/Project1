import java.util.Scanner;

public class tester {

	
	public static void main(String[] args) {
		binomialDistribution test = new binomialDistribution();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("What is the value of n?");
		double n = scanner.nextDouble();
		

		System.out.println("What is the value of p?");
		double p = scanner.nextDouble();
		
		System.out.println("What is the value of y?");
		double y = scanner.nextDouble();
		
		System.out.println(test.binomialDistro( n, y, p));

	}

}
