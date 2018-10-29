package com.nissan.trainingcorejava;

class Vehicle
{
	void run()
	{
		System.out.println("Vehicle is running...");
	}
	
}

class Bus extends Vehicle
{
	void run()
	{
		System.out.println("Bus is running...");
	}
	
}

public class Overridingmethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vehicle v=new Vehicle();
		Vehicle c=new Bus();
		Bus b=new Bus();
		//Bus b1= new Vehicle();
		v.run();
		c.run();
		b.run();

	}

}
