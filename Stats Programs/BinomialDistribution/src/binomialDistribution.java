import java.util.Scanner;
import java.lang.Math;

public class binomialDistribution {

	public double n;
	public double y;
	public double apple = 0;
	
	public double binomialDistro(double n, double y, double p) {
		
		
		double apple = (double)(Math.pow(p, y)*(Math.pow(p - 1, n - y)));
	
		
		
		return apple;
		
		
		
	}
}
