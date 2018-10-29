package com.nissan.trainingcorejava;

interface palin{
	void reverse( int a);
	interface palindr{
		void check(int a,int b);
	}
}

public class Palindromeinterface implements palin.palindr,palin {
	public void reverse( int a)
	{
		int d=0,copy=a;
		while(a!=0)
		{
			int r=a%10;
			d=d*10+r;
			a=a/10;
		}
		check(copy,d);
	}
	public void check(int a ,int b)
	{
		if(a==b)
			System.out.println("Number is Palindrome");
		else
			System.out.println("Number is not Palindrome");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		palin ob=new Palindromeinterface();
		ob.reverse(101);
		Palindromeinterface obj=new Palindromeinterface();
		obj.reverse(100);
		

	}

}
