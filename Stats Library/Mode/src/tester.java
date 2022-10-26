
public class tester {

	public static void main(String[] args) {
		Mode test = new Mode(); //creates test
		double[] list = {26, 42, 18, 18, 69, 96, 88}; //creates example list
		System.out.println(test.computeMode(list, list.length)); //computes mode of list and list.length
	}

}
