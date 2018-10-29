package com.nissan.trainingcorejava;

public class Studentdetails2 {

	int id;
	String name;
	
   public Studentdetails2(int id, String name ) {
	   
	   this.id=id;
	   this.name=name;
	   
	   //this keyword is used to reference the current object
   }
   public void display()
   {
	   System.out.println(id+"\n"+name);
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Studentdetails2 ob=new Studentdetails2(12, "Raju");
		ob.display();
	}

}
