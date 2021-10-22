package stringsandparsing;

public class CheckNumber {
	static boolean checkNumber(int num) {
		if (num == 0) {
			return false;
		}
		while (num != 1) {
			if (num % 2 != 0)
				return false;
			num = num / 2;
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(checkNumber(10));
	}
}
