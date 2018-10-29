package com.nissan.trainingcorejava;

class Animal3{
	void eat()
	{
		System.out.println("Animal is eating...");
	}
}
class Cat extends Animal3{
	void eat()
	{
		System.out.println("cat is eating...");
		super.eat();
	}
}
public class Supermethodexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat obj=new Cat();
		obj.eat();

	}

}
