
public class main {

	public double calculateSTD(double num[]) {
		double sum = 0.0, standardDeviation = 0.0;
		int length = num.length;

		for(double number : num) {
			sum += number;
		}

		double mean = sum/length;

		for(double number: num) {
			standardDeviation += Math.pow(number - mean, 2);
		}

		return Math.sqrt(standardDeviation/length);
	}


}
