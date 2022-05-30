package KeywordsInTestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Priority {
//	@BeforeClass
//	public void beforeClass()
//	{
//		System.out.println("beforeClass");
//	}
//	@BeforeMethod
//	public void beforeMethod()
//	{
//		System.out.println("beforeMethod");
//
//	}
//	@Test (priority = 1)
//	public void testA()
//	{
//		System.out.println("test A");
//	}
//	@Test (priority = 2)
//	public void testB()
//	{
//		System.out.println("test B");
//	}
//	@Test (priority = 3)
//	public void testC()
//	{
//		System.out.println("test C");
//	}
//	@AfterMethod()
//	public void afterMethod()
//	{
//		System.out.println("afterMethod");
//
//	}
//	@AfterClass()
//	public void afterClass()
//	{
//		System.out.println("afterClass");
//
//	}
//}
//	System.out.println("*****************************************");
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
	@Test (priority = 2)
	public void testA()
	{
		System.out.println("test A");
	}
	@Test (priority = 1)
	public void testB()
	{
		System.out.println("test B");
	}
	@Test (priority = 3)
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

// priority can be negative lile -1,0,1 OR 1,2,3 OR 0,1,2 

