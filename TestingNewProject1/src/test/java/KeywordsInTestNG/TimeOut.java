package KeywordsInTestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TimeOut {
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
	
	@Test (timeOut = 3000)// 3 sec
	public void testB() throws InterruptedException
	{
		System.out.println("test B");
		Thread.sleep(5000);
		System.out.println("Hi");
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

