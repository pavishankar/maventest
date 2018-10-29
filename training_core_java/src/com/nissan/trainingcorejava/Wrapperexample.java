package com.nissan.trainingcorejava;

public class Wrapperexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=10;
		Integer i=new Integer(x);
		Integer k= Integer.valueOf(x);
		Integer j=x; // autoboxing
		
		System.out.println(x+" "+i+" "+j+" "+k);
		
		
		Integer a= new Integer(3);
		int y=a.intValue();
		int z=a;
		System.out.println(a+" "+y+" "+z);
		

	}

}
