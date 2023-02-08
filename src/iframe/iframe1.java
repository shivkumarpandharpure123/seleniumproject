package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe1 {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Shivkumar\\\\Downloads\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
	
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
	driver.switchTo().frame("iframeResult");
	driver.findElement(By.xpath("//button[@type=\"button\"]")).click();
	Thread.sleep(3000);
	driver.switchTo().defaultContent();
	 driver.findElement(By.xpath("//a[@id=\"tryhome\"]")).click();
	 Thread.sleep(3000);
      driver.quit();
	
	

	}

}
