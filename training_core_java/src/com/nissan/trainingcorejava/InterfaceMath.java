package com.nissan.trainingcorejava;

interface maths{
	void add(int a,int b);
	void sub(int a,int b);
	void mul(int a,int b);
	void div(int a,int b);
	default void mod(int a,int b)
	{
		System.out.println("Modulus");
	};
}
public class InterfaceMath implements maths{
	public void add(int a,int b)
	{
		System.out.println(a+b);
	}
	public void sub(int a,int b)
	{
		System.out.println(a-b);
	}
	public void mul(int a,int b)
	{
		System.out.println(a*b);
	}
	
	public void div(int a,int b)
	{
		System.out.println(a/b);
	}
	public void mod(int a,int b)
	{
		System.out.println(a%b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InterfaceMath obj=new InterfaceMath();
		obj.add(10, 10);
		obj.sub(20, 10);
		obj.mul(10, 5);
		obj.div(10, 5);
		obj.mod(20, 10);

	}

}
