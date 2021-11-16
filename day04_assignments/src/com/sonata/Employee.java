package com.sonata;
import java.util.*;

public class Employee {
	int EmpId;
	String EmpName;
	double EmpSal;
	public Employee(int EmpId,String EmpName,double EmpSal) {
		this.EmpId=EmpId;
		this.EmpName=EmpName;
		this.EmpSal=EmpSal;
	}
	public String toString() {
		return EmpId+" "+EmpName+" "+EmpSal;
	}

}
