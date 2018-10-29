package com.nissan.trainingcorejava;

 interface draw{  // public and abstract by default
	void drawsomething();
}
 
 interface write{
	 void writesomething();
	 default void read()
	 {
		 System.out.println("default methods..");
	 }
 }

public class Interfaceclass implements draw,  write {
	
	public void drawsomething()
	{
		System.out.println("This is a method of interfaces draw..");
	}
	public void writesomething()
	{
		System.out.println("This is a method of interface write..");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interfaceclass obj = new Interfaceclass();
		obj.drawsomething();
		obj.writesomething();
		obj.read();

	}

}
