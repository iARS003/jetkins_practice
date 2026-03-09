package com.naruto;

public class Ninja 
{
	String power;
	Ninja(String power)
	{
		this.power=power;
	}
	public static void main(String [] args)
	{
		Ninja naruto = new Ninja("Sage Mode");
		
		if ("Sage Mode".equals(naruto.power))
			System.out.println("Naruto use wind style rasengan shuriken.");
		
	}
}
