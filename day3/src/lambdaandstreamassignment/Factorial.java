package lambdaandstreamassignment;

@FunctionalInterface
interface Fact {
	int Fact(int n, int fac);
}

public class Factorial {

	public static void main(String[] args) {

		Fact fct = (int n, int fac) -> {
			for (int i = 1; i <= n; i++) {
				fac = fac * i;
			}
			return fac;
		};

		System.out.println(fct.Fact(6, 1));

	}
}
