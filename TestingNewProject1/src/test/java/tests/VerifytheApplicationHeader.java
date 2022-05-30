package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pomPack.HomePage;
import pomPack.LoginPage;

public class VerifytheApplicationHeader {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AKASH\\Desktop\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		driver.get("https://www.facebook.com/");

        LoginPage loginPage = new LoginPage(driver);
        loginPage.sendUserName();
        loginPage.sendPasswordName();
        loginPage.clickOnLogin();
        
        //  OR
        //loginPage.loginToFacebook();
        
        HomePage homePage = new HomePage(driver);
        Thread.sleep(2000);
        homePage.clickOnMarketplace();
//        
//        String url = driver.getCurrentUrl();
//        String title = driver.getTitle();
//        
//        System.out.println(url);
//        System.out.println(title);
//        
//        if(url.equals("https://www.facebook.com/marketplace/?ref=app_tab") && title.equals("Marketplace"))
//        {
//            System.out.println("PASS");
//        }
//        
//        else
//        {
//            System.out.println("FAIL");
//        }
        
        Thread.sleep(5000);
        homePage.clickOnGroup();
        String url1 = driver.getCurrentUrl();
        String title1 = driver.getTitle();
         
        System.out.println(url1);
        System.out.println(title1);
        if(url1.equals("https://www.facebook.com/groups/feed/") && title1.equals("Groups"))
        {
            System.out.println("PASS");
        }
        
        else
        {
            System.out.println("FAIL");
        }
        
        Thread.sleep(2000);
        homePage.clickOnYourprofile();
        Thread.sleep(2000);
        homePage.clickOnLogout();
	}


}
