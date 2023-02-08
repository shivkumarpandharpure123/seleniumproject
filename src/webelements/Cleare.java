package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cleare {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Shivkumar\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	Thread.sleep(10000);
	driver.findElement(By.xpath("//input[@class=\"inputtext _55r1 _6luy\"]")).sendKeys("shiv@123");
	driver.findElement(By.xpath("//input[@class=\"inputtext _55r1 _6luy\"]")).clear();
	driver.findElement(By.xpath("//input[@name=\"pass\"]")).sendKeys("12345");
	Thread.sleep(10000);
	driver.findElement(By.xpath("//input[@name=\"pass\"]")).clear();
	//driver.close();
	
}
}
