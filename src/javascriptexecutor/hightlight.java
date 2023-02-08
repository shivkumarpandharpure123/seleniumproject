package javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class hightlight {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Shivkumar\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe\\");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	WebElement Name=driver.findElement(By.xpath("//img[@class=\"fb_logo _8ilh img\"]"));
//	JavascriptExecutor Js  = (JavascriptExecutor) driver;
//	
//	Js.executeScript("arguments[0].style.border = '10px solid orange'", Name);
	Hightlight(Name,driver);
	
}

public static void Hightlight(WebElement Element, WebDriver driver) {
	
JavascriptExecutor Js  = (JavascriptExecutor) driver;
	
	Js.executeScript("arguments[0].style.border = '10px solid orange'", Element);

}
}