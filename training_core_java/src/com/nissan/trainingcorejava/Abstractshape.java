package com.nissan.trainingcorejava;

abstract class shape{
	
	abstract void area();
	
}

class rectangle_area extends shape
{
	int a , b;
	
	rectangle_area(){
		a=10;
		b=10;
	}
	void area()
	{
		System.out.println("Area of Rectangle = "+a*b);
	}
}
class square_area extends shape
{
	int a;
	square_area(){
		a=5;

	}
	void area()
	{
		System.out.println("Area of Square = "+a*a);
	}
}

class circle_area extends shape
{
	int a;
	circle_area(){
		a=5;

	}
	void area()
	{
		System.out.println("Area of Circle = "+3.14*a*a);
	}
}
public class Abstractshape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rectangle_area obj= new rectangle_area();
		square_area obj1= new square_area();
		circle_area obj2= new circle_area();
		obj.area();
		obj1.area();
		obj2.area();

	}

}
