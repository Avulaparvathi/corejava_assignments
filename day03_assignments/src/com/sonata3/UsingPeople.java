package com.sonata3;

public class UsingPeople {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TechnicalEmployee t1 = new TechnicalEmployee();
		t1.EmpId=23;
		t1.EmpName="parvathi";
		System.out.println(t1.toString());
		t1.a1.display();
		t1.calculatesalary();
		Staff s1 = new Staff();
		s1.EmpId=45;
		s1.EmpName="preeti";
		System.out.println(s1.toString());
		s1.a1.display();
		s1.calculatesalary();

	}

}
