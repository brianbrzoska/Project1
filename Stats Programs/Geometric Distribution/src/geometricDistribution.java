import java.util.Scanner;
import java.lang.Math;

public class geometricDistribution {

	public double p;
	
	public double geometricDistribution(double p, double y) {
		
		double trials = y;
		double q = p - 1; 
		double apple = 0;
		apple = (double)(Math.pow(q, (trials - 1))*(p));
		
		
		return apple;
		
		
		
	}
}
