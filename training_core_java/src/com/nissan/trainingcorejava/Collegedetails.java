package com.nissan.trainingcorejava;

class College
{
	String collegename;
	long  contact;
	void readstudentdetails()
	{
		this.collegename="abc";
		this.contact=111111;
		
	}
}

class Students extends College
{
	String name;
	void read()
	{
		this.name="helloo";
	}
	void disp()
	{
		System.out.println(name+"  "+collegename+"  "+contact+" ");
	}
}

class Teachers extends Students
{
	String names;
	void reads()
	{
		this.names="rajesh";
	}
	void display()
	{
		System.out.println(names+"  "+name+"  "+collegename+"  "+contact+" ");
	}
}

public class Collegedetails {

	public static void main(String[] args) {
		
    Teachers obj= new Teachers();
    obj.readstudentdetails();
    obj.read();
    obj.reads();
    obj.disp();
    obj.display();
	}

}
