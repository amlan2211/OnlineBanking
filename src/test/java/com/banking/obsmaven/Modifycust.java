package com.banking.obsmaven;

import org.testng.annotations.Test;

public class Modifycust 
{
	@Test(groups = "smoke")
	public void modifycust()
	{
		System.out.println("modify cust---");
	}
	@Test(groups = "regression")
	public void deletecust()
	{
		System.out.println("delete cust--");
	}

}
