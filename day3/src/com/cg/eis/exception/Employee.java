package com.cg.eis.exception;

import java.util.Scanner;

import com.cg.eis.exception.EmployeeException;

public class Employee {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter salary  : ");
		int sal=sc.nextInt();
		try {
			if(sal<3000) {
				throw new EmployeeException("salary of employee is bellow 3000");
			}else {
				System.out.println("valid salary");
			}
		}catch(EmployeeException e){
				System.out.println(e);
				
			}
		}

	}


