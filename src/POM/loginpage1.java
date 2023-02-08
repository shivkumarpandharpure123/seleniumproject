package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage1 {
	
	@FindBy(xpath="//input[@id=\"userid\"]") 
	private WebElement Username;
	

	@FindBy(xpath="//input[@id=\"password\"]") 
	private WebElement password ;
	

	@FindBy(xpath="//input[@id=\"password\"]") 
	private WebElement Login ;
	
	//initialize within constrctor with access level public
	
	public loginpage1(WebDriver driver) {
		PageFactory.initElements(password, driver); 
	}
	
	// create method 
	
	public void username() {
		Username.sendKeys("GP8097");
	}
	public void password() {
		password.sendKeys("gms@0110");
		
	}
	public void  login() {
		Login.click();
		
	}
	
	
	
	
	
	
	
	
	



	}


