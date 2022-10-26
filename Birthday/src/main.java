import java.util.Random;
import java.util.ArrayList;


public class main {
	private ArrayList<birthdayPerson> list; 
	private double trials;
	private int people;
	private double matches = 0;


	public main(int trials, int people) {
		this.people = people;
		this.trials = trials;
		list = new ArrayList<birthdayPerson>();
	}

	public int getPeople() { //getter
		return people;
	}

	public void getList() { //retrieves the list
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getDate()+ " ");
		}
	}

	public void generateBirthdays() { //generates the amount of people and random dates
		Random random = new Random();
		for(int i = 0; i < people; i++) {
			list.add(new birthdayPerson(random.nextInt(365) + 1));
		}
	}


	public void trial() { //runs the trials get generateBirthdays and getList. Loops until the entire list is checked.
		for(int i = 0; i < trials; i++) {
			generateBirthdays();
			getList();
			loop:
				for(int j = 0; j <list.size(); j++) {
					for(int x = j + 1; x < list.size(); x++) {
						if(list.get(j).getDate() == list.get(x).getDate()) {
							list.clear();
							matches += 1;
							break loop;
						}
					}
				}
			list.clear();
		}
		results();
	}

	public void results() { //prints the results of the simulation
		System.out.println("There were: " + trials  + " Trials. \nThere were: "+ people +" people.\nPercentage of People Matched: " + matches /trials +"%");

	}
}
