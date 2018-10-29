package com.nissan.trainingcorejava;

public class Employeesearch {

	public static void main(String[] args) {
		
		String names[]= {"arjun","rahul","midhun","navajyoth"};
		String search="midhun";
		int i=0;
		if(names[i++]==search && i<4)
		  System.out.println("name found at "+i+" position");
		else if (names[i++]==search&& i< 4)
			System.out.println("name found at "+i+" position");
		else if (names[i++]==search&& i< 4)
			System.out.println("name found at "+i+" position");
		else if (names[i++]==search&& i< 4)
			System.out.println("name found at "+i+" position");
		else
		{
			System.out.println("name not found");
		}
			


	}

}
