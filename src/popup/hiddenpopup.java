package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class hiddenpopup{

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shivkumar\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
		Thread.sleep(3000);
		
		WebElement login=driver.findElement(By.xpath("//a[contains(text(),'Login')]"));
		
//	Actions act=new Actions(driver);
//	
//	act.moveToElement(login).build().perform();
//	driver.findElement(By.xpath("//div[contains(text(),'My Profile')]")).click();
//	
//		driver.close();
		
	}

}
