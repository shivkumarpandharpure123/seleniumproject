package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage2 {
	
	@FindBy(xpath="//input[@type=\"password\"]")
	WebElement piN;

	

public loginpage2(WebDriver driver) {
	PageFactory.initElements(driver, piN);
}

public void pin() {
	piN.sendKeys("Pin-111000");
	
}



}
