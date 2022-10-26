import java.util.Scanner;

public class test {
	
	public static void main(String[] args) {
		main test = new main(); //creates test
		Scanner scanner = new Scanner(System.in); //creates scanner
		System.out.println("Enter the amount of numbers you would like to calculate."); //asks user how many numbers to use
		double r = scanner.nextDouble(); //figured out r from the input.
		double[] geno = new double[(int) r]; //creates arrayList
		for(int i = 0; i < geno.length; i++) { //asks user what numbers to use
			System.out.println("Please enter a number.");
			geno[i] = scanner.nextDouble();
		}
		
		double SD = test.calculateSTD(geno); //creates the standard deviation in SD
		 
		System.out.format("Standard Deviation = %.6f", SD); //formats the standard deviation and prints to the user
	}
}
