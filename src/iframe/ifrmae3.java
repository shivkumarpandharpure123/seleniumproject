package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ifrmae3 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Shivkumar\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe\\");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.automationtesting.in/Frames.html");
	driver.manage().window().maximize();
	Thread.sleep(10000);
	driver.switchTo().frame("singleframe");
	driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("welcome");
	driver.switchTo().defaultContent();
	driver.findElement(By.xpath("//a[contains(text(),'WebTable')]")).click();
	
	
}
}
