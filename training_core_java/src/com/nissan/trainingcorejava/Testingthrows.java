package com.nissan.trainingcorejava;

import java.io.IOException;

public class Testingthrows {
	
	void master() throws IOException
	{
		throw new IOException("Error has occured");
	}
	void notmaster() throws IOException{
		
		master();
	}

	void puremaster()
	{
		try {
			notmaster();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Testingthrows ob=new Testingthrows();
		ob.puremaster();
	}

}
