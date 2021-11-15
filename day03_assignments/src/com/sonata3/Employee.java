package com.sonata3;

public abstract class Employee {
	int EmpId;
	String EmpName;
	double BPay=20000;
    double noofleavAv;
    double hra;
    double sal;
    public abstract void calculatesalary();
    public String toString() {
    	return "employye id is "+EmpId+" employee name is "+EmpName;
    }
    Address a1;

}
