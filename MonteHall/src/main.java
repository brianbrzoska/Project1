
public class main {
	
	int wins = 0;
	
	public double runTrials(int trials) {
		for (int i = 0; i < trials; i++) {
			int prize  = (int) (3 * Math.random()); //prizes are hidden behind the 3 doors.
			int choice = (int) (3 * Math.random()); //contestant chooses a door randomly
			int reveal; //host will reveal a door that is not containing a prize
			do {
				reveal = (int) (3 * Math.random());
			} while ((reveal == choice) || (reveal == prize));

			int other = 0 + 1 + 2 - reveal - choice;

			if (other == prize) wins++;
		}

		return(1.0 * wins / trials);
	}
}

