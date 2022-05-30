package testNGAssertions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SoftAssert {
//	
//		SoftAssert s;
//		@BeforeClass
//		public void beforeClass() {
//			System.out.println("beforeClass");
//		}
//		
//		@BeforeMethod
//		public void beforeMethod() {
//			System.out.println("beforeMethod");
//		}
//		
////		@Test
////		public void testA() {
////			s = new SoftAssert();
////			System.out.println("test A");
////			
////			s.assertEquals("Bye","Byef");
////			s.assertAll();
////		}
//	//	
////		@Test
////		public void testB() {
//		    
////			s = new SoftAssert();
////			System.out.println("test B");
////			s.assertEquals("hi","hiww" );
////			s.assertAll();
//
////		}
//		@Test
//		public void testC() {
//			SoftAssert m = new SoftAssert();
//			System.out.println("test C");
//			m.assertEquals("hello","hellow" );
//			m.assertEquals("class","class" );
//			m.assertEquals("velocity","velocity" );
//			//m.assertAll();
//			
//			
//		}
//		
//		private void assertEquals(String string, String string2) {
//			// TODO Auto-generated method stub
//			
//		}
//
//		@AfterMethod
//		public void afterMethod() {
//			System.out.println("afterMethod");
//		}
//		
//		@AfterClass
//		public void afterClass() {
//			System.out.println("afterClass");
//		}
//
//	}
	public class SoftAssertion {
		SoftAssert s;
		@BeforeClass
		public void beforeClass() {
			System.out.println("beforeClass");
		}
		
		@BeforeMethod
		public void beforeMethod() {
			System.out.println("beforeMethod");
		}
		
//		@Test
//		public void testA() {
//			s = new SoftAssert();
//			System.out.println("test A");
//			
//			s.assertEquals("Bye","Byef");
//			s.assertAll();
//		}
	//	
//		@Test
//		public void testB() {
		    
//			s = new SoftAssert();
//			System.out.println("test B");
//			s.assertEquals("hi","hiww" );
//			s.assertAll();
}
	
	@Test
	public void testC() {
		SoftAssert m = new SoftAssert();
		System.out.println("test C");
		///m.assertEquals("hello","hellow" );
		///m.assertEquals("class","class" );
		///m.assertEquals("velocity","velocity" );
		///m.assertAll();
		
		
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
