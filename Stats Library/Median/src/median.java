import java.util.Arrays;

public class median {

	public double computeMedian(double[] list, int length) {
		
		Arrays.sort(list); //sorts the list
	
		int center = list.length/2; //identifies the center of the list
		if (list.length % 2 == 1) { 
			return list[center];
		} else {
			return (list[center - 1] + list[center]) / 2.0;
		}


	}
}
