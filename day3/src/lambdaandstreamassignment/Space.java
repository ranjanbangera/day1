package lambdaandstreamassignment;

@FunctionalInterface
interface Spacee {
	String space(String str, String str1);
}

public class Space {

	public static void main(String[] args) {

		Spacee sp = (String str, String str1) -> {
			for (int i = 0; i < str.length(); i++) {
				str1 = str1 + str.charAt(i) + " ";
			}
			return str1;
		};
		String str = "hello";
		String str1 = new String("");
		System.out.println(sp.space(str, str1));
	}
//public static String sp(String str,String str1) {
//	for(int i=0;i<str.length();i++) {
//		
//		str1=str1+str.charAt(i)+" ";
//	}
//	return str1;

}
