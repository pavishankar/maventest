package com.nissan.trainingcorejava;

public class Stringbufferex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer sb= new StringBuffer();
		for(int i=0;i<1000;i++)
		{
			System.out.println(sb.capacity());
			sb.append("helllloooo00000000000000");
		}

	}

}
