import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class test {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); //creates the scanner
		System.out.println("Enter Number of People To Create."); 
		int numberPeople = scanner.nextInt(); //takes input for amount of people.
		System.out.println("How many times you'd like to run this trial."); 
		int numberRuns = scanner.nextInt(); //takes input for the amount of runs.
		main simulation = new main(numberRuns, numberPeople); //creates a new object with the amount of people, runs.
		simulation.trial(); //runs the entire simulation.
	}

}
