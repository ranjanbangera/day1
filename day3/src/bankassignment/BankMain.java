package bankassignment;

import java.util.Scanner;

public class BankMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p = new Person("smith",25);
		Person p1 = new Person("Kathy",34);

		Account acc = new Account(1234,2000,p);
		System.out.println(acc.getAccHolder());
		System.out.println("Initial Balance :  "+acc.getBalance());
		acc.deposit(2000);
		System.out.println("Account Number :  "+acc.getAccNum());
		System.out.println("Current Balance :  "+acc.getBalance());

		System.out.println();

		Account acc1 = new Account(1235,3000,p1);
		System.out.println(acc1.getAccHolder());
		System.out.println("Initial Balance :  "+acc1.getBalance());
		acc1.withdraw(2000);
		System.out.println("Account Number :  "+acc1.getAccNum());		
		System.out.println("Current Balance : "+acc1.getBalance());

		System.out.println();
	}
}
