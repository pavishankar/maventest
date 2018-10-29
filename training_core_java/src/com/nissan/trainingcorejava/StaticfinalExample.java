package com.nissan.trainingcorejava;

class student5{
	
	final String name[]= {"Raju","Ramu","Abu","Devi","Pappu"};
}

class Substudent extends student5{
	
	static final  String value="hello";
	 Substudent(){
		super.name[5]=value;
	}
	
	void disp()
	{
		for(int i=0;i<6;i++)
		System.out.println(super.name[i]);
	}
}

public class StaticfinalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Substudent obj=new Substudent();
		obj.disp();
		

	}

}
