/*
 * Search page we located all identifiers 
 */
package com.test.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class SearchPage {
	@BeforeMethod
	public void setUp()
	{
		System.out.println("Before method is running.");
	}
	@Test
	public void test()
	{
		System.out.println("Test method is running.");
	}
	@AfterMethod
	public void endTest()
	{
		System.out.println("After method is running.");
	}

}
