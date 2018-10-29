package com.nissan.trainingcorejava;


class Animals2{

	void voice()
	{
		System.out.println("making sounds...");
	}
}

class Lions2 extends Animals2
{
	void roar() {
		
		System.out.println("Lion is roaring...");
	}
}

class Dogs1 extends Animals2
{
	void weep()
	{
		System.out.println("Cries..... :'( ");
	}

	public void roar() {
		// TODO Auto-generated method stub
		
	}
}





public class Testhierarchical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dogs1 ob= new Dogs1();
		ob.voice();
		ob.roar();
		ob.weep();

	}

}
