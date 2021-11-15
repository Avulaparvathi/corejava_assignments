package com.sonata2;

public class EmployeeSalary {

	public static void main(String[] args) throws SalaryException{
		// TODO Auto-generated method stub
		int sal=50000;
		if(sal<100000)
			throw new SalaryException("yearly salary of an employee is less than 100000");
		else
			System.out.println("yearly salary of an employee is "+sal);

	}

}
