package stringsandparsing;

import java.util.Scanner;

public class CalculateSum {

	public static void main(String[] args) {
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number : ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			if(i%5==0 || i%3==0) {
				sum+=i;
			}
		}
	    System.out.println(sum);
	}
}
