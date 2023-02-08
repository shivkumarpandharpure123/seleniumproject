package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleclick {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Shivkumar\\eclipse-workspace\\4th even\\src\\Variables\\selenium project\\4june\\chromedriver.exe");
	
	   WebDriver driver = new ChromeDriver();
				
	   driver.manage().window().maximize();
				
	   driver.get("https://demo.guru99.com/test/simple_context_menu.html");
				
	   Thread.sleep(4000);
	   
	  WebElement Double= driver.findElement(By.xpath("//button[text()=\"Double-Click Me To See Alert\"]"));
	  
	  Actions act=new Actions(driver);
	  
	  act.doubleClick(Double).build().perform();
	  driver.switchTo().alert().accept();
	  
	  driver.close();
	  
}
}
