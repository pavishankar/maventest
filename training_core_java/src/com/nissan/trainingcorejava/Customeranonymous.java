package com.nissan.trainingcorejava;

import java.util.Scanner;

interface Cus
{
	void read();
	void sort();
	void print();
}

public class Customeranonymous {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cus ob=new Cus()
				{
					StringBuffer names[]=new StringBuffer[100];
					int limit;
					Scanner sc=new Scanner(System.in);
					public void read()
					{
						System.out.println("Enter the limit");
						limit=sc.nextInt();
						System.out.println("Enter the names");
						for(int i=0;i<limit;i++)
							names[i]=new StringBuffer(sc.next());
					}
					public void sort() {
						
						for(int i=0;i<limit;i++)
						 {
							 for(int j=0;j<limit-i-1;j++)
							 {
								 if(names[j].toString().compareTo(names[j+1].toString()) <0)
								 {
									 StringBuffer temp=names[j];
									 names[j]=names[j+1];
									 names[j+1]=temp;
									 
								 }
							 }
						 }
					}
					
					public void print()
					{
						
						for(int i=0;i<limit;i++)
							System.out.println(names[i]);
					}
					
				};
				ob.read();
				System.out.println("\n Before Sorting\n");
				ob.print();
				ob.sort();
				System.out.println("\n After Sorting\n");
				ob.print();

	}

}
