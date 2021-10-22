package stringsandparsing;

public class FibonacciRecursive {
	static int n1=1,n2=1,n3;
	static void fibonacci(int num) {
		if(num>0) {
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.print(" "+n3);
			fibonacci(num-1);
		}
	}

	public static void main(String[] args) {
		int num=6;
		System.out.print(n1+" "+n2);
		fibonacci(num-2);
		

	}

}
