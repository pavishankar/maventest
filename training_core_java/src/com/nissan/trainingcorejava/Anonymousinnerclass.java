package com.nissan.trainingcorejava;


abstract class Customer
{
	abstract void name();
}

interface Employees  
{
	abstract void name();
}
public class Anonymousinnerclass {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c=new Customer()  // creating anonymous class
				{
			void name()
			{
				System.out.println("Name is Rajesh..");
			}

				};
			c.name();
			
		Employees emp=new Employees() {
			
		public void name()
			{
			System.out.println("Name is Suresh..");
			}
		};
		emp.name();
				

	}

}
