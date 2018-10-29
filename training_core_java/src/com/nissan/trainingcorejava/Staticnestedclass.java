package com.nissan.trainingcorejava;



public class Staticnestedclass {

	static int abc=100;
	int ab=10;
	static class Inner
	{
		void check() {
			if(abc==100)
			{
				System.out.println("Number is 100");
			}
		/*	if(ab==10)
				System.out.println(" Variable is not static"); */
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Staticnestedclass.Inner ob=new Staticnestedclass.Inner();
		ob.check();
		
	

	}

}
