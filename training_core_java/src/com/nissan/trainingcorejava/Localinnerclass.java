package com.nissan.trainingcorejava;

public class Localinnerclass {

	private int abc=10;
	void message()
	{
		class Localclass   //Local inner class
		{
			void disp()
			{
				System.out.println(abc);
			}
		}
	/*	class Local extends Localclass
		{
			    Inheritance is possibe
		}
		*/
		Localclass abc=new Localclass();
		abc.disp();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Localinnerclass abc=new Localinnerclass();
		abc.message();
	}

}
