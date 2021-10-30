package lambdaandstreamassignment;

@FunctionalInterface
interface Pow {
	int power(int x, int y);
}

public class Power {

	public static void main(String[] args) {
		Pow pwr = (int x, int y) -> x * y;
		System.out.println(pwr.power(6, 5));
	}

}
