package pomPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy (xpath = "//input[@id='email']")
    private WebElement userName ;
    
	@FindBy (xpath = "//input[@name='pass']")
    private WebElement password ;
	
	@FindBy (xpath = "//button[text()='Log In']")
    private WebElement loginButton ;
	
	public LoginPage(WebDriver driver)
    {
    	PageFactory.initElements(driver,this);
    	
    }
    
    public void sendUserName() {
    	userName.sendKeys("7721952264");
    }
    public void sendPasswordName() {
    	password.sendKeys("19961115");
    }
   
    public void clickOnLogin() {
    	loginButton.click();
    }
    
    //OR
    
//    public void loginToActitime() {
//    	userName.sendKeys("Admin");
//    	password.sendKeys("manager");
//    	loginButton.click();
    
}



