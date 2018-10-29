package com.nissan.trainingcorejava;

class Person
{
	String name;
	int age;
	
	Person()
	{
		name="Gouri";
		age=25;
	}
}
class Salary extends Person
{
	double sal,pre_sal;
	String emp_name;
	Salary()
	{
		sal=45000;
		emp_name=super.name;
	}
	void updateSal()
	{
		pre_sal=sal;
		sal+=sal*super.age/100;
	}
	void disp()
	{
		System.out.println(emp_name+"   "+age+"  "+pre_sal+"  "+sal);
	}
}
public class Employeesalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Salary obj=new Salary();
		obj.updateSal();
		obj.disp();
	}

}
