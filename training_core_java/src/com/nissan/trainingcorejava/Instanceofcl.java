package com.nissan.trainingcorejava;

class Parentinstance
{
	void run()
	{
		System.out.println("Parent Class is running...");
	}
}
public class Instanceofcl extends Parentinstance{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Instanceofcl obj=new Instanceofcl();
			if(obj instanceof Parentinstance)
			{
				obj.run();
			}
	}

}
