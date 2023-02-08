package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage {

	@FindBy(xpath="//span[contains(text(),\"GP8097\")]")
	WebElement UserId;
	
	// initilatize with in constructor of class  acssess level public
	
	public homepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	
	}
	public void useid() {
		String ExpectedUserID  = "GP8097";
		String ActulaUSerID =UserId.getText();
		if(ExpectedUserID.equals(ActulaUSerID)) {
			System.out.println("Valid UserID");
		}
		else
			System.out.println("Invalid UserID");
	}		
		
	}
	
	


