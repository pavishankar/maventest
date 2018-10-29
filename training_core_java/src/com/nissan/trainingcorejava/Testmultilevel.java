package com.nissan.trainingcorejava;


class Animals1{

	void voice()
	{
		System.out.println("making sounds...");
	}
}

class Lions1 extends Animals1
{
	void roar() {
		
		System.out.println("Lion is roaring...");
	}
}

class Dogs extends Lions1
{
	void weep()
	{
		System.out.println("Cries..... :'( ");
	}
}




public class Testmultilevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dogs ob= new Dogs();
		ob.voice();
		ob.roar();
		ob.weep();

	}

}
