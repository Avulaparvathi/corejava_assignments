package com.sonata3;

public class Address {

	String DNo;
	String street;
	String city;
	String pincode;
	public Address(String DNo,String street,String city,String pincode){
		this.DNo=DNo;
		this.street=street;
		this.city=city;
		this.pincode=pincode;

	}
	public void display() {
		System.out.println("the address of an employee is ");
		System.out.println("DNo:"+DNo+","+street+","+city+","+pincode+".");
	
	}
	
	

}
