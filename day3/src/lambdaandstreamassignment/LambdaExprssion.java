package lambdaandstreamassignment;

//no argument
@FunctionalInterface
interface Intf1 {
	void noArg();
}

//one argument
@FunctionalInterface
interface Intf2 {
	String one(String st);
}

//two argument
@FunctionalInterface
interface Intf3 {
	int two(int x, int y);
}

@FunctionalInterface
interface Intf4 {
	boolean ho(String st);
}

public class LambdaExprssion {

	public static void main(String[] args) {
		// no argument
		Intf1 na = () -> System.out.println("hello");
		na.noArg();

		// one argument
		Intf2 oa = st -> st;
		System.out.println(oa.one("hi"));

		// two argument
		Intf3 ta = (int x, int y) -> x * y;
		System.out.println(ta.two(10, 5));

		// contains or not contains
		Intf4 inf = st -> {
			if (st.contains("p")) {
				return true;
			} else {
				return false;
			}
		};
		System.out.println(inf.ho("hlo"));
	}
}
