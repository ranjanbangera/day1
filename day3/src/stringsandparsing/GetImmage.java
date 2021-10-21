package stringsandparsing;

public class GetImmage {
	static String getReverse(String str) {
		StringBuffer sb=new StringBuffer(str);
		StringBuffer sbReverse = sb.reverse();
		String str3=new String(sbReverse);
	
    return str3;
	}

	public static void main(String[] args) {
		String str = "EARTH";
		String str2 = getReverse(str);
		System.out.println(str + "|" + str2);


	}

}
