package com.sonata;
import java.util.*;

public class UserEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e3 = new Employee(12,"parvathi",1234);
		Employee e4 = new Employee(23,"preeti",3356);
		Employee e5 = new Employee(45,"jhansi",5678);
		UserEmployee ue = new UserEmployee();
		System.out.println(e3);
		System.out.println(e4);
		System.out.println(e5);
		ue.appSalary(e3);

	}

}
