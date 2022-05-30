package testNGAssertions;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HardAssert {

	@BeforeClass
	public void beforeClass() {
		System.out.println("beforeClass");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("beforeMethod");
	}
	
	@Test
	public void testA() {
		//Actual==Expected
		//True-> Pass   ;  False-> Failed
		//Assert.assertEquals(url,"https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login" ,"task link is not working" );//we have to write like this original
		Assert.assertEquals("hello","hellow" , "task link is not working");
	}
	@Test
	public void testB() {
		//Actual==Expected
		//False-> Pass  ;  True->Failed
		Assert.assertNotEquals("hi", "himself");
	}
	
	@Test
	public void testC() {
		//boolean result = url.equals("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login"); //we have to write like this original
		//result= True -> Pass   ; result=False -> Failed
		//Assert.assertTrue(result);
		
		//result = False-> Pass   result = True->Failed
		//Assert.assertFalse(result);
		
		//Failed the test case forcefully
		//Assert.fail();
	}
	
	    
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("afterMethod");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("afterClass");
	}
}
	