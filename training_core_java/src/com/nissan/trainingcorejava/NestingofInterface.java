package com.nissan.trainingcorejava;

interface Writable
{
	void write();
	interface Readable
	{
		void read();
	}
}

public class NestingofInterface implements Writable.Readable,Writable{
	
	public void read()
	{
		System.out.println("I'm Reading...");
	}
	public void write()
	{
		System.out.println("I'm writing...");
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Writable.Readable n=new NestingofInterface();
		Writable obj=new NestingofInterface();
		n.read();
		obj.write();

	}

}
