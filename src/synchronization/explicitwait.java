package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitwait {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Shivkumar\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe\\");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.redbus.in/");
	driver.manage().window().maximize();
	WebElement src=driver.findElement(By.xpath("//input[@id=\"src\"]"));

	WebElement dest=driver.findElement(By.xpath("//input[@id=\"dest\"]"));
	//RedBusWait(driver,src,"pune");
	RedBusWait(driver,dest,"mumbai");
}

public static void RedBusWait(WebDriver driver, WebElement element,String value) {
	
	new WebDriverWait(driver,Duration.ofMinutes(20)).
	until(ExpectedConditions.visibilityOf(element));
	element.sendKeys("mumbai");
	
	
	
}
}
