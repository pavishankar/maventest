package com.nissan.trainingcorejava;

class Employee1
{
	int id;
	String name;
	long mobile;
	
	void read()
	{
		this.id=2;
		this.name="world";
		this.mobile=99999;
	}
	void disp()
	{
		System.out.println(this.id+"  "+this.name+" "+this.mobile);
	}
}
class Employeedetails extends Employee1
{
	void read()
	{
		this.id=1;
		this.name="hello";
		this.mobile=12345;
		
	}
	void disp()
	{
		System.out.println(this.id+"  "+this.name+" "+this.mobile);
	}
}
public class Employeeoverride {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee1 e=new Employee1();
		e.read(); // invoking parent class read
		e.disp();
		Employee1 e1=new Employeedetails();
		e1.read(); // invoking subclass read
		e1.disp();
	}

}
