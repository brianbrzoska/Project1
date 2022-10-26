import java.awt.List;

public class Mean {

	public double computeMean(double[] list) {
		
		double total = 0; //creates the total = 0
		for (int i = 0; i < list.length; i++) { //loops through the entire list by length
			total += list[i]; 
		}
		return (total / list.length); //returns mean
	}
}
