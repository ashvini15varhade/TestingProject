package pomPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver driver ;
	
	@FindBy (xpath = "//a[@aria-label='Marketplace']")
    private WebElement marketplace ;
	
	 @FindBy (xpath = "//div[@aria-label='Your profile']")
    private WebElement yourprofile ;
	 
	 @FindBy (xpath = "//a[@aria-label='Groups']")
	    private WebElement groups ;
		
    
    @FindBy (xpath = "//span[text()='Log Out']")
    private WebElement logout ;
	////span[text()='Log Out']
	 public HomePage(WebDriver driver)  // driver2 = driver = new ChromeDriver()
		{
			PageFactory.initElements(driver, this);
			this.driver = driver ;
		}
	    
	    public void clickOnMarketplace() {
	    	marketplace.click();
	    }
	    
	    public void clickOnYourprofile() {
	    	yourprofile.click();
	    }
	    
	    public void clickOnGroup() {
	    	groups.click();
	    }
	    public void clickOnLogout() {
	    	Actions act = new Actions(driver);
	    	act.moveToElement(logout).click().perform();
	    	logout.click();
	    }
	
}
