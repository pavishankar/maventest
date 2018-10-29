package com.nissan.trainingcorejava;

class Mammal
{
	String color="Blue";
}
class Dog extends Mammal
{
	String color="White";
	void Display() {
		System.out.println(color);
		System.out.println(super.color);
	}
}
public class Superexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog obj=new Dog();
		obj.Display();

	}

}
