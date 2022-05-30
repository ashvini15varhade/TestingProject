package KeywordsInTestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DependsOnMethods {
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("beforeClass");
	}
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("beforeMethod");

	}
	//AND
	
	@Test (dependsOnMethods = {"testA","testC"})
	public void testB()
	{
		System.out.println("test B");
	}
	@Test 
	public void testA()
	{
		System.out.println("test A");
	}
	@Test 
	public void testC()
	{
		System.out.println("test C");
	}
	@AfterMethod()
	public void afterMethod()
	{
		System.out.println("afterMethod");

	}
	@AfterClass()
	public void afterClass()
	{
		System.out.println("afterClass");

	}

}

