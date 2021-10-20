package day3;

public class StringBufferAndBuilder {

	public static void main(String[] args) {
		//StringBuffer
		String str1=new String("hello");
		String str2=new String("hello");
		
		System.out.println(str1==str2);         //reference
		System.out.println(str1.equals(str2));   //content
		
		StringBuffer sb1=new StringBuffer("hello");
		StringBuffer sb2=new StringBuffer("hello");
		
		System.out.println(sb1==sb2);         //reference
		System.out.println(sb1.equals(sb2));  //reference
		
		System.out.println(sb1.length());
		System.out.println(sb1.capacity());     //16+5(hello)
		System.out.println(sb1.append("hihi"));
		System.out.println(sb1.capacity());    //21 because appended string not exceeding 16
		System.out.println(sb1.append("abcdefghijklmnopqrstu"));
		System.out.println(sb1.capacity());   //44 because new appended string exceeding 16
		
		//StringBuilder
		StringBuilder sbr1=new StringBuilder("hiii");
		StringBuilder sbr2=new StringBuilder("hiii");
		
		//converting StringBuffer,StringBuilder-->String
		String str3=new String(sbr1);//string-->StringBuffer
		System.out.println(str3);       
		String str4=new String(sb1);//string-->StringBuffer
		System.out.println(str4);
		StringBuffer sb=new StringBuffer(str4);//stringBuffer-->String
		System.out.println(sb);
		StringBuffer sbReverse=sb.reverse();     //to reverse convert String to StringBuffer and use method reverse()
		System.out.println(sbReverse);    
	}

}
