import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class FishMarket {

	Random random = new Random();
	ArrayList<Seafood> seafoodList = new ArrayList<>();

	public void simulateFishMarket() {

		populateList();
		writeFile();
	}

	public void populateList() {
		for(int i = 1; i <= 300; i++) {
			int randomVariable = random.nextInt(4); //creates the random variable to determine which of the 4 seafood it is.
			int weightVariable = random.nextInt(2); //random var allows fish to have more chance
			double randomCrabWeight = (10.0) * random.nextDouble(); 
			double randomFishWeight = (15.0) * random.nextDouble();
			double randomShrimpWeight = (5.0) * random.nextDouble();
			double randomScallopWeight = (2.5) * random.nextDouble();

			
			switch(randomVariable) { //switch statement to determine what the random seafood is going to be.
			case 1: randomVariable = 1;  //case for crab
			Crab crab = new Crab(i, "Crab", randomCrabWeight, 3.050);
			seafoodList.add(crab);
			break;
			case 2: randomVariable = 2; //case for fish
			Fish fish = new Fish(i, "Fish", randomFishWeight, 2.405);
			seafoodList.add(fish);
			break;
			case 3: randomVariable = 3; //case for shrimp
			Shrimp shrimp = new Shrimp(i, "Shrimp", randomShrimpWeight, 1.220);
			seafoodList.add(shrimp);
			break;
			case 4: randomVariable = 4; //case for scallop
			Scallop scallop = new Scallop(i, "Scallop", randomScallopWeight, 0.656);
			seafoodList.add(scallop);
			break;

			}


		}
	}


	public void writeFile() {
		try {
			FileWriter file = new FileWriter("FishMarket.csv"); //creates the FileWriter file
			//BufferedWriter buffer = new BufferedWriter(file);
			PrintWriter writer = new PrintWriter(file);
			
			writer.print("Index"); //creates all the headers for the .csv file.
			writer.print(",");
			writer.print("Type");
			writer.print(",");
			writer.print("Weight");
			writer.print(",");
			writer.print("Price");
			writer.print(",\n");
							
			
			for(Seafood list : seafoodList) { //prints the data to the .csv file.
				writer.println(list);
			}
			writer.close();//closes the writer
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void load() throws FileNotFoundException {
		Scanner scanner = new Scanner(new File("FishMarket.csv"));
		ArrayList<String[]> inputtedData = new ArrayList<>();
		String[] input;
		while (scanner.hasNext()) {
			input = scanner.nextLine().split(",");
			inputtedData.add(input);
		}

		for(String[] temp : inputtedData) {
			for(String a : temp) {
				System.out.println(a + "\t");
			}
			System.out.println("\n");

		}
	}
}	


