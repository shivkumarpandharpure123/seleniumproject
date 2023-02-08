package locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssselector {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Shivkumar\\eclipse-workspace\\4th even\\src\\Variables\\selenium project\\4june\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("https://www.facebook.com/login");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	driver.navigate().back();
	driver.navigate().forward();
	driver.navigate().refresh();
	// if id and tagname present
	driver.findElement(By.cssSelector("#username")).sendKeys("shiv@123");
	driver.findElement(By.cssSelector("#password")).sendKeys("12346");
	driver.findElement(By.cssSelector("#email")).sendKeys("shiv@123");
	driver.findElement(By.cssSelector("#pass")).sendKeys("1234");
	driver.findElement(By.cssSelector("input#email")).sendKeys("1234@123");
	driver.findElement(By.cssSelector("input#pass")).sendKeys("shiv123");
   Thread.sleep(3000);
   driver.close();
   

}
}
