package com.nissan.trainingcorejava;


abstract class rbi
{
	abstract void roi();
}
class hdfc extends rbi
{
	void roi()
	{
		System.out.println("Rate of Interest is 10%");
	}
}

class iob extends rbi
{
	void roi()
	{
		System.out.println("Rate of Interest is 11%");
	}

}
public class Abstractbank  {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		iob obj= new iob();
		hdfc obj1=new hdfc();
		obj.roi();
		obj1.roi();
		
	}

}
