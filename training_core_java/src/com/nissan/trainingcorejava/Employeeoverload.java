package com.nissan.trainingcorejava;


class Employee
{
	int id;
	long mobile;
	String name;
	double salary;
	int age;
	public Employee(int id,long mobile,String name,double salary,int age)
	{
		this.id=id;
		this.mobile=mobile;
		this.name=name;
		this.salary=salary;
		this.age=age;
		add(this.age,this.salary);
		add(this.age,this.salary,this.mobile);
	}
	 void add(int age,double salary )
	{
		System.out.println(age+salary);
	}
	 void add(int age,double salary,long mobile)
	{
		System.out.println(age+salary+mobile);
	}
}
public class Employeeoverload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Employee(101,12345,"hello",20000,30);
	}

}
