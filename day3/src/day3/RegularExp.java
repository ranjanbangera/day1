package day3;

import java.util.regex.Pattern;

public class RegularExp {

	public static void main(String[] args) {
		String str="flyingreturn.base@airindia.in";
		String str1="star.retros@airindia.in";
		System.out.println(Pattern.matches("\\w{3,}\\.\\w{3,}@\\w{3,}\\.\\w{1,}", str));
		System.out.println(Pattern.matches("\\w{3,}\\.\\w{3,}@\\w{3,}\\.\\w{1,}", str1));
		
		System.out.println();
		
		String str2="180 233 1407";
		System.out.println(Pattern.matches("[0-9]{3}\s[0-9]{3}\s[0-9]{4}", str2));
		
		System.out.println();
		
		String str3="020-26231407";
				System.out.println(Pattern.matches("[0-9]{3}-[0-9]{8}", str3));
				
		System.out.println();
		
		String str4="0930 hrs - 1730 hrs";
		System.out.println(Pattern.matches("[0-9]{4}\\s\\w{3}\\s-\\s[0-9]{4}\\s\\w{3}", str4));
		
		System.out.println();
		
		String str5="MTNL / BSNL";
		System.out.println(Pattern.matches("\\w{4}\\s/\\s\\w{4}", str5));
		
		System.out.println();
		
		String str6="+91 124 2641407 (international call data applicable)";
		System.out.println(Pattern.matches("\\+\\d{2}\\s\\d{3}\\s\\d{2,}\\s(\\w{2,}\\s\\w{2,}\\s\\w{2,}\\s\\w{2,})", str6));
	}

}
