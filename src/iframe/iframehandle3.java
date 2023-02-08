package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframehandle3 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Shivkumar\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe\\");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.automationtesting.in/Frames.html");
	driver.manage().window().maximize();
	Thread.sleep(10000);
	driver.findElement(By.xpath("//a[contains(text(),\"Iframe with in an Iframe\")]")).click();
	WebElement outerframe=driver.findElement(By.xpath("//div[@id=\"Multiple\"]//iframe"));
	driver.switchTo().frame("outerframe");
	WebElement innerframe= driver.findElement(By.xpath("html/body/section/div/div/iframe"));
	driver.switchTo().frame("innerframe");
	driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("welcome");
	driver.switchTo().defaultContent();
	driver.findElement(By.xpath("//a[contains(text(),'WebTable')]")).click();
	
	
	
	
	
	
}
}