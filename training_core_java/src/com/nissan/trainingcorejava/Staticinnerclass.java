package com.nissan.trainingcorejava;

public class Staticinnerclass {

	static int membervalues=100;
	int value;
	static class Innerone{
		void display()
		{
			System.out.println("Value is : "+membervalues);
			//System.out.println("Value is : "+value);  Cannot access non static members
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Staticinnerclass.Innerone obj=new Staticinnerclass.Innerone();
		obj.display();

	}

}
