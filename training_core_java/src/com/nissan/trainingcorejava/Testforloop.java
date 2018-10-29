package com.nissan.trainingcorejava;

public class Testforloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {10,20,30,10,20,10,20,20,50,60,10};
	
	for(int i=0;i<=a.length;i++)
	{
		
		int flag=0;
      for(int j=i+1;j<a.length;j++)
      {
    	  
    	  if(a[i]==a[j] && a[i]!=Integer.MAX_VALUE) {
    		  if(flag==0) {
    			  System.out.println("\n\n");
    			  System.out.println(a[i]+"\n"+"********");
    			  System.out.println(i+"  "+ a+ (Integer.toHexString(i*Integer.SIZE)));
    			  flag=1;
    		  		}
    	
    		System.out.println(j+"  "+ a+(Integer.toHexString(j*Integer.SIZE)));
    		a[j]=Integer.MAX_VALUE;
    		
    	  }
      }

	}
	
}
}