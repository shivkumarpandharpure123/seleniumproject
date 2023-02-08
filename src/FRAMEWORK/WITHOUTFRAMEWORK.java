package FRAMEWORK;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WITHOUTFRAMEWORK {
@SuppressWarnings("deprecation")
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Shivkumar\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe\\");
	WebDriver driver=new ChromeDriver();
	driver.get("https://kite.zerodha.com/");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("GP8097");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("gms@0110");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("111000");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();

	
	
	
	
}
}
