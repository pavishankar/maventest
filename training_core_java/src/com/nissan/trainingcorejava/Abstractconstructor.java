package com.nissan.trainingcorejava;

abstract class Car1
{
	Car1()
	{
		System.out.println("Constructor....");
	}
	
	abstract void run();
	void gears() {
		System.out.println("Change the gears...");
	}
}
public class Abstractconstructor extends Car1{

	 void run()
	 {
		 
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abstractconstructor obj=new Abstractconstructor();
		obj.gears();

	}

}
