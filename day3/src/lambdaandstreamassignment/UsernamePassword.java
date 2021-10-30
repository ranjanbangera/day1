package lambdaandstreamassignment;

import java.util.Scanner;

@FunctionalInterface
interface Usrname {
	boolean Usrnme(String str, String i);
}

public class UsernamePassword {
	public static void main(String[] args) {
		String ostr = "raju", oi = "1234";
		Scanner sc = new Scanner(System.in);
		Usrname un = (str, i) -> {
			return (ostr.equals(str) && oi.equals(i));
		};
		System.out.println("enter username : ");
		String str = sc.next();
		System.out.println("enter password  : ");
		String i = sc.next();
		System.out.println(un.Usrnme(str, i));
	}
}