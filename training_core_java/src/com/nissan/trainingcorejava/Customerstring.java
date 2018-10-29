package com.nissan.trainingcorejava;

import java.util.Random;
import java.util.Scanner;

public class Customerstring {
	
static String cus[]=new String[100];
static int limit=0;

static void add()
{
	String name;
	Random rand=new Random();
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the name...");
	name=sc.next();
	if(limit!=0)
	{ 
		
		while(true)
		{
			int flag=1;
		for(int i=0;i<limit;i++)
		{
			if(cus[i].equals(name))
					{
						System.out.println("Name Already Exists..");
						System.out.println("Try  \n"+name+""+(rand.nextInt(9999) ));
						System.out.println(name+""+(rand.nextInt(9999)));
						System.out.println("Enter a New Name..");
						name=sc.next().trim();
						flag=0;
					}
		}
			if(flag==1)
			{
			break;
			}
		
		
		}
	}
	/*int index=-1;
	System.out.println("Enter the index at which name is to be added... ( -1 if anywhere ) Also index must be less than "+limit);
	index=sc.nextInt();
	if(index>limit) {
		System.out.println("Index greater than limit");*/
	cus[limit++]=name;
    System.out.println(name+"  Successfully added at  "+ (limit) +" position");
	
	sc.close();
}
static void del()
{
	if(limit==0)
	{
		System.out.println("No Customer Exist to delete");
	}
	else
	{
	String name;
	int id=-1;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the name to be deleted...");
	name=sc.next();
	for(int i=0;i<limit;i++)
		{
		if(cus[i].equals(name))
		{
			id=i;
			break;
		}
		}
	if(id==-1)
		System.out.println("No such Customer...");
	else
		{
		System.out.println("\n Customer Found at "+(id+1)+" position");
		if(id==limit-1)
			limit=limit-1;
		else {
			cus[id]=cus[limit-1];
			limit=limit-1;}
		System.out.println("Successfully deleted "+name);
		}
	sc.close();
	}
}

static void edit()
{
	if(limit==0)
	{
		System.out.println("No Customer Exists to Edit");
	}
	else
	{
	String name,lname;
	int id=-1;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the name to be edited...");
	name=sc.next();
	for(int i=0;i<limit;i++)
		{
		if(cus[i].equals(name))
		{
			id=i;
			break;
		}
		}
	if(id==-1)
		System.out.println("No such Customer...");
	else
		{
		int choice=0;
		System.out.println("\n Customer Found at "+(id+1)+" position");
		do {
		System.out.println("\n1.Add/Edit Last Name");
		System.out.println("2.Edit First Name");
		System.out.println("3.Exit");
		
		System.out.println("\n Enter a choice : ");
		choice=sc.nextInt();
		if(choice==1)
		{
			System.out.println("Enter the last Name : ");
			lname=sc.next();
			
			int ind=cus[id].indexOf(' ');
			if(ind==-1)
			{
				cus[id]=cus[id].concat(" "+lname);
			}
			
			else
			{
				cus[id]=cus[id].substring(0, ind)+" "+lname;
			}
			
			System.out.println("\n New Name is : "+cus[id]);
		}
		else if(choice==2)
		{
			String nname;
			System.out.println("Enter the New First Name");
			nname=sc.next();
			int ind=cus[id].indexOf(' ');
			if(ind==-1)
			{
				cus[id]=nname;
			}
			else
			{
				cus[id]=nname+cus[id].substring(ind, cus[id].length());
			}
			System.out.println("\n New Name is : "+cus[id]);
			
		}
		else if(choice==3)
		{
			System.out.println("Taaata.... Have a Nice Day");
		}
		else
		{
			System.out.println("Invalid Choice..");
		}
		}while(choice!=3);
		
		
		
		}
	sc.close();
	}

}

static void view()
{
	if(limit<1)
		System.out.println("No Customers Found");
	else	
	{
		for(int i=0;i<limit;i++)
		 {
			 for(int j=0;j<limit-i-1;j++)
			 {
				 if(cus[j].compareTo(cus[j+1]) >0)
				 {
					 String temp=cus[j];
					 cus[j]=cus[j+1];
					 cus[j+1]=temp;
					 
				 }
			 }
		 }
	for(int i=0;i<limit;i++)
	{
		System.out.println(cus[i]);
	}
	}
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		int choice;
		do {
			
			System.out.println("\n 1.Add a Customer ");
			System.out.println(" 2.Delete a Customer ");
			System.out.println(" 3.Edit a Customer ");
			System.out.println(" 4.View all Customers");
			System.out.println(" 5.Exit");
			System.out.println("Enter a Choice : ");
			choice=sc.nextInt();
			
			if(choice==1)
				add();
			else if(choice==2)
				del();
			else if(choice==3)
				edit();
			else if(choice==4)
				view();
			else if(choice==5)
				System.out.println("Taaata.... Have a Nice Day");
			else
				System.out.println("Invalid Choice..");			
		}while(choice!=5);

		sc.close();
	}

}
