package com.nissan.trainingcorejava;

class Car{
	final void run()
	{
		System.out.println("car is running...");
	}
}


public class Honda extends Car {
	
/*	void run()  // Cannot override final method
	{
		System.out.println("Car is running again...");
	}
*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Honda h = new Honda();
		h.run();

	}

}
