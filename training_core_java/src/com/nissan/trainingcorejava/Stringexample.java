package com.nissan.trainingcorejava;

class Stringsuperclass
{
	String arr[]= {"Rahul","Raju","Pavi","Gouri","Pavi","Arjun","Devi","Pavi"};
	
}

public class Stringexample extends Stringsuperclass {
	
	void change()
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].equals("Pavi"))
			{
				arr[i]+="23";
			}
		}
	}
	
	void disp()
	{
		for(int i=0;i<arr.length;i++)
		{
		   System.out.println(arr[i]);
		}

	}
	public static void main( String[] args)
	{
		 Stringexample obj= new Stringexample();
		 obj.change();
		 obj.disp();
	}
	

}
