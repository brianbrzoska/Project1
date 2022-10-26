import java.util.Scanner;

public class test {

	
	public static void main(String[] args) {
		geometricDistribution test = new geometricDistribution();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("How many trials would you like to run?");
		double trials = scanner.nextDouble();
		

		System.out.println("What is the value of p?");
		double p = scanner.nextDouble();
		
		System.out.println(test.geometricDistribution( p,  trials));

	}

}
