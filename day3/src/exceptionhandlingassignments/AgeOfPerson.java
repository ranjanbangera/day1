package exceptionhandlingassignments;

import java.util.Scanner;

public class AgeOfPerson {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your age");
		int a=sc.nextInt();
		age(a);
	}
	static void age(int age)
	{
		if(age<=15)
		{
			throw new ArithmeticException("age should be greater than 15");
		}
		else
		{
			System.out.println("valid input age is above 15");
		}

	}

}
