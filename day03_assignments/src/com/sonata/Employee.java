package com.sonata;

public class Employee {
	int empId;
	String empName;
	double empSal;
	public void salcal(double sal) {
		this.empSal=sal;
	}
	public void display() {
		System.out.println(empId);
		System.out.println(empName);
		System.out.println(empSal);
		}
	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.empId=123;
		e1.empName="parvathi";
		e1.salcal(1000);
		e1.display();
		Manager m1 = new Manager();
		m1.empId=456;
		m1.empName="jhansi";
		m1.salcal(2000);
		m1.display();
		Tester t1 = new Tester();
		t1.empId=678;
		t1.empName="preeti";
		t1.salcal(3000);
		t1.display();
		Developer d1 = new Developer();
		d1.empId=890;
		d1.empName="agj";
		d1.salcal(4000);
		d1.display();
	}

}
