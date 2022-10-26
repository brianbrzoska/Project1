import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); //creates the scanner
		main test = new main(); //creates test
		System.out.println("How many trials would you like to run?");
		int trials = scanner.nextInt();  //takes input and it becomes the amount of trials.

		System.out.println(test.runTrials(trials)); //print the result of the trials.

	}
}