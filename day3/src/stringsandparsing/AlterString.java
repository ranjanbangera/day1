package stringsandparsing;

public class AlterString {
	static boolean isVowel(char ch) {
		if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
			return false;
		}
		return true;
	}

	static String alterStr(char[] str) {
		for (int i = 0; i < str.length; i++) {
			if (!isVowel(str[i])) {
				if (str[i] == 'z') {
					str[i] = 'b';
				}else {
					str[i]=(char)(str[i]+1);
					if(isVowel(str[i]))
					{
						str[i]=(char)(str[i]+1);
					}
				}
			}

		}
		return String.valueOf(str);
	}

	public static void main(String[] args) {

		String str = "bcd";
		
		String str2 = alterStr(str.toCharArray());
		System.out.println(str2);

	}

}
