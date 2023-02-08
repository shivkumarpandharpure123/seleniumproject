package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MOUSEOVER1 {

	public static void main(String[] args) throws InterruptedException {

		   System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Shivkumar\\\\Downloads\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
			
		   WebDriver driver = new ChromeDriver();
					
		   driver.manage().window().maximize();
					
		   driver.get("https://www.flipkart.com/");
					
		   Thread.sleep(4000);
		   
		   driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
		   Thread.sleep(4000);
		   WebElement login=driver.findElement(By.xpath("//a[text()=\"Login\"]"));
		   WebElement more=driver.findElement(By.xpath("//a[text()=\"Login\"]"));
		   Actions action=new Actions(driver);

		 //  action.moveToElement(login).build().perform();
		   action.moveToElement(more).build().perform();

	}

}
