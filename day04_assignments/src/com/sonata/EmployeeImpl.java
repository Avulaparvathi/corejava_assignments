package com.sonata;

import java.util.*;

public class EmployeeImpl implements EmployeeInt{
	

	@Override
	public void addEmployee(Employee e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteEmployee(Employee e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double yearSalary(Employee e1) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double appSalary(Employee e1) {
		// TODO Auto-generated method stub
		if(e1.EmpSal<10000)
			e1.EmpSal=e1.EmpSal+5000;
		return e1.EmpSal;
	}

	@Override
	public List<Employee> getEmployee() {
		// TODO Auto-generated method stub
		return null;
	}

	
	

}
