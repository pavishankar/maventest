package com.nissan.trainingcorejava;

public class Javainnerclass {
	
	private int datevalue=100;
	class Inner{
		
		// Member inner class : Created outside any methods
		void message()
		{
			System.out.println(" Inner class value : "+datevalue);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Javainnerclass ob=new Javainnerclass();
		Javainnerclass.Inner obj=ob.new Inner();
		obj.message();

	}

}
