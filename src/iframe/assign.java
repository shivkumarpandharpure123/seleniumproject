package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assign {
	

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Shivkumar\\\\Downloads\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
	
	WebDriver driver= new ChromeDriver();
	
	driver.get( "https://demoqa.com/frames");
	Thread.sleep(3000);
	
	
	driver.switchTo().frame("frame1");
	Thread.sleep(3000);
	d
	
	
	String text =driver.findElement(By.xpath("//h1[@id=\"sampleHeading\"]")).getText();
	System.out.println(text);
	
	driver.quit();
	
	
	

	
	
	
	

	
	
	

	}
}