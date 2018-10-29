package com.nissan.trainingcorejava;

import java.io.IOException;

class Excepclass
{
	 void msg() throws Exception{};

}

public class Exceptionmethodoverriding extends Excepclass{
	void msg() throws IOException
	{
		throw new IOException("Error found in overrided method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Exceptionmethodoverriding ob=new Exceptionmethodoverriding();
			ob.msg();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
