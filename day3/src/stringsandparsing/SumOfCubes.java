package stringsandparsing;

import java.util.Scanner;

public class SumOfCubes {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int s=0,d,temp=num;
		while(num>0) {
			d=num%10;
			s+=d*d*d;
			num/=10;
		}
		System.out.println("The sum of the cubes of the digits of "+temp+" is "+s);
	}

}
