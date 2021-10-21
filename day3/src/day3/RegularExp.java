package day3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExp {

	public static void main(String[] args) {
		String str="flyingreturn.base@airindia.in";
		String str1="star.retros@airindia.in";
		String pat1="\\w{3,}\\.\\w{3,}@(\\w{3,}\\.\\w{1,})";
		Pattern p=Pattern.compile(pat1);
		Matcher m=p.matcher(str1);
		System.out.println("kk"+m.matches());
		System.out.println(m.group(0));
		System.out.println(m.group(1));
		System.out.println(Pattern.matches("\\w{3,}\\.\\w{3,}@\\w{3,}\\.\\w{1,}", str));
		System.out.println();
		System.out.println(Pattern.matches("\\w{3,}\\.\\w{3,}@\\w{3,}\\.\\w{1,}", str1));
		
		System.out.println();
		
		String str2="180 233 1407";
		String pat2="([0-9]{3})\\s[0-9]{3}\\s[0-9]{4}";
		Pattern p1=Pattern.compile(pat2);
		Matcher m1=p1.matcher(str2);
		System.out.println(m1.matches());
		System.out.println(m1.group(0));
		System.out.println(m1.group(1));
		
		System.out.println(Pattern.matches("[0-9]{3}\s[0-9]{3}\s[0-9]{4}", str2));
		
		System.out.println();
		
		String str3="020-26231407";
		String pat3="([0-9]{3})-([0-9]{8})";
		Pattern p2=Pattern.compile(pat3);
		Matcher m2=p2.matcher(str3);
		System.out.println(m2.matches());
		System.out.println(m2.group(0));
		System.out.println(m2.group(1));
		System.out.println(m2.group(2));
				System.out.println(Pattern.matches("[0-9]{3}-[0-9]{8}", str3));
				
		System.out.println();
		
		String str4="0930 hrs - 1730 hrs";
		String pat4="([0-9]{4}\\s\\w{3}\\s)-\\s([0-9]{4})\\s(\\w{3})";
		Pattern p3=Pattern.compile(pat4);
		Matcher m3=p3.matcher(str4);
		System.out.println(m3.matches());
		System.out.println(m3.group(0));
		System.out.println(m3.group(1));
		System.out.println(m3.group(2));
		System.out.println(m3.group(3));
		System.out.println(Pattern.matches("[0-9]{4}\\s\\w{3}\\s-\\s[0-9]{4}\\s\\w{3}", str4));
		
		System.out.println();
		
		String str5="MTNL / BSNL";
		System.out.println(Pattern.matches("\\w{4}\\s/\\s\\w{4}", str5));
		
		System.out.println();
		
		String str6="+91 124 2641407 (international call data applicable)";
		System.out.println(Pattern.matches("\\+\\d{2}\\s\\d{3}\\s\\d{2,}\\s\\(\\w{2,}\\s\\w{2,}\\s\\w{2,}\\s\\w{2,}\\)", str6));
	}

}
