package com.nissan.trainingcorejava;

class Superclass
{
	
}

public class Instanceofexample extends Superclass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Instanceofexample obj= new Instanceofexample();
		System.out.println(obj instanceof Instanceofexample);  // instance of same class
		System.out.println(obj instanceof Superclass);		   // instance of super class
		

	}

}
