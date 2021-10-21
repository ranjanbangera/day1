package stringsandparsing;

public class PositiveString {
	static boolean positivestring(String st) {
		int f = 0;
		for (int i = 0; i < st.length() - 1; i++) {
			if (st.charAt(i) > st.charAt(i + 1)) {
				f = 1;
				break;
			}
		}
		if (f == 1) {
			return false;
		} else {
			return true;
		}
	}

	public static void main(String[] args) {
		String st = "anT";
		System.out.println(positivestring(st));
	}
}
