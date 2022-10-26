
public class tester {

	public static void main(String[] args) {
		
		median test = new median(); //creates test
		double[] list = {2, 2, 2, 7, 9, 9, 9}; //example
		System.out.println(test.computeMedian(list, list.length)); //returns median of the example list
	}
}
