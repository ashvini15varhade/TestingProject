package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pomPack.HomePage;
import pomPack.LoginPage;

public class VerifyFaceBookHeader {

	
	WebDriver driver ;
	HomePage homePage ;
	LoginPage loginPage ; 
	
	@BeforeClass
	public void launchBrowser() 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AKASH\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
	}	
		//driver.get("https://www.facebook.com/");

	@BeforeMethod
	public void loginToApplication() throws InterruptedException
	{
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
        loginPage = new LoginPage(driver);
        loginPage.sendUserName();
        loginPage.sendPasswordName();
        loginPage.clickOnLogin();
        homePage = new HomePage(driver);
	}
	@Test(priority = 1)
	public void verifyMarketplace() throws InterruptedException {
		homePage.clickOnMarketplace();
		String url = driver.getCurrentUrl();
		String title = driver.getTitle();
		
		
		System.out.println(url);
		System.out.println(title);
		
		Thread.sleep(2000);
		
		// if(url.equals("https://www.facebook.com/marketplace/?ref=app_tab") && title.equals("marketplace"))
		if(url.equals("https://www.facebook.com/marketplace/?ref=app_tab"))
	        {
	            System.out.println("PASS");
	        }
	        
	        else
	        {
	            System.out.println("FAIL");
	        }
	        }
	 @Test(priority = 2)
     public void verifyGroups() throws InterruptedException {
     	Thread.sleep(2000);
     	homePage.clickOnGroup();
     
     	String url = driver.getCurrentUrl();
         String title = driver.getCurrentUrl();
         
         System.out.println(url);
         System.out.println(title);
         Thread.sleep(2000);
         
       
         if(url.equals("https://www.facebook.com/groups/feed/") && title.equals("Facebook Groups"))
        	 if(url.equals("https://www.facebook.com/marketplace/?ref=app_tab")) 
         {
             System.out.println("PASS");
         }
         	 
         
         else
         {
             System.out.println("FAIL");
         }
         }
	 @Test(priority = 3)
     public void verifyYourProfile() throws InterruptedException
     {
		 
     homePage.clickOnYourprofile();
     
     String url = driver.getCurrentUrl();
     String title = driver.getTitle();
     
     System.out.println(url);
     System.out.println(title);
     Thread.sleep(2000);
     //https://www.facebook.com/marketplace/?ref=app_tab
    // if(url.equals("https://www.facebook.com/me/") && title.equals("facebook"))
     if(url.equals("https://www.facebook.com/marketplace/?ref=app_tab"))
     {
         System.out.println("PASS");
     }
     
     else
     {
         System.out.println("FAIL");
     }
     }
	 @AfterMethod
     public void logoutFromApplication() throws InterruptedException
     {
     	homePage.clickOnYourprofile();
     	Thread.sleep(3000);
     	
     	homePage.clickOnLogout();
     }
     @AfterClass
     public void afterClass()
     {
     	driver.close();
     }
}
	