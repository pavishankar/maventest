package com.nissan.trainingcorejava;

class Counter
{
		int count;
		Counter()
		{
			count=0;
		}
		
		void disp()
		{
			System.out.println("Count = "+count);
		}
		
}

class Subcounter extends Counter{
	
	void counter()
	{
		String a[]= {"Rahul","Raju","Pavi","Gouri","Pavi","Arjun","Devi","Pavi"};
		for(int i=0;i<a.length;i++)
		{
			if(a[i].equals("Pavi"))
			{
				super.count++;
			}
		}
		
		disp();
	}
	
}

public class CounterExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
      Subcounter s=new Subcounter();
      s.counter();
	}

}
