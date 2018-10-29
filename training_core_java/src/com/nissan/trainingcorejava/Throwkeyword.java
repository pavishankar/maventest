package com.nissan.trainingcorejava;

public class Throwkeyword {
	
	static void condition(int number)
	{
		try {
			if(number<10)
				throw new ArithmeticException("Not valid");
			else
				System.out.println("Valid");
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		condition(8);
		System.out.println("******************************");
		condition(15);

	}

}
