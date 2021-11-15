package com.sonata1;

public class Shape {
	double length;
	double height;
	double width;
	double a;
	public void area() {}
	public void display() {
		System.out.println("length="+length);
		System.out.println("height="+height);
		System.out.println("width="+width);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r1 = new Rectangle();
		r1.length=3;
		r1.height=5;
		r1.width=6;
		System.out.println("length,height and width of a rectangle are");
		r1.display();
		r1.area();
		Traingle t1 = new Traingle();
		t1.length=4;
		t1.height=4;
		t1.width=5;
		System.out.println("length,height and width of a Traingle are");
		t1.display();
		t1.area();
		Square s1 = new Square();
		s1.length=3;
		s1.height=3;
		s1.width=3;
		System.out.println("length,height and width of a square are");
		s1.display();
		s1.area();

	}

}
