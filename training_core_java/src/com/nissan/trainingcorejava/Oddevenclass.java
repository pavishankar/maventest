package com.nissan.trainingcorejava;
import java.util.*;

public class Oddevenclass {
	
	private int arr[]=new int[100];
	int limit;
	Scanner sc=new Scanner(System.in);
	void read()
	{
		System.out.println("Enter the limit");
		limit=sc.nextInt();
		System.out.println("Enter the numbers");
		for(int i=0;i<limit;i++)
		{
			arr[i]=sc.nextInt();
		}
	}
	
	void split()
	{
		class Innerclass{
			int odd[]=new int[100],even[]=new int[100],olimit=0,elimit=0;
			void divide()
			{
				for(int i=0;i<limit;i++)
				{
				 if(arr[i]%2==0)
				 {
					 even[elimit++]=arr[i];
				 }
				 else
					 odd[olimit++]=arr[i];
				}
			}
			void show()
			{
				System.out.println("\n Original Array");
				for(int i=0;i<limit;i++)
					System.out.println(arr[i]);
				System.out.println("\n Odd Array");
				if(olimit==0)
					System.out.println("No element found");
				else
				for(int i=0;i<olimit;i++)
					System.out.println(odd[i]);
				System.out.println("\n Even Array");
				if(elimit==0)
					System.out.println("No element found");
				else
				for(int i=0;i<elimit;i++)
					System.out.println(even[i]);
			}
			
		}
		
		Innerclass ob=new Innerclass();
		ob.divide();
		ob.show();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Oddevenclass obj=new Oddevenclass();
		obj.read();
		obj.split();

	}

}
