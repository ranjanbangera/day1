package stringsandparsing;

public class ModifyNumber {
	static int modifynumber(String str) {
		//new StringBuffer var
		StringBuffer sb = new StringBuffer("");
		for (int i = 0; i < str.length(); i++) {
			//checking if i exceeeding the loop
			if (i == str.length() - 1) {
				i = 0;
				int st = str.charAt(i) - str.charAt(str.length() - 1);
				//coverting -ve values to +ve
				if (st < 0) {
					st = Math.abs(st);
				}
				sb = sb.append(st);
				break;
			} else {
				int st = str.charAt(i) - str.charAt(i + 1);
				//coverting -ve values to +ve
				if (st < 0) {
					st = Math.abs(st);
				}
				sb = sb.append(st);
			}
		}
		String str2 = new String(sb);
		int result = Integer.valueOf(str2);
		return result;
	}
	public static void main(String[] args) {
		int num = 45862;
		System.out.println("original value : ");
		System.out.println(num);
		//integer-->string
		String str = Integer.toString(num);
		System.out.println("after modifying : ");
		System.out.println(modifynumber(str));

	}

}
