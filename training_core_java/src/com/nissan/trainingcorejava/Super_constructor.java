package com.nissan.trainingcorejava;

class Animal4{
	Animal4()
	{
		System.out.println("Animal is eating...");
	}
}
class Cow extends Animal4{
	Cow()
	{
		super();  // Automatically created by compiler if its missing
		System.out.println("Cow is eating...");
		
	}
}
public class Super_constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Cow();

	}

}
