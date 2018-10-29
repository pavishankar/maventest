package com.nissan.trainingcorejava;

 class Adder{
	
	public static int add(int a , int b) {
		
		return a+b;
	}
	public static int add(int a , int b,int c) {
		
		return a+b+c;		
	}
}
public class Addmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Adder.add(1, 2));
		System.out.println(Adder.add(1, 2, 3));
	}

}
