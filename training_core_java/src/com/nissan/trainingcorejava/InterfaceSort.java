package com.nissan.trainingcorejava;

interface sorts{
	void swap(int i,int j);
	void sort();
	void disp();
	
}

public class InterfaceSort implements sorts {
	int a[]= {1,5,1,3,10,4,19,2};
	public void swap(int i,int j)
	{
		int t=a[i];
		a[i]=a[j];
		a[j]=t;
	}
	public void sort()
	{
		for(int i=0;i<a.length;i++)
			for(int j=i+1;j<a.length;j++)
				if(a[i]>a[j])
					this.swap(i,j);
	}
	public void disp()
	{
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InterfaceSort obj= new InterfaceSort();
		obj.disp();
		
		System.out.println("After Sorting...");
		
		obj.sort();
		obj.disp();
	
	}

}
