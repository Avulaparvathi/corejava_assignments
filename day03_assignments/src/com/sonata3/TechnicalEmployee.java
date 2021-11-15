package com.sonata3;

public class TechnicalEmployee extends Employee{
	public void calculatesalary() {
		super.hra=0.12*super.BPay;
		super.sal=super.sal+hra;
		System.out.println("the salary for technicalemployee is "+sal);
	}
	public String toString() {
		return "employye id="+EmpId+" ,employee name="+EmpName;
    }
    Address a1=new Address("123","balaji nagar","hyderabad","522007");
    
    

}
