package com.nissan.trainingcorejava; 

class Animal{

	void voice()
	{
		System.out.println("making sounds...");
	}
}

class Lion extends Animal
{
	void roar() {
		
		System.out.println("Lion is roaring...");
	}
}


public class Testsingleinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Lion ob= new Lion();
		ob.voice();
		ob.roar();

	}

}
