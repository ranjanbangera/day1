package stringsandparsing;

import java.util.Scanner;

public class PrimeNumbers {
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number : ");
		int num=sc.nextInt();
		int i,j,c;
		for(i=2;i<=num;i++) {
			c=0;
			for(j=1;j<=num;j++) {
				if(i%j==0) {
					c++;
				}
			}
		    if(c==2) {
		    	System.out.print(i+" ");
		    }
		}

	}

}
