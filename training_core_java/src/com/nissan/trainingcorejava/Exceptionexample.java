package com.nissan.trainingcorejava;

public class Exceptionexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=100;
		try {
			
			//System.out.println(n/0);
			int a[]=new int[5];
			a[10]=30/0;
			//a[10]=30/20;
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e + " greater than limit of array");
		}
		finally
		{
			System.out.println("Always get executed");
		}
		System.out.println("Rest is executed");

	}

}
