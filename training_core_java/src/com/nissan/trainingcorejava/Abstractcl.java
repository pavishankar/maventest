package com.nissan.trainingcorejava;

abstract class Trucks{
	abstract void run();
}
abstract class Bikes extends Trucks{
	
	abstract void run();
	//abstract void something();
}
public class Abstractcl extends Bikes{
	
	void run()
	{
		System.out.println("Running the trucks");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abstractcl obj= new Abstractcl();
		obj.run();
	}



}
