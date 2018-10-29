package com.nissan.trainingcorejava;

import java.util.Scanner;

public class Largestinnerclass {

	private int limit;
	private int a[]=new int[100];
	void sort()
	{
		for(int i=0;i<limit;i++)
		{
			for(int j=0;j<limit-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
	}
	class Innerclass{
		void largest()
		{
			System.out.println("Largest element is : "+a[limit-1]);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Largestinnerclass ob=new Largestinnerclass();
		Largestinnerclass.Innerclass in=ob.new Innerclass();
		System.out.println("Enter the limit");
		Scanner sc=new Scanner(System.in);
		ob.limit=sc.nextInt();
		System.out.println("Enter the numbers :");
		for(int i=0;i<ob.limit;i++)
			ob.a[i]=sc.nextInt();
		ob.sort();
		in.largest();

	}

}
